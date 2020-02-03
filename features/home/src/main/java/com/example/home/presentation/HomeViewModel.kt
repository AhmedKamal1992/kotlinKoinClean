package com.example.home.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.common.base.BaseViewModel
import com.example.common.utils.Event
import com.example.home.R
import com.example.home.domain.TopUsersUseCase
import com.example.home.presentation.navigation.HomeFragmentDirections
import com.example.model.User
import com.example.repository.AppDispatchers
import com.example.repository.utils.Resource
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class HomeViewModel (private val useCase: TopUsersUseCase,
                     private val appDispatchers: AppDispatchers): BaseViewModel()
{
    //Getting Data
    private val _users = MediatorLiveData<Resource<List<User>>>()
    val users: LiveData<Resource<List<User>>> get() = _users
    private var userSource: LiveData<Resource<List<User>>> = MutableLiveData()

    init {
        getUsers(false)
    }

    fun userClicksOnItem(user: User) =
        navigate(HomeFragmentDirections.actionHomeFragmentToDetailsFragment(user.login))

    fun userRefreshesItem() = getUsers(true)

    private fun getUsers(forceRefresh: Boolean) = viewModelScope.launch (appDispatchers.main ) {
        _users.removeSource(userSource) // We make sure there is only one source of livedata (allowing us properly refresh)
        withContext(appDispatchers.io) { userSource = useCase(forceRefresh = true) }
        _users.addSource(userSource) {
            _users.value = it
            if (it.status == Resource.Status.ERROR) _snackBarError.value = Event(R.string.an_error_happened)
        }
    }


}


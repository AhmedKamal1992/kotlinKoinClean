package com.example.detail.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.common.base.BaseViewModel
import com.example.common.utils.Event
import com.example.detail.R
import com.example.detail.domain.UserDetailsUseCase
import com.example.model.User
import com.example.repository.AppDispatchers
import com.example.repository.utils.Resource
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class UserDetailsViewModel(private val useCase: UserDetailsUseCase, private val dispatchers: AppDispatchers): BaseViewModel() {

    // PRIVATE DATA
    private lateinit var argsLogin: String
    private var userSource: LiveData<Resource<User>> = MutableLiveData()

    private val _user = MediatorLiveData<User>()
    val user: LiveData<User> get() = _user
    private val _isLoading = MutableLiveData<Resource.Status>()
    val isLoading: LiveData<Resource.Status> get() = _isLoading

    // PUBLIC ACTIONS ---
    fun loadDataWhenActivityStarts(login: String) {
        argsLogin = login
        getUserDetail(false)
    }

    fun reloadDataWhenUserRefreshes()
            = getUserDetail(true)

    fun userClicksOnAvatarImage(user: User)
            = navigate(DetailsFragmentDirections.actionDetailFragmentToImageDetailFragment(user.avatarUrl))

    // ---

    private fun getUserDetail(forceRefresh: Boolean) = viewModelScope.launch(dispatchers.main) {
        _user.removeSource(userSource) // We make sure there is only one source of livedata (allowing us properly refresh)
        withContext(dispatchers.io) { userSource = useCase(forceRefresh = forceRefresh, login = argsLogin) }
        _user.addSource(userSource) {
            _user.value = it.data
            _isLoading.value = it.status
            if (it.status == Resource.Status.ERROR) _snackBarError.value = Event(R.string.an_error_happened)
        }
    }
}
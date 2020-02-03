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
import com.example.repository.utils.Resource
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class HomeViewModel (private val useCase: TopUsersUseCase): BaseViewModel()
{
    //Getting Data
    private val _users = MediatorLiveData<Resource<List<User>>>()
    val users: LiveData<Resource<List<User>>> get() = _users

    init {
        getUsers()
    }

    fun userClicksOnItem(user: User) =
        navigate(HomeFragmentDirections.actionHomeFragmentToDetailsFragment(user.login))

    fun userRefreshesItem() = getUsers()

    private fun getUsers() {
        compositeDisposable.add(useCase.getAllUsers().subscribeOn(Schedulers.io()).
            observeOn(AndroidSchedulers.mainThread()).subscribe{ result ->
            when(result) {
                is Resource.Success -> { _users.value = result }
                is Resource.Error -> { _snackBarError.value = Event(R.string.an_error_happened) }
            }
        })
    }

}


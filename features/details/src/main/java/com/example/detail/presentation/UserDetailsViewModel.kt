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
import com.example.repository.utils.DataSource
import com.example.repository.utils.Resource
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class UserDetailsViewModel(private val useCase: UserDetailsUseCase): BaseViewModel() {

    // PRIVATE DATA
    private lateinit var argsLogin: String

    private val _user = MediatorLiveData<User>()
    val user: LiveData<User> get() = _user
    private val _isLoading = MutableLiveData<Resource<User>>()
    val isLoading: LiveData<Resource<User>> get() = _isLoading

    // PUBLIC ACTIONS ---
    fun loadDataWhenActivityStarts(login: String) {
        argsLogin = login
        getUserDetail()
    }

    fun reloadDataWhenUserRefreshes()
            = getUserDetail()

    fun userClicksOnAvatarImage(user: User)
            = navigate(DetailsFragmentDirections.actionDetailFragmentToImageDetailFragment(user.avatarUrl))

    // ---

    private fun getUserDetail() {
        _isLoading.value = Resource.Loading(DataSource.NETWORK)
        compositeDisposable.add(useCase.getUser(argsLogin).subscribeOn(Schedulers.io()).
            observeOn(AndroidSchedulers.mainThread()).subscribe{ result ->
            when(result) {
                is Resource.Success ->{ _user.value = result.result }
                is Resource.Error -> { _snackBarError.value = Event(R.string.an_error_happened) }
            }
        })
    }
}
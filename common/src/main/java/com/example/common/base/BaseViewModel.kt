package com.example.common.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavDirections
import com.example.common.utils.Event
import com.example.navigation.NavigationCommand

abstract class BaseViewModel: ViewModel() {

    protected val _snackBarError: MutableLiveData<Event<Int>> = MutableLiveData()
    val snackBarError: LiveData<Event<Int>> get() = _snackBarError

    // FOR NAVIGATION
    private val _navigation = MutableLiveData<Event<NavigationCommand>>()
    val navigation: LiveData<Event<NavigationCommand>> = _navigation

    /**
     * Convenient method to handle navigation from a [ViewModel]
     */
    fun navigate(directions: NavDirections) {
        _navigation.value = Event(NavigationCommand.To(directions))
    }
}
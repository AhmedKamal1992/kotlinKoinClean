package com.example.home.domain

import androidx.lifecycle.LiveData
import com.example.model.User
import com.example.repository.utils.Resource
import io.reactivex.Observable

interface TopUsersUseCase {
    fun getAllUsers(): Observable<Resource<List<User>>>
}
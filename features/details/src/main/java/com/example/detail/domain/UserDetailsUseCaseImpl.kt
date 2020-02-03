package com.example.detail.domain

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.model.User
import com.example.repository.UserRepository
import com.example.repository.utils.Resource
import io.reactivex.Observable

class UserDetailsUseCaseImpl (private val repository: UserRepository): UserDetailsUseCase {

    override fun getUser(login: String): Observable<Resource<User>> = repository.getUserDetailsWithCache(login)
}
package com.example.detail.domain

import com.example.model.User
import com.example.repository.utils.Resource
import io.reactivex.Observable

interface UserDetailsUseCase {
    fun getUser(login: String): Observable<Resource<User>>
}
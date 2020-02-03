package com.example.repository

import androidx.lifecycle.LiveData
import com.example.model.User
import com.example.repository.utils.Resource
import io.reactivex.Observable
import io.reactivex.Single

interface UserRepository {
    fun getTopUsersWithCache(): Observable<Resource<List<User>>>
    fun getUserDetailsWithCache(login: String): Observable<Resource<User>>
}
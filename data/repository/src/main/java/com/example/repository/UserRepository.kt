package com.example.repository

import androidx.lifecycle.LiveData
import com.example.model.User
import com.example.repository.utils.Resource

interface UserRepository {
    suspend fun getTopUsersWithCache(forceRefresh: Boolean = false): LiveData<Resource<List<User>>>
    suspend fun getUserDetailsWithCache(forceRefresh: Boolean = false, login: String): LiveData<Resource<User>>
}
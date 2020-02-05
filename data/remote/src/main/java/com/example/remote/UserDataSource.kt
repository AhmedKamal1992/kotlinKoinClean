package com.example.remote

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class UserRemoteDataSource(private val userService: UserService) {

    suspend fun fetchTopUsersAsync() = withContext(Dispatchers.IO) {
        userService.fetchTopUsersAsync()
    }

    suspend fun fetchUserDetailsAsync(login: String) = withContext(Dispatchers.IO) {
        userService.fetchUserDetailsAsync(login)
    }

}
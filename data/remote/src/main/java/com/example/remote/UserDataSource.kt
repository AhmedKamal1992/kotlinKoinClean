package com.example.remote

class UserRemoteDataSource(private val userService: UserService) {

    fun fetchTopUsersAsync() =
        userService.fetchTopUsersAsync()

    fun fetchUserDetailsAsync(login: String) =
        userService.fetchUserDetailsAsync(login)
}
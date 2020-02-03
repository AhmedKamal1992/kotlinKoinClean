package com.example.remote

import io.reactivex.schedulers.Schedulers


class UserRemoteDataSource(private val userService: UserService) {

    fun fetchTopUsersAsync() =
        userService.fetchTopUsersAsync()

    fun fetchUserDetailsAsync(login: String) =
        userService.fetchUserDetailsAsync(login)
}
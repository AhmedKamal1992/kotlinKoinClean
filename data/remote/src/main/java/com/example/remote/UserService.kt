package com.example.remote

import com.example.model.User
import com.example.model.ApiResult
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface UserService {

    @GET("search/users")
    suspend fun fetchTopUsersAsync(
        @Query("q") query: String = "AhmedKamal1992",
        @Query("sort") sort: String = "followers"
    ): ApiResult<User>

    @GET("users/{login}")
    suspend fun fetchUserDetailsAsync(@Path("login") login: String): User
}
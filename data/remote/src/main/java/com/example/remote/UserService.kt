package com.example.remote

import com.example.model.User
import io.philippeboisney.model.ApiResult
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface UserService {

    @GET("search/users")
    fun fetchTopUsersAsync(@Query("q") query: String = "AhmedKamal1992",
                           @Query("sort") sort: String = "followers"): Deferred<ApiResult<User>>

    @GET("users/{login}")
    fun fetchUserDetailsAsync(@Path("login") login: String): Deferred<User>
}git br
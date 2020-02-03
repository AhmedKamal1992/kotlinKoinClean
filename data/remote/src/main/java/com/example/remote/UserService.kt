package com.example.remote

import com.example.model.User
import com.example.model.ApiResult
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface UserService {

    @GET("search/users")
    fun fetchTopUsersAsync(@Query("q") query: String = "PhilippeB",
                           @Query("sort") sort: String = "followers"): Single<ApiResult<User>>

    @GET("users/{login}")
    fun fetchUserDetailsAsync(@Path("login") login: String): Single<User>
}
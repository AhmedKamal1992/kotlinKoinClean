package com.example.repository

import androidx.lifecycle.LiveData
import com.example.local.dao.UserDao
import com.example.model.User
import com.example.remote.UserRemoteDataSource
import com.example.repository.utils.NetworkBoundResource
import com.example.repository.utils.Resource
import com.example.model.ApiResult

class UserRepositoryImpl(
    private val dataSource: UserRemoteDataSource,
    private val dao: UserDao
) : UserRepository {

    override suspend fun getTopUsersWithCache(forceRefresh: Boolean): LiveData<Resource<List<User>>> {
        return object : NetworkBoundResource<List<User>, ApiResult<User>>() {

            override fun processResponse(response: ApiResult<User>): List<User> {
                return response.items
            }

            override suspend fun saveCallResults(items: List<User>) {
                dao.save(items)
            }

            override fun shouldFetch(data: List<User>?): Boolean =
                data == null || data.isEmpty() || forceRefresh

            override suspend fun loadFromDb(): List<User> {
                return dao.getTopUsers()
            }

            override suspend fun createCallAsync(): ApiResult<User> =
                dataSource.fetchTopUsersAsync()

        }.build().asLiveData()
    }

    override suspend fun getUserDetailsWithCache(
        forceRefresh: Boolean,
        login: String
    ): LiveData<Resource<User>> {

        return object : NetworkBoundResource<User, User>() {

            override fun processResponse(response: User): User = response

            override suspend fun saveCallResults(item: User) = dao.save(item)

            override fun shouldFetch(data: User?): Boolean = data == null
                    || data.haveToRefreshFromNetwork()
                    || data.name.isNullOrEmpty()
                    || forceRefresh

            override suspend fun loadFromDb(): User = dao.getUser(login)

            override suspend fun createCallAsync(): User = dataSource.fetchUserDetailsAsync(login)

        }.build().asLiveData()
    }

}
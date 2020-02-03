package com.example.repository

import com.example.local.localDataSource.LocalDataSource
import com.example.model.User
import com.example.remote.UserRemoteDataSource
import com.example.repository.utils.DataSource
import com.example.repository.utils.Resource
import io.reactivex.Observable
import java.util.concurrent.TimeUnit

class UserRepositoryImpl(private val remoteDataSource: UserRemoteDataSource, private val localDataSource: LocalDataSource): UserRepository {

    override fun getTopUsersWithCache(): Observable<Resource<List<User>>> {
        val remoteSource = remoteDataSource.fetchTopUsersAsync()
            .flatMapCompletable { localDataSource.saveUsers(it.items) }
            .andThen(localDataSource.getAllUsers())
            .map { Resource.Success(DataSource.NETWORK, it) as Resource<List<User>> }
            .onErrorReturn { Resource.Error(DataSource.NETWORK, it) }.toObservable().debounce(300, TimeUnit.MILLISECONDS)

        val localSource = localDataSource.getAllUsers().
            map { Resource.Success(DataSource.LOCAL, it) as Resource<List<User>>}.
            onErrorReturn { Resource.Error(DataSource.LOCAL, it) }.
            toObservable().debounce(300, TimeUnit.MILLISECONDS)

        return Observable.concatArrayEager(localSource, remoteSource)

    }

    override fun getUserDetailsWithCache(login: String): Observable<Resource<User>> {
        val remoteSource = remoteDataSource.fetchUserDetailsAsync(login).
            flatMapCompletable { localDataSource.saveSingleUser(it) }.
            andThen(localDataSource.getSingleUser(login)).
            map { Resource.Success(DataSource.LOCAL, it) as Resource<User> }.
            onErrorReturn { Resource.Error(DataSource.NETWORK, it) }.toObservable().debounce(300, TimeUnit.MILLISECONDS)

        val localSource = localDataSource.getSingleUser(login).
            map { Resource.Success(DataSource.LOCAL, it ) as Resource<User> }.
            onErrorReturn { Resource.Error(DataSource.LOCAL, it) }.
            toObservable().debounce(300, TimeUnit.MILLISECONDS)

        return Observable.concatArrayEager(localSource, remoteSource)
    }
}
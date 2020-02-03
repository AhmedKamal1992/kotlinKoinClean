package com.example.local.localDataSource

import com.example.model.User
import io.reactivex.Completable
import io.reactivex.Single

class LocalDataSource (private val dao: UserDao) {
    fun saveUsers(users: List<User>): Completable = dao.saverUsers(users)
    fun saveSingleUser(user: User): Completable = dao.saveUser(user)
    fun getAllUsers(): Single<List<User>> = dao.getTopUsers()
    fun getSingleUser(login: String): Single<User> = dao.getUser(login)
}
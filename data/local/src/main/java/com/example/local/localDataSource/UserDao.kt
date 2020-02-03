package com.example.local.localDataSource

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.model.User
import io.reactivex.Completable
import io.reactivex.Single
import java.util.*

@Dao
abstract class UserDao: BaseDao<User>() {

    @Query("SELECT * FROM user ORDER BY login ASC LIMIT 30")
    abstract  fun getTopUsers(): Single<List<User>>

    @Query("SELECT * FROM User WHERE login = :login LIMIT 1")
    abstract fun getUser(login: String): Single<User>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun saverUsers(users: List<User>): Completable

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun saveUser(user: User): Completable
}
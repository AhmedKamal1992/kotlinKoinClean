package com.example.local.localDataSource

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import io.reactivex.Completable

abstract class BaseDao<T> {

    /*@Insert(onConflict = OnConflictStrategy.REPLACE)
    protected abstract fun insert(users: List<T>): Completable

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    protected abstract fun insert(user: T): Completable*/
}
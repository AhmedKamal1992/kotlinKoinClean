package com.example.local.injection

import com.example.local.AppDatabase
import com.example.local.localDataSource.LocalDataSource
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module.module

private const val DATABASE = "DATABASE"

val localModule = module {
    single(DATABASE) { AppDatabase.buildDatabase(androidContext()) }
    factory { LocalDataSource(get()) }
    factory { (get(DATABASE) as AppDatabase).userDao() }
}
package com.example.repository.injection

import com.example.repository.AppDispatchers
import com.example.repository.UserRepository
import com.example.repository.UserRepositoryImpl
import kotlinx.coroutines.Dispatchers
import org.koin.dsl.module.module

val repositoryModule = module {
    factory { AppDispatchers(Dispatchers.Main, Dispatchers.IO) }
    factory<UserRepository> { UserRepositoryImpl(get(), get()) }
}
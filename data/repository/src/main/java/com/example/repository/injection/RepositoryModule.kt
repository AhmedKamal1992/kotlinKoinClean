package com.example.repository.injection

import com.example.repository.UserRepository
import com.example.repository.UserRepositoryImpl
import org.koin.dsl.module.module

val repositoryModule = module {
    factory<UserRepository> { UserRepositoryImpl(get(), get()) }
}
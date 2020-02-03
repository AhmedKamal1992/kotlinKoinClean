package com.example.home.injection

import com.example.home.domain.TopUsersUseCase
import com.example.home.domain.TopUsersUseCaseImpl
import com.example.home.presentation.HomeViewModel
import org.koin.dsl.module.module
import org.koin.android.viewmodel.ext.koin.viewModel

val homeModule = module {
    factory<TopUsersUseCase> { TopUsersUseCaseImpl(get()) }
    viewModel { HomeViewModel(get())}
}
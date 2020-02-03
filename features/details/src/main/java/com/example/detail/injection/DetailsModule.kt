package com.example.detail.injection

import com.example.detail.domain.UserDetailsUseCase
import com.example.detail.domain.UserDetailsUseCaseImpl
import com.example.detail.presentation.UserDetailsViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val detailsModule = module {
    factory<UserDetailsUseCase> { UserDetailsUseCaseImpl(get()) }
    viewModel { UserDetailsViewModel(get(), get()) }
}
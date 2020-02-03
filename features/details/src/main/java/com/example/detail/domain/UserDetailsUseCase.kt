package com.example.detail.domain

import androidx.lifecycle.LiveData
import com.example.model.User
import com.example.repository.utils.Resource

interface UserDetailsUseCase {
    suspend operator fun invoke(forceRefresh: Boolean = false, login: String): LiveData<Resource<User>>
}
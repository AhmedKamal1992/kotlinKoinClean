package com.example.home.domain

import androidx.lifecycle.LiveData
import com.example.model.User
import com.example.repository.utils.Resource

interface TopUsersUseCase {
    suspend operator fun invoke(forceRefresh: Boolean = false): LiveData<Resource<List<User>>>
}
package com.example.home.domain

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.model.User
import com.example.repository.UserRepository
import com.example.repository.utils.Resource

class TopUsersUseCaseImpl (private val repository: UserRepository): TopUsersUseCase {
    override suspend fun invoke(forceRefresh: Boolean): LiveData<Resource<List<User>>> {
        return Transformations.map(repository.getTopUsersWithCache(forceRefresh)) {
            it
        }
    }

}
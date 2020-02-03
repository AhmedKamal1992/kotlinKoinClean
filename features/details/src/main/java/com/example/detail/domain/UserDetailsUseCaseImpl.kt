package com.example.detail.domain

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.model.User
import com.example.repository.UserRepository
import com.example.repository.utils.Resource

class UserDetailsUseCaseImpl (private val repository: UserRepository): UserDetailsUseCase {

    override suspend fun invoke(forceRefresh: Boolean, login: String): LiveData<Resource<User>> {
        return Transformations.map(repository.getUserDetailsWithCache(forceRefresh, login)) {
            it // Place here your specific logic actions (if any)
        }
    }


}
package com.example.home.domain

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.model.User
import com.example.repository.UserRepository
import com.example.repository.utils.Resource
import io.reactivex.Observable

class TopUsersUseCaseImpl (private val repository: UserRepository): TopUsersUseCase {
    override fun getAllUsers(): Observable<Resource<List<User>>> = repository.getTopUsersWithCache()

}
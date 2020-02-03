package com.example.repository.utils

sealed class Resource<E>(val source: DataSource) {

    class Success<E>(source: DataSource, val result: E): Resource<E>(source)
    class Error<E>(source: DataSource, val throwable: Throwable): Resource<E>(source)
    class Loading<E>(source: DataSource): Resource<E>(source)
}

enum class DataSource { NETWORK, LOCAL }
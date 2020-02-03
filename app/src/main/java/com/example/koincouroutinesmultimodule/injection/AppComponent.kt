package com.example.koincouroutinesmultimodule.injection

import com.example.home.injection.homeModule
import com.example.local.injection.localModule
import com.example.remote.networkModule
import com.example.repository.injection.repositoryModule

val appComponenet = listOf(networkModule("https://api.github.com/"), repositoryModule, homeModule, localModule)
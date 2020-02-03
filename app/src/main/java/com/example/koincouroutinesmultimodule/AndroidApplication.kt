package com.example.koincouroutinesmultimodule

import android.app.Application
import com.example.koincouroutinesmultimodule.injection.appComponenet
import org.koin.android.ext.android.startKoin

class AndroidApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        configureInjection()
    }

    open fun configureInjection() {
        startKoin(this, provideAppComponent())
    }

    open fun provideAppComponent() = appComponenet
}
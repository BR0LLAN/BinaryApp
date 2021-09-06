package com.devcraft.binaryoptions.freeapp.app

import android.app.Application
import com.devcraft.binaryoptions.freeapp.app.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    companion object {
        lateinit var instance: App
    }

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(
                netModule,
                netApiModule,
                repositoryMappersModule,
                viewModule
            )
        }
        instance = this
    }
}
package com.ricknmorty

import android.app.Application
import androidx.viewbinding.BuildConfig
import dagger.Component
import dagger.hilt.DefineComponent
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import timber.log.Timber

/**
 * Created by Ibrah on 1/29/21.
 */
@HiltAndroidApp
class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}
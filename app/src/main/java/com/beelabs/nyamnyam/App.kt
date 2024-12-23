package com.beelabs.nyamnyam

import app.beelabs.coconut.mvvm.base.BaseApp
import app.beelabs.coconut.mvvm.base.service.WifiConnectionService
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : BaseApp() {
    override fun onCreate() {
        super.onCreate()
        WifiConnectionService().initializeConnection(applicationContext)
    }
}
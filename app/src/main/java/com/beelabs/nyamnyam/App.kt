package com.beelabs.nyamnyam

import app.coconut2.coconut2_mvvm.base.BaseApp
import app.coconut2.coconut2_mvvm.network.WifiConnectionService
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : BaseApp() {
    override fun onCreate() {
        super.onCreate()
        WifiConnectionService.getInstance().setupConnection(applicationContext)
    }
}
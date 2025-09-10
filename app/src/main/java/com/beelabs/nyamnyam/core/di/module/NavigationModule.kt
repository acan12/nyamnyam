package com.beelabs.nyamnyam.core.di.module

import app.coconut2.coconut2_mvvm.network.ApiManager
import com.beelabs.nyamnyam.data.sources.remote.Api
import com.beelabs.nyamnyam.ui.navigation.auth.AuthNavigation
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NavigationModule {
    @Provides
    @Singleton
    fun provideNavigation(): AuthNavigation = AuthNavigation()
}
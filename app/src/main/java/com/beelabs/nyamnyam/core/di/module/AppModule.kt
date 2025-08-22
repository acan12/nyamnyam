package com.beelabs.nyamnyam.core.di.module

import app.coconut2.coconut2_mvvm.network.ApiManager
import com.beelabs.nyamnyam.data.sources.remote.Api
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideApi(): Api = Api(ApiManager())

}
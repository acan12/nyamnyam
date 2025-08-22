package com.beelabs.nyamnyam.core.di.module

import com.pigeon.demo.data.remote.repo.HeadlineRepository
import com.pigeon.demo.data.remote.source.Api
import com.pigeon.demo.domain.repo.headline.IHeadlineRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun provideHeadlineRepository(
        api: Api
    ): IHeadlineRepository =
        HeadlineRepository(api)

}
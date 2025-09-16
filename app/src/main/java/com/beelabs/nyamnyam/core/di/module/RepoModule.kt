package com.beelabs.nyamnyam.core.di.module

import com.beelabs.nyamnyam.data.sources.remote.repo.HeadlineRepository
import com.beelabs.nyamnyam.data.sources.remote.Api
import com.beelabs.nyamnyam.domain.repo.headline.IHeadlineRepository
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
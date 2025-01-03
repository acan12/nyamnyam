package com.beelabs.nyamnyam.ui.component.module

import com.beelabs.nyamnyam.ui.component.manager.NavigationManager
import com.beelabs.nyamnyam.ui.component.manager.impl.INavigation
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NavModule {

    @Singleton
    @Provides
    fun provideNavigation(): INavigation {
        return NavigationManager()
    }
}
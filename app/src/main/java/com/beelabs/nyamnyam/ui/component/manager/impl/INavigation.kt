package com.beelabs.nyamnyam.ui.component.manager.impl

import com.beelabs.nyamnyam.ui.component.manager.impl.nav.IAuthNavigation
import com.beelabs.nyamnyam.ui.component.manager.impl.nav.IHomeNavigation

interface INavigation {

    fun authNavigation(): IAuthNavigation

    fun homeNavigation(): IHomeNavigation
}
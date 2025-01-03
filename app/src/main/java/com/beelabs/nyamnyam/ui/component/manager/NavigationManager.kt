package com.beelabs.nyamnyam.ui.component.manager

import com.beelabs.nyamnyam.ui.component.manager.impl.INavigation
import com.beelabs.nyamnyam.ui.component.manager.impl.nav.IAuthNavigation
import com.beelabs.nyamnyam.ui.component.manager.impl.nav.IHomeNavigation

class NavigationManager : INavigation {
    override fun authNavigation(): IAuthNavigation {
        TODO("Not yet implemented")
    }

    override fun homeNavigation(): IHomeNavigation {
        TODO("Not yet implemented")
    }


}
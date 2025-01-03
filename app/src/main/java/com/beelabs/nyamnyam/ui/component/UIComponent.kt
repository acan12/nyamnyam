package com.beelabs.nyamnyam.ui.component

import UIScope
import com.beelabs.nyamnyam.ui.component.module.NavModule
import dagger.Component

@UIScope
@Component(modules = [NavModule::class])
interface UIComponent {
}
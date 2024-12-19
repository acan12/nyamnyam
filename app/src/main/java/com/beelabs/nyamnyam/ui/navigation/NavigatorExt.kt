package com.beelabs.nyamnyam.ui.navigation

import androidx.activity.ComponentActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.NavController
import kotlinx.coroutines.launch

fun Navigator.setupWithNavController(
    activity: ComponentActivity, navController: NavController
) {
    activity.lifecycleScope.launch {
        activity.repeatOnLifecycle(Lifecycle.State.STARTED)  {
            navEvent.collect { direction ->
                when(direction){
                    is Navigator.Direction.NavigateTo -> {
                        navController.navigate(direction.navaDirections)
                    }
                    is Navigator.Direction.NavigateBack -> {
                        if(!navController.popBackStack()) {
                            activity.finish()
                        }
                    }
                }
            }
        }
    }
}
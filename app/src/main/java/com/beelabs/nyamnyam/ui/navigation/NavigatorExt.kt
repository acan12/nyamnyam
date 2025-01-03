package com.beelabs.nyamnyam.ui.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.annotation.IdRes
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import com.beelabs.nyamnyam.ui.orEmpty
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

fun NavController.navigateSafely(@IdRes actionId: Int, args: Bundle? = null) {
    currentDestination?.let { currentDestination ->
        val navAction = currentDestination.getAction(actionId)
        // to navigate successfully certain action should be explicitly stated in nav graph
        if (navAction != null) {
            val destinationId = navAction.destinationId.orEmpty()
            val currentNode =
                if (currentDestination is NavGraph) currentDestination else currentDestination.parent
            if (destinationId != 0 && currentNode != null && currentNode.findNode(destinationId) != null) {
                navigate(actionId, args, null)
            }
        }
    }
}
package com.beelabs.nyamnyam.ui.navigation


import androidx.navigation.NavDirections
import dagger.hilt.android.scopes.ActivityRetainedScoped
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.receiveAsFlow
import javax.inject.Inject

@ActivityRetainedScoped
class Navigator @Inject constructor() {

    private val _navEvent = Channel<Direction>(Channel.UNLIMITED)
    val navEvent: Flow<Direction> = _navEvent.receiveAsFlow()

    fun navigateTo(navDirection: NavDirections) {
        _navEvent.trySend(Direction.NavigateTo(navDirection))
    }

    fun navigateBack() {
        _navEvent.trySend(Direction.NavigateBack)
    }

    sealed interface Direction {
        data class NavigateTo (
            val navaDirections: NavDirections
        ) : Direction

        object NavigateBack : Direction
    }
}
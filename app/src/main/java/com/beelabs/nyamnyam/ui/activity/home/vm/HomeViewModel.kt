package com.beelabs.nyamnyam.ui.activity.home.vm

import androidx.lifecycle.ViewModel
import com.beelabs.nyamnyam.ui.navigation.home.HomeNavigation
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val homeNavigation: HomeNavigation
) : ViewModel() {

}
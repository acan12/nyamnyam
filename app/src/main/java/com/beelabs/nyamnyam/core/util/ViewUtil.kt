package com.beelabs.nyamnyam.core.util

import android.os.Build
import android.view.View
import com.beelabs.nyamnyam.R

object ViewUtil {

    fun enableEdgeToEdgeApp(view: View) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.BAKLAVA) {
            view.apply {
                setPadding(
                    0,
                    resources.getDimensionPixelSize(R.dimen.dimen_status_bar_height_android16),
                    0,
                    0
                )
            }
        } else {

        }
    }
}
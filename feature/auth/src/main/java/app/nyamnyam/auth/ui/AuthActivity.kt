package app.nyamnyam.auth.ui

import android.content.ComponentCallbacks2
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.common.CommonDependencies

class AuthActivity : AppCompatActivity(), ComponentCallbacks2 {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CommonDependencies()
    }
}
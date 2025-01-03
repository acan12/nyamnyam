package com.beelabs.nyamnyam.ui

fun Int?.orEmpty(default: Int = 0): Int = this ?: default
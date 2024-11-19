package com.beelabs.nyamnyam.ui.component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MessageCard(name: String) {
    Text(
        text = "Hello $name!",
        color = Color.Red)
}

@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard("Hallo")
}
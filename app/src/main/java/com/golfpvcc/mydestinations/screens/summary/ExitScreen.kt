package com.golfpvcc.mydestinations.screens.summary

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.golfpvcc.mydestinations.Components.AlertDialogExample

@Composable
fun ExitScreen(navController: NavController) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        AlertDialogExample(
            { onConfirmation() },
            { onDismissRequest() },
            "Exit progam",
            "Are you sure?"
        )

    }

}

fun onDismissRequest() {
    Log.d("VIN", "onDismissRequest clicked")
}

fun onConfirmation() {
    Log.d("VIN", "onConfirmation clicked")
}

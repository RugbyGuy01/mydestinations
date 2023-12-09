@file:OptIn(ExperimentalMaterial3Api::class)

package com.golfpvcc.mydestinations.screens.summary

import android.app.Activity
import android.content.pm.ActivityInfo
import android.content.res.Configuration.ORIENTATION_LANDSCAPE
import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import com.golfpvcc.mydestinations.Components.AlertDialogExample
import com.golfpvcc.mydestinations.Components.GameMenuBar
import com.golfpvcc.mydestinations.navigation.ScoreCardScreens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GameSummaryScreen(navController: NavController) {

    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        topBar = {
            GameMenuBar("Game Summary", navController = navController) {
                Log.d("VIN", "Exit clicked")
                navController.navigate(ScoreCardScreens.ExitScreen.name)
            }
        }
    )

    { values ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(values)
        ) {
            val activity = LocalContext.current as Activity
            activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE

            Text(text = "Summary Screen")

        }
    }
}


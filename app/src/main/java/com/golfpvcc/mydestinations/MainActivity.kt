package com.golfpvcc.mydestinations

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.golfpvcc.mydestinations.navigation.ScoreCardNavigation
import com.golfpvcc.mydestinations.ui.theme.MyDestinationsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyDestinationsTheme {
                ScoreCardApp()
            }
        }
    }
}

@Composable
fun ScoreCardApp() {
    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier.fillMaxSize()
    ) {
        ScoreCardNavigation()
    }
}
package com.golfpvcc.mydestinations.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.golfpvcc.mydestinations.screens.card.CardScreen
import com.golfpvcc.mydestinations.screens.coursedetail.CourseDetailScreen
import com.golfpvcc.mydestinations.screens.courses.SelectCourseScreen
import com.golfpvcc.mydestinations.screens.options.OptionScreen
import com.golfpvcc.mydestinations.screens.players.PlayerSetupScreen
import com.golfpvcc.mydestinations.screens.summary.ExitScreen
import com.golfpvcc.mydestinations.screens.summary.GameSummaryScreen


@Composable
fun ScoreCardNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = ScoreCardScreens.ScoreCardSummary.name
    ) {
        composable(ScoreCardScreens.ScoreCardSummary.name) {
            GameSummaryScreen(navController = navController)
        }

        composable(ScoreCardScreens.SelectCourseScreen.name) {
            SelectCourseScreen(navController = navController)
        }

        composable(ScoreCardScreens.CourseDetailScreen.name) {
            CourseDetailScreen(navController = navController)
        }

        composable(ScoreCardScreens.PlayerSetupScreen.name) {
            PlayerSetupScreen(navController = navController)
        }

        composable(ScoreCardScreens.CardScreen.name) {
            CardScreen(navController = navController)
        }
        composable(ScoreCardScreens.OptionScreen.name) {
            OptionScreen(navController = navController)
        }

        composable(ScoreCardScreens.ExitScreen.name) {
            ExitScreen(navController = navController)
        }
    }

}


package com.golfpvcc.mydestinations.navigation

enum class ScoreCardScreens {
    ScoreCardSummary,
    CourseDetailScreen,
    SelectCourseScreen,
    OptionScreen,
    PlayerSetupScreen,
    CardScreen,
    ExitScreen;
    companion object {
        fun fromRoute(route: String): ScoreCardScreens =
            when(route?.substringBefore("/")) {
                ScoreCardSummary.name -> ScoreCardSummary
                CourseDetailScreen.name -> CourseDetailScreen
                SelectCourseScreen.name -> SelectCourseScreen
                OptionScreen.name -> OptionScreen
                PlayerSetupScreen.name -> PlayerSetupScreen
                CardScreen.name -> CardScreen
                ExitScreen.name -> ExitScreen
                null -> ScoreCardSummary
                else -> throw IllegalArgumentException("Route is unknow: $route")
            }
    }
}
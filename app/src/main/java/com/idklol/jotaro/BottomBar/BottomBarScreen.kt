package com.idklol.jotaro.BottomBar

import com.idklol.jotaro.R

// Used for the BottomBar
sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: Int,
    val icon_focused: Int
) {

    // For Exercises
    object Exercises: BottomBarScreen(
        route = "exercises",
        title = "Exercises",
        icon = R.drawable.dumbbell_icon_48,
        icon_focused = R.drawable.dumbbell_icon_filled_48
    )

    // For Workouts
    object Workouts: BottomBarScreen(
        route = "workouts",
        title = "Workouts",
        icon = R.drawable.whistle_icon_48,
        icon_focused = R.drawable.whistle_icon_filled_48,
    )


    // for Settings
    object Settings: BottomBarScreen(
        route = "settings",
        title = "Settings",
        icon = R.drawable.settings_gear_48,
        icon_focused = R.drawable.settings_gear_filled_48
    )

}
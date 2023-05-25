package com.idklol.jotaro.BottomBar

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.idklol.jotaro.ExerciseStuff.ExerciseList
import com.idklol.jotaro.SettingsStuff.SettingsScreen
import com.idklol.jotaro.jotaroData
import com.idklol.jotaro.workoutstuff.WorkoutList

val exercise_items = jotaroData.exercise_samples
val workout_items = jotaroData.workout_samples

@Composable
fun BottomNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Workouts.route
    ) {
        composable(route = BottomBarScreen.Exercises.route) {
            ExerciseList(exerciseItems = exercise_items)
        }
        composable(route = BottomBarScreen.Workouts.route) {
//            ReportScreen()
            WorkoutList(workoutsItems = workout_items)
            // TODO: Put the '+' for adding a workout
        }
        composable(route = BottomBarScreen.Settings.route) {
            SettingsScreen()
        }
    }
}
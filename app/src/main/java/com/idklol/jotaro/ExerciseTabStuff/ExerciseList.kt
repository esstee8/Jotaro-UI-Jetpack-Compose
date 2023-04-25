package com.idklol.jotaro.ExerciseTabStuff

import androidx.compose.runtime.Composable
import com.idklol.jotaro.Models.Exercise


@Composable
// todo: this function is redundant, remove it.
// Load the internal JSON data, then display it in VerticalExerciseList
fun ExerciseList(exerciseItems: List<Exercise>) {
    VerticalExerciseList(exerciseItems = exerciseItems)
}

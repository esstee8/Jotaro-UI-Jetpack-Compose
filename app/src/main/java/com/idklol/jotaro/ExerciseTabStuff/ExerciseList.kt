package com.idklol.jotaro.ExerciseTabStuff

import androidx.compose.runtime.Composable
import com.idklol.jotaro.Models.Exercise


@Composable
// Load the internal JSON data, then display it in VerticalExerciseList
fun ExerciseList(exerciseItems: List<Exercise>) {
    VerticalExerciseList(exerciseItems = exerciseItems)

}

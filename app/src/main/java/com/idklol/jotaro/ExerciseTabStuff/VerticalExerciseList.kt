package com.idklol.jotaro.ExerciseTabStuff

import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.idklol.jotaro.Models.Exercise

@Composable
// Given a Kotlin List of Exercise items, loads
//  them into a Lazy Column and is displayed via `ExerciseCard`
fun VerticalExerciseList(exerciseItems: List<Exercise>) {
    LazyColumn {
        items(exerciseItems) { exercise ->
            ExerciseCard(exercise)
        }
    }
}
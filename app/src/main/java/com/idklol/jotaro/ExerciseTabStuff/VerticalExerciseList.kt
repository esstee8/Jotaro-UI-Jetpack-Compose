package com.idklol.jotaro.ExerciseTabStuff

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.idklol.jotaro.Models.Exercise

@Composable
// Given a Kotlin List of Exercise items, loads
//  them into a Lazy Column and is displayed via `ExerciseCard`
fun VerticalExerciseList(exerciseItems: List<Exercise>) {
    Surface(modifier = Modifier.fillMaxHeight()) {
        LazyColumn {
            items(exerciseItems) { exercise ->
                ExerciseCard(exercise)
            }
        }
    }
}
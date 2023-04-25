package com.idklol.jotaro.ExerciseTabStuff

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jetsnack.ui.components.VerticalGrid
import com.idklol.jotaro.Models.Exercise
import androidx.compose.ui.layout.Layout
import com.idklol.jotaro.Functions.ExerciseItemsToPairs


@Composable
// Given a Kotlin List of Exercise items, loads
//  them into a Lazy Column and is displayed via `ExerciseCard`
fun VerticalExerciseList(exerciseItems: List<Exercise>) {
    // TODO: Make the view changeable by settings

    // This one is a 2-column list
    val exercisePairs = ExerciseItemsToPairs(exerciseItems)
    Surface(modifier = Modifier.fillMaxHeight()) {
        LazyColumn {
            items(exercisePairs) { exercisePair ->
                VerticalGrid {
                    // TODO: Make a `TinyExerciseCard` view;
                    //  Really, just remove primer, leaving 4 tidbits
                    ExerciseCard(exercise = exercisePair.first)
                    ExerciseCard(exercise = exercisePair.second)
                }
            }
        }
    }

//    // Below: Just the single card list implementation. Uncomment the implementation above
//    Surface(modifier = Modifier.fillMaxHeight()) {
//        LazyColumn {
//            items(exerciseItems) { exercise ->
//                ExerciseCard(exercise = exercise)
//            }
//        }
//    }

}
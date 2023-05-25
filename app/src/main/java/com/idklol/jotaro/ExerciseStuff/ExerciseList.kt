package com.idklol.jotaro.ExerciseStuff

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.jetsnack.ui.components.VerticalGrid
import com.idklol.jotaro.Models.Exercise
import com.idklol.jotaro.Functions.ExerciseItemsToPairs
import com.idklol.jotaro.ui.theme.gradientRB


@Composable
// Given a Kotlin List of Exercise items, loads
//  them into a Lazy Column and is displayed via `ExerciseCard`
fun ExerciseList(exerciseItems: List<Exercise>) {
    // TODO: Make the view changeable by settings

    // This one is a 2-column list implementation
//    val exercisePairs = ExerciseItemsToPairs(exerciseItems)
//    Surface(modifier = Modifier.fillMaxHeight()) {
//        LazyColumn {
//            items(exercisePairs) { exercisePair ->
//                VerticalGrid {
//                    // TODO: Make a `TinyExerciseCard` view;
//                    //  Really, just remove primer, leaving 4 tidbits
//                    ExerciseCard(exercise = exercisePair.first)
//                    ExerciseCard(exercise = exercisePair.second)
//                }
//            }
//        }
//    }

//    // Below: Just the single card list implementation. Uncomment the implementation above
    Surface(modifier = Modifier.fillMaxHeight()) {
        LazyColumn (modifier = Modifier.background(gradientRB)) {
            items(exerciseItems) { exercise ->
                ExerciseCard(exercise = exercise)
            }
        }
    }

}
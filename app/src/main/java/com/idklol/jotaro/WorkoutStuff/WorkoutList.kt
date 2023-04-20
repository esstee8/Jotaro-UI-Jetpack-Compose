package com.idklol.jotaro

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.idklol.jotaro.Models.Workout

// For testing the compose views
val workout_data = JotaroLocalData("")

@Composable
fun WorkoutList(workoutsItems: List<Workout>) {

    for (_workout_ in workoutsItems ) { println(_workout_.desc) }

    Surface(modifier = Modifier.fillMaxHeight()) {
        LazyColumn {
            items(workoutsItems) { workout ->
                Log.d(TAG, "WorkoutList: item is " + workout.title)
                WorkoutCard(workout)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WorkoutListPreview(){
    WorkoutList(workout_data.workout_samples)
}
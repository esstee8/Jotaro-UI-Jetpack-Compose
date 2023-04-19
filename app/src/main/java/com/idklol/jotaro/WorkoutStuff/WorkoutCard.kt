package com.idklol.jotaro

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.idklol.jotaro.JotaroLocalData
import com.idklol.jotaro.Models.Workout

val workoutSamples = JotaroLocalData("").workout_samples

@Composable
fun WorkoutCard(workout: Workout){
    Text(text = workout.title, fontWeight = FontWeight.ExtraBold)
//    Scaffold(
//        modifier = Modifier
//            .padding(12.dp),
//        backgroundColor = Color.Magenta // debugging background
//    ) { padding ->
//        Column(
//            modifier = Modifier.padding(padding)
//        ) {
//            Card(
//                modifier = Modifier
//                    .clickable { Log.d(TAG, "WorkoutCard: You pressed a Workout card") }
//            ) {
//                Text(text = workout.title)
//            }
//        }
//    }
}

@Preview(showBackground = true)
@Composable
fun WorkoutCardPreview() {
    WorkoutCard(workout = workoutSamples[1])

}
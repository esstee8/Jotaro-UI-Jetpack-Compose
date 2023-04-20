package com.idklol.jotaro

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.idklol.jotaro.Models.Workout
import com.idklol.jotaro.ui.theme.jotaroPurple
val jotaroData = JotaroLocalData("")
val workoutSamples = jotaroData.workout_samples
val sampleUserName = jotaroData.username

@Composable
// This is just a quick overview of the workouts available and
fun WorkoutCard(workout: Workout){
    Column(
        modifier = Modifier.background(jotaroPurple).padding(2.dp)
    ) {
        Card(
            shape = RoundedCornerShape(12.dp),
            elevation = 12.dp,
            backgroundColor = MaterialTheme.colors.surface, // White
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth()
                .clickable { Log.d(TAG, "WorkoutCard: You pressed a Workout card") }
        ) {
            Column(
                modifier = Modifier.padding(18.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Title
                TitleText(workout.title)
                Spacer(modifier = Modifier.padding(6.dp))

                // Author
                Text(
                    text = "\t (@" + sampleUserName + ")",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Light,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.padding(6.dp))

                // Description
                LineText(workout.desc)
                Spacer(modifier = Modifier.padding(6.dp))



                // TODO: List of exercises
                val workout_ids = workout.exercises

                // TODO: Vertical Column
                // Each item is id of exercise, then display title
                //      get title via exercise ID

                //TODO: Show 'Start' button as well
                // TODO: Show notes on a new screen after tapping on the tab
                //      That is, expands the card and show the notes
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WorkoutCardPreview() {
    WorkoutCard(workout = workoutSamples[1])
}
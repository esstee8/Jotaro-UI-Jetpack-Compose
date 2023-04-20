package com.idklol.jotaro

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.idklol.jotaro.Models.Workout

val jotaroData = JotaroLocalData("")
val workoutSamples = jotaroData.workout_samples
val sampleUserName = jotaroData.username

@Composable
// This is just a quick overview of the workouts available and
fun WorkoutCard(workout: Workout){
//    Text(text = workout.title, fontWeight = FontWeight.ExtraBold)
    Scaffold(
        modifier = Modifier
            .padding(12.dp),
//        backgroundColor = Color.Magenta // debugging background
    // TODO: Add a FAB
    ) { padding ->
        Column(
            modifier = Modifier.padding(padding)
        ) {
            Card(
                modifier = Modifier
                    .padding(16.dp)
                    .clickable { Log.d(TAG, "WorkoutCard: You pressed a Workout card") }
            ) {
                Column(modifier = Modifier.padding(8.dp)) {
                    Row() {
                        // Title
                        Text(
                            text = "WORKOUT TITLE NAME",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                        )

                        // Author
                        Text(
                            text = "\t (@" + sampleUserName + ")",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Light
                        )

                    }
                    // Description
                    Text(
                        text = "\n" + workout.desc,
                        fontStyle = FontStyle.Italic,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis
                    )
                    Spacer(modifier = Modifier.padding(6.dp))

                    //TODO: IMPLEMENT SWITCH LOGIC BETWEEN KG AND LBS
                    //  THIS ENTAILS CONVERTING BETWEEN KGS AND LBS ON THE FLY
                    //      Ok this actually
                    // https://alexzh.com/jetpack-compose-switch/
//                    Row(modifier = Modifier) {
//                        Text(text = "lbs ⬅️\t ")
//                        //SWITCH HERE
//                        Text(text = "\t ➡️kgs")
//                    }

                    // TODO: List of exercises



                    // TODO: Show notes on a new screen after tapping on the tab
                    //      That is, expands the card and show the notes
                }
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WorkoutCardPreview() {
    WorkoutCard(workout = workoutSamples[1])
}
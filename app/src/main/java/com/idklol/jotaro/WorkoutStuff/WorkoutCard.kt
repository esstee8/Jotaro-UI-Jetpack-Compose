package com.idklol.jotaro

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.idklol.jotaro.Models.Workout
import com.idklol.jotaro.ui.theme.jotaroPurple
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.idklol.jotaro.Models.Exercise
import com.idklol.jotaro.TextComposables.JotaroLocalData
import com.idklol.jotaro.ui.theme.lightHeatherGrey


val jotaroData = JotaroLocalData("")
val workoutSamples = jotaroData.workout_samples
val exerciseSamples = jotaroData.exercise_samples
val sampleUserName = jotaroData.username

@Composable
// This is just a quick overview of the workouts available and
fun WorkoutCard(workout: Workout){

    // Data that changes throughout the lifetime -> Must be variable
    // `remember` caches the value, `mutableStateOf` is a State Holder, w/initial value of `false`
    // On change for `expanded`, Jetpack re-composes the Composable function, and shows
    //  the composable's new form
    var expanded by remember { mutableStateOf (false) }

    Column(
        modifier = Modifier
            .background(jotaroPurple)
            .padding(2.dp)
    ) {
        // Expanded function adapted from:
        //  https://medium.com/@acceldia/jetpack-compose-creating-expandable-cards-with-content-9ea1eae09efe
        Card(
            shape = RoundedCornerShape(12.dp),
            elevation = 12.dp,
            backgroundColor = MaterialTheme.colors.surface, // White
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth()
                // Toggle functionality
                // TODO: combinedClickable (long hold to do something to the workout card)
                .clickable {
                    Log.d(TAG, "WorkoutCard: WORKOUT CARD PRESSED")
                    expanded = !expanded
                } // We use {} instead of () because of trailing lambda parameter
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
                /*

                Click on card -> `clickable` property activates it's defined lambda, and `expanded`
                    is toggled. This updated the state of the card (since we stored `expanded` in a
                    `MutableStateOf`.
                So, the state of the composable (via `remember` function) is updated and invokes
                    a recompose of the card
                 */

                // Given the current workout, store the pertaining exercises as a list of their corresponding ID's
                var exerciseIDList = workout.exercises
                if(expanded) {
                    Spacer(modifier = Modifier.padding(4.dp))
                    Divider(thickness = 2.dp)

                    // Show exercise items
                    Column(modifier = Modifier) {
                        // Go through each exercise defined in the current `Workout`, going by `0000` ID
                        exerciseIDList.forEach { currentExerciseID ->
                            Row(modifier = Modifier) {
                                // TODO:  IMAGE of both flex and un-flex

                                //Get matching Exercises from exerciseSamples
                                val matchedExercise: Exercise? = exerciseSamples.find { it.id == currentExerciseID }
                                // Null safe, then toString it to make the `text` field happy
                                Text(text = matchedExercise?.title.toString())
                            }
                        }
                    }
                } else {
                    Text(text = "> Tap to show exercises <", color = lightHeatherGrey)
                }


                //TODO: Show 'Start' button as well. Or long
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
package com.idklol.jotaro.ExerciseStuff

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.gson.Gson
import com.idklol.jotaro.LineText
import com.idklol.jotaro.Models.Exercise
import com.idklol.jotaro.TitleText


@Composable
// TODO: Tap on the card to display a new view that shows the Exercise view in more detail, and option to add to a Workout
// TODO: Quick select multiple cards, along with filtering options
fun ExerciseCard(exercise: Exercise) {
    Card(
        shape = RoundedCornerShape(12.dp),
        elevation = 22.dp,
        backgroundColor = MaterialTheme.colors.surface, // White
        modifier = Modifier
            .padding(16.dp)
            .clickable { Log.d(TAG, "ExerciseCard: YOU PRESSED THE EXERCISE CARD") } // TODO: clickable for ExerciseCard
    ) {
        // This inner column is the 'content' of the card
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Title of the exercise
            TitleText(exercise.title)
            Spacer(modifier = Modifier.height(8.dp))

            // Primer; Quick explanation of which muscles is used
            LineText(exercise.primer)

            // Formatters
            Spacer(modifier = Modifier.height(8.dp))
            Divider( thickness = 2.dp, color = Color.Black)
            Spacer(modifier = Modifier.height(8.dp))

            // Show bits of info about the current exercise
            InfoBitRow(exercise = exercise)

        }

    }
}

// This is just to preview 'ExerciseCard'
// For ExerciseCardPreview()
val jsonSample = """
[
    {
        "id": "0013",
        "name": "smith-machine-upright-row",
        "title": "Upright Row: Smith Machine",
        "primer": "This is an exercise for shoulder and biceps strengthening.",
        "type": "Isolation",
        "primary": [
            "Deltoid"
        ],
        "secondary": [
            "Biceps Brachii",
            "Upper Back"
        ],
        "equipment": [
            "Smith Machine"
        ],
        "steps": [
            "Stand with your feet shoulder width apart and your abs drawn in.",
            "Place the bar on the Smith Machine in the position where your arms are fully extended in front of you.",
            "Place your hands shoulder width apart and raise the bar up towards your chin with a controlled motion.",
            "Pause at the top for a moment and rotate your shoulder blades together.",
            "Lower the bar to the starting position."
        ],
        "tips": [
            "Ensure you do not arch your back when pulling the bar up towards your chin."
        ],
        "references": [],
        "svg": [
            "svg/0013-relaxation.svg",
            "svg/0013-tension.svg"
        ],
        "png": [
            "png/0013-relaxation.png",
            "png/0013-tension.png"
        ]
    }
 ]
    """.trimIndent()
val gson = Gson()
val exerciseList = gson.fromJson(jsonSample, Array<Exercise>::class.java).asList()

@Preview(showBackground = true)
@Composable
fun ExerciseCardPreview() {
    ExerciseCard(exercise = exerciseList[0])
}



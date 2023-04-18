package com.idklol.jotaro.ExerciseTabStuff

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.google.gson.Gson
import com.idklol.jotaro.Exercise

// This is just to preview 'ExerciseCard'
// For ExerciseCardPreview()
val jsonSample = """
[
    {
        "id": "0013",
        "name": "smith-machine-upright-row",
        "title": "Upright Row: Smith Machine",
        "primer": "This is an exercise for shoulder and biceps strengthening.",
        "type": "isolation",
        "primary": [
            "deltoid"
        ],
        "secondary": [
            "biceps brachii",
            "upper back"
        ],
        "equipment": [
            "smith machine"
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

//
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ExerciseCardPreview() {
    ExerciseCard(exercise = exerciseList[0])
}







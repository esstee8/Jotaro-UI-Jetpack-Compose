package com.idklol.jotaro.ExerciseTabStuff

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.idklol.jotaro.Models.Exercise

@Composable
// TODO: Can we optimize this by only passing in necessary pieces of info?
// Given an `Exercise` object, creates a row w/various info bits, horizontally
fun InfoBitRow(exercise: Exercise) {
    Card(
            modifier = Modifier
    ){
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            //Type
            InfoBitText(topString = "TYPE", bottomString = exercise.type)



            //Primary
            val primaries = exercise.primary.joinToString("\n") { it } // Convert Array<String> to single String
            InfoBitText(topString = "PRIMARY", bottomString = primaries)



            //Secondary
            // Convert Array<String> to String, and append a \n between each element in the list
            var secondaries = exercise.secondary.joinToString("\n") { it  }
            if (secondaries.isEmpty()) { secondaries = "(N/A)" }

            InfoBitText(topString = "SECONDARY", bottomString = secondaries)
            // Equipment ----
            var equipments = exercise.equipment.joinToString("\n") { it }
            if (equipments.isEmpty()) {equipments = "(N/A)"}
            InfoBitText(topString = "EQUIPMENT", bottomString = equipments)

        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun InfoBitRowPreview() {
    InfoBitRow(exercise = exerciseList[0])
}
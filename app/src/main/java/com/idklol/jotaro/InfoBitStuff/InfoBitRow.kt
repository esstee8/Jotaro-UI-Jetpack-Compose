package com.idklol.jotaro.ExerciseTabStuff

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.idklol.jotaro.Exercise

@Composable
// TODO: Can we optimize this by only passing in necessary pieces of info?
// Given an `Exercise` object, creates a row w/various info bits, horizontally
fun InfoBitRow(exercise: Exercise) {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Color.Cyan // color for debugging purposes
            )
    ) {
        // type
        Box(Modifier.padding(8.dp)) {
            InfoBitCard(topString = "Type", bottomString = exercise.type)
        }
        // Primary
        // TODO: Values in the Array to formatted String
        Box(Modifier.padding(8.dp)) {
            InfoBitCard(topString = "Primary", bottomString = exercise.primary[0])
        }
        // Secondary
        // TODO: Values in the Array to formatted String
        InfoBitCard(topString = "Secondary", bottomString = exercise.secondary[0] )

        //Equipment
        // TODO: Values in the Array to formatted String
        InfoBitCard(topString = "Equipment", bottomString = exercise.equipment[0])

    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun InfoBitRowPreview() {
    InfoBitRow(exercise = exerciseList[0])
}
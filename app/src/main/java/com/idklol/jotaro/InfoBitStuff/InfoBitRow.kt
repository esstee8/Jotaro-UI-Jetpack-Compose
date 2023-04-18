package com.idklol.jotaro.ExerciseTabStuff

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Text
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
    Card(modifier = Modifier){
        Row(
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            // TODO : GENERALIZE THIS DON'T LEAVE THE EXAMPLES INSIDE
            //Type
            InfoBitText(topString = "TYPE", bottomString = "isolation")

            Divider(
                color = Color.Black,
                modifier = Modifier
                    .fillMaxHeight()  //fill the max height
                    .width(1.dp)
            )

            //Primary
            InfoBitText(topString = "PRIMARY", bottomString = "deltoid, latissimus dorsi")

            Divider(
                color = Color.Black,
                modifier = Modifier
                    .fillMaxHeight()  //fill the max height
                    .width(1.dp)
            )

            //Secondary
            val secondaries = arrayOf("glutaeus maximus, quadriceps, gastrocnemius, soleus")
            InfoBitText(topString = "SECONDARY", bottomString = "glutaeus maximus, quadriceps, gastrocnemius, soleus")
            // Equipment
            // TODO: Implement `Equipment` someday lol
//            InfoBitText(topString = "EQUIPMENT", bottomString = "smith machine")

        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun InfoBitRowPreview() {
    InfoBitRow(exercise = exerciseList[0])
}
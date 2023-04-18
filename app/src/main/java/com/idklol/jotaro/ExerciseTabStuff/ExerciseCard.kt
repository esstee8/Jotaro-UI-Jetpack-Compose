package com.idklol.jotaro.ExerciseTabStuff

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.idklol.jotaro.Models.Exercise


// To build paths:
// For example: github_data_path + "png/0001-relaxation.png" to get the photo
const val github_data_path = "https://raw.githubusercontent.com/10dollarusername/Jotaro-Exercise-Data/main/"



@Composable
// TODO: Tap on the card to display a new view that shows the Exercise view in more detail, and option to add to a Workout
// TODO: Quick select multiple cards, along with filtering options
fun ExerciseCard(exercise: Exercise) {
    Card(
        shape = RoundedCornerShape(12.dp),
        elevation = 22.dp,
        backgroundColor = MaterialTheme.colors.surface, // White
        modifier = Modifier.padding(16.dp)
    ) {


        // This inner column is the 'content' of the card
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            // Title of the exercise
            Text(
                text = exercise.title,
                style = MaterialTheme.typography.h1,
                textAlign = TextAlign.Center,
                color = com.idklol.jotaro.ui.theme.jotaroDarkIntenseBlue,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 2.sp,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))

            // Primer; Quick explanation of which muscles is used
            Text(
                text = exercise.primer,
                style = MaterialTheme.typography.subtitle2,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )

            // Formatters
            Spacer(modifier = Modifier.height(8.dp))
            Divider( thickness = 2.dp, color = Color.Black)
            Spacer(modifier = Modifier.height(8.dp))

            // Show bits of info about the current exercise
            InfoBitRow(exercise = exercise)

        }

    }
}




package com.idklol.jotaro.ExerciseTabStuff

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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




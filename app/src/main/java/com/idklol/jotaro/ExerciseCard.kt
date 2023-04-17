package com.idklol.jotaro

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.google.gson.Gson
import com.idklol.jotaro.ui.theme.BoldText




// To build paths:
// For example: github_data_path + "png/0001-relaxation.png" to get the photo
const val github_data_path = "https://raw.githubusercontent.com/10dollarusername/Jotaro-Exercise-Data/main/"



@Composable
// TODO: Make the exercise card more sexy
// TODO: Tap on the card to display a new view that shows the Exercise view in more detail, and option to add to a Workout
// TODO: Quick select multiple cards, along with filtering options
fun ExerciseCard(exercise: Exercise) {
    Card(
        shape = RoundedCornerShape(8.dp),
        elevation = 18.dp,
        backgroundColor = MaterialTheme.colors.surface,
        modifier = Modifier.padding(12.dp)
    ) {
        Column {
            Surface(
                modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                color = Color.LightGray
            ) {
                if (exercise.png.isNotEmpty()) {
                    // TODO: Don't load the image unless tapped
                    // TODO: Add filters
                    // TODO: Why does it load the placeholder.
                    // TODO: Why does it load weirdly lol
                    AsyncImage( // Load the exercise image
                        model = ImageRequest.Builder(LocalContext.current)
                            .data(github_data_path + exercise.png[1])
                            .crossfade(true)
                            .build(),
                        placeholder = painterResource(R.drawable.dog_plompy),
                        contentDescription = stringResource(R.string.placholder_image_desc),
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.clip(CircleShape)
                    )
                }
            }

            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text( // Title
                    text = exercise.title,
                    style = MaterialTheme.typography.h1,
                    textAlign = TextAlign.Center,
                    color = com.idklol.jotaro.ui.theme.jotaroDarkIntenseBlue,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 4.sp,
                    modifier = Modifier.fillMaxWidth()
                )
//                Text(
//                    text = exercise.primer,
//                    style = MaterialTheme.typography.subtitle2,
//                    textAlign = TextAlign.Center,
//                    modifier = Modifier.fillMaxWidth()
//                )
//                Spacer(modifier = Modifier.height(16.dp))
//                Text(
//                    text = "Primary muscles: ${exercise.primary.joinToString()}",
//                    style = MaterialTheme.typography.body2
//                )
//                Text(
//                    text = "Secondary muscles: ${exercise.secondary.joinToString()}",
//                    style = MaterialTheme.typography.body2
//                )
//                Text(
//                    text = "Equipment: ${exercise.equipment.joinToString()}",
//                    style = MaterialTheme.typography.body2
//                )
//                Spacer(modifier = Modifier.height(8.dp))
//                for (step in exercise.steps) {
//                    Text(
//                        text = step,
//                        style = MaterialTheme.typography.body2
//                    )
//                }
//                Spacer(modifier = Modifier.height(8.dp))
//                for (tip in exercise.tips) {
//                    Text(
//                        text = "Tip: $tip",
//                        style = MaterialTheme.typography.body2,
//                        color = MaterialTheme.colors.secondary
//                    )
//                }
            }
        }
    }
}





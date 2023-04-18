package com.idklol.jotaro.ExerciseTabStuff

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.idklol.jotaro.Exercise


// To build paths:
// For example: github_data_path + "png/0001-relaxation.png" to get the photo
const val github_data_path = "https://raw.githubusercontent.com/10dollarusername/Jotaro-Exercise-Data/main/"



@Composable
// TODO: Make the exercise card more sexy
// TODO: Tap on the card to display a new view that shows the Exercise view in more detail, and option to add to a Workout
// TODO: Quick select multiple cards, along with filtering options
fun ExerciseCard(exercise: Exercise) {
    // TODO: Can you give cards colored shadows, based on which `muscle` the exercise trains?
    // TODO: Instead of a photo, just put the tags of which muscles it is lol
    Card(
        shape = RoundedCornerShape(12.dp),
        elevation = 22.dp,
//        backgroundColor = MaterialTheme.colors.surface,
        backgroundColor = com.idklol.jotaro.ui.theme.jotaroYellow,
        modifier = Modifier.padding(12.dp)
    ) {
        Column {
            // TODO: Instead of a photo, we just put a list of relevant tags on the top
//            Surface(
//                modifier = Modifier
//                    .fillMaxHeight()
//                    .fillMaxWidth(),
////                shape = RoundedCornerShape(8.dp),
//                color = com.idklol.jotaro.ui.theme.jotaroIntenseBlue
//            ) {
//                if (exercise.png.isNotEmpty()) {
//                    // TODO: Don't load the image unless tapped
//                    // TODO: Add filters
//                    // TODO: Why does it load the placeholder.
//                    // TODO: Why does it load weirdly lol
//                    AsyncImage( // Load the exercise image
//                        model = ImageRequest.Builder(LocalContext.current)
//                            .data(github_data_path + exercise.png[1])
//                            .crossfade(true)
//                            .build(),
//                        placeholder = painterResource(com.idklol.jotaro.R.drawable.dog_plompy),
//                        contentDescription = stringResource(com.idklol.jotaro.R.string.placholder_image_desc),
//                        contentScale = ContentScale.Crop,
//                        modifier = Modifier.clip(CircleShape)
//                    )
//                }
//            }

            // If we put image out here (out of the surface) it only occupies the space it actually
            //   renders; i.e. no 'stretch to fit the card' it just generates empty space

            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                // Title
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

//                Divider(startIndent = 8.dp, thickness = 2.dp, color = Color.Black)
                // Primer; Quick explanation of which muscles is used
                Text(
                    text = exercise.primer,
                    style = MaterialTheme.typography.subtitle2,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(5.dp))

//                Divider(startIndent = 8.dp, thickness = 1.dp, color = Color.Gray)
                Divider(startIndent = 8.dp, thickness =3.dp, color = Color.Black)

                // Random info bits
                // The `exercise` was passed to THIS card scope, and we pass it to `InfoBitCard`

                InfoBitRow(exercise = exercise)

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





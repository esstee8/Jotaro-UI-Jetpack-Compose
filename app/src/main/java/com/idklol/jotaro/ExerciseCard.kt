package com.idklol.jotaro

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.google.gson.Gson
import java.io.File


@Composable
fun ExerciseCard(exercise: Exercise) {
    Card(
        shape = RoundedCornerShape(8.dp),
        elevation = 12.dp,
        backgroundColor = MaterialTheme.colors.surface,
        modifier = Modifier.padding(8.dp)
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
                    val path = exercise.png[1]
                    // TODO: vvvvvvvvvvvvvvv
                    //  So, we're loading the JSON data directly from string
                    //      We only have 'png/<png file here>', but Kotlin doesn't know where to find it
                    //png/0001-relaxation.png
                    print(path)
                    print("____")
//                    Image(rememberImagePainter(File(path)),
//                        contentDescription = exercise.title
//                    )

                    Image(
                        // TODO: Put 'relax' (or 'flex') images in the card
                        // TODO: Put both the images side by side
//                        painter = painterResource(id = exercise.png[0] ),
                        ColorPainter(Color.Blue),
//                        painterResource(id = exercise.svg[0]),
                        contentDescription = exercise.title
                    )


                }
            }

            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = exercise.title,
                    style = MaterialTheme.typography.h5,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
                Text(
                    text = exercise.primer,
                    style = MaterialTheme.typography.subtitle2,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Primary muscles: ${exercise.primary.joinToString()}",
                    style = MaterialTheme.typography.body2
                )
                Text(
                    text = "Secondary muscles: ${exercise.secondary.joinToString()}",
                    style = MaterialTheme.typography.body2
                )
                Text(
                    text = "Equipment: ${exercise.equipment.joinToString()}",
                    style = MaterialTheme.typography.body2
                )
                Spacer(modifier = Modifier.height(8.dp))
                for (step in exercise.steps) {
                    Text(
                        text = step,
                        style = MaterialTheme.typography.body2
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
                for (tip in exercise.tips) {
                    Text(
                        text = "Tip: $tip",
                        style = MaterialTheme.typography.body2,
                        color = MaterialTheme.colors.secondary
                    )
                }
            }
        }
    }
}

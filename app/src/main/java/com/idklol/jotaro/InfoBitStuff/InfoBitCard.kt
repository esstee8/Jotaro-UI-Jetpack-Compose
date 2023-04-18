package com.idklol.jotaro.ExerciseTabStuff

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.idklol.jotaro.ui.theme.ArvoFamily

@Composable
// Given the top string and bottom string, displays it as the following:
//        TOP STUFF:
//       Bottom Stuff
fun InfoBitCard(topString: String, bottomString: String) {
    Card(
        modifier = Modifier.padding(5.dp) // Pad the card in it's parent Composable View
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 8.dp),
        elevation = 4.dp,
        shape = RoundedCornerShape(20.dp) // To make the card rounded and sexy
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp) // Pad between the Card and the Text via the Column
        ) {
            Text(
                text = "\t" + topString,
                fontFamily = ArvoFamily, // Import the family, select the weight type
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 1.sp, // Reduce kerning
                maxLines = 1,
                overflow = TextOverflow.Ellipsis // Example: TOP ROW OVERFL...
            )
            Spacer(modifier = Modifier.height(2.dp)) // Pad between topString and bottomString
            Text(
                text = bottomString,
                // TODO: Change font to Arvo Regular
                fontFamily = ArvoFamily,
                fontWeight = FontWeight.Normal,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

//@Preview(showSystemUi = true, showBackground = true)
@Preview(showBackground = true)
@Composable
fun InfoBitCardPreview() {
    InfoBitCard(topString = "\t TOP \t ROW", bottomString = "BOTTOM, ROW, HERE" )
}


package com.idklol.jotaro.ExerciseStuff

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.idklol.jotaro.ui.theme.ArvoFamily

@Composable
// Given the top string and bottom string, displays it as the following inside of a column:
//        TOP STUFF:
//       Bottom Stuff
fun InfoBitText(topString: String, bottomString: String) {
    Column(
        modifier = Modifier.padding(7.dp), // Pad between the Card and the Text via the Column
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            textAlign = TextAlign.Center,
            text = "" + topString,
            fontFamily = ArvoFamily, // Import the family, select the weight type
            fontSize = 10.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 0.15.sp, // Reduce kerning
            maxLines = 1,
            overflow = TextOverflow.Ellipsis // Example: TOP ROW OVERFL...
        )
        // TODO: How to stop `EQUIPMENT` title from overflowing?
        Spacer(modifier = Modifier.height(2.dp)) // Pad between topString and bottomString
        Text(
            textAlign = TextAlign.Center,
            text = bottomString,
            fontFamily = ArvoFamily,
            fontSize = 9.sp,
            fontWeight = FontWeight.Normal,
            letterSpacing = 0.15.sp,
            maxLines = 3,
            overflow = TextOverflow.Ellipsis
        )
    }

}

//@Preview(showSystemUi = true, showBackground = true)
@Preview(showBackground = true)
@Composable
fun InfoBitTextPreview() {
    InfoBitText(topString = "TOP ROW", bottomString = "BOTTOM, ROW, HERE" )
}


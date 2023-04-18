package com.idklol.jotaro

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState
import com.idklol.jotaro.TabStuff.TabsContent
import com.idklol.jotaro.ui.theme.jotaroColor


// on below line we are creating a
// composable function for our tab layout
@OptIn(ExperimentalUnitApi::class)
@ExperimentalPagerApi
@Composable
fun TabLayout() {

    // on below line we are creating variable for pager state.
    val pagerState = rememberPagerState(pageCount = 3)

    // on below line we are creating a column for our widgets.
    Column(
        // for column we are specifying modifier on below line.
        modifier = Modifier.background(Color.White)
    ) {
        // on the below line we are specifying the top app bar
        // and specifying background color for it.
        TopAppBar(backgroundColor = jotaroColor) {
            // on below line we are specifying a column
            // for our text view to display a text
            // in our top app bar.
            Column(
                modifier = Modifier.fillMaxSize(),
                // on below line we are providing alignment for our
                // column to center of our top app bar.
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                // on below line we are specifying a text and
                // specifying a text as "Tab Layout Example"
//                Text(
//                    text = "Jotaro ",
//                    style = TextStyle(color = Color.White),
//                    fontWeight = FontWeight.Bold,
//                    fontSize = TextUnit(
//                        28F,
//                        TextUnitType.Sp
//                    ),
//                    // on below line we are specifying a modifier
//                    // to our text and adding passing from all sides.
//                    modifier = Modifier.padding(all = Dp(5F)),
//                    // on below line we are aligning
//                    // our text to center.
//                    textAlign = TextAlign.Center
//                )
            }
        }
        // on below line we are calling tabs
        Tabs(pagerState = pagerState) // TAB ORGANIZERS
        // on below line we are calling tabs content
        // for displaying our page for each tab layout
        TabsContent(pagerState = pagerState) // TAB CONTENT

        // TODO: Can put a bottom bar here?
    }
}
package com.idklol.jotaro

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomAppBar
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
import androidx.navigation.NavHost
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState
import com.idklol.jotaro.TabStuff.TabsContent
import com.idklol.jotaro.ui.theme.jotaroColor


// on below line we are creating a
// composable function for our tab layout
@ExperimentalPagerApi
@Composable
fun TabLayout() {

// TODO: Is TabLayout the 'starting point' of the graph? Anyway, do it after reimplimenting tabs
//    NavHost(navController = navController, startDestination = "profile") {
//        composable("profile") { TabLayout(/*...*/) }
//        composable("friendslist") { FriendsList(/*...*/) }
//        /*...*/
//    }


    val pagerState = rememberPagerState(initialPage = 2, pageCount = 3)

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
//            Column(
//                modifier = Modifier.fillMaxSize(),
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.Center
//            ) {
//                // ToDo: Can we put anything here?
//            }
        }
        // on below line we are calling tabs
        Tabs(pagerState = pagerState) // TAB ORGANIZERS
        // on below line we are calling tabs content
        // for displaying our page for each tab layout
        TabsContent(pagerState = pagerState) // TAB CONTENT

        // TODO: Can I put a '+' sign to add to the `Exercises` and `Workouts`


    }
}
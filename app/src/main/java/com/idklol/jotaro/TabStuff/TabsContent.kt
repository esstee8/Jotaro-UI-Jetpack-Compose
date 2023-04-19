package com.idklol.jotaro.TabStuff

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.idklol.jotaro.ExerciseTabStuff.ExerciseList
import com.idklol.jotaro.WorkoutList

// on below line we are creating a tab content method
// in which we will be displaying the individual page of our tab .
@ExperimentalPagerApi
@Composable
fun TabsContent(pagerState: PagerState) {
    // on below line we are creating
    // horizontal pager for our tab layout.
    HorizontalPager(state = pagerState) {
        // on below line we are specifying
        // the different pages.
            page ->
        when (page) {
            // on below line we are calling tab content screen
            // and specifying data as Home Screen.
//            0 -> TabContentScreen(data = "Exercise Screen")
            // TODO: Make an Exercise View
            0 -> ExerciseList()
            // on below line we are calling tab content screen
            // and specifying data as Shopping Screen.
//            1 -> TabContentScreen(data = "Workout Screen")
            // TODO: Make a Workouts View
            1 -> WorkoutList()
            // on below line we are calling tab content screen
            // and specifying data as Settings Screen.
//            2 -> TabContentScreen(data = "Settings Screen")
            // TODO: Make a Settings View
            2 -> Text("")
        }
    }
}

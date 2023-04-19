package com.idklol.jotaro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AddCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.idklol.jotaro.ui.theme.JotaroTheme
import kotlin.math.round

// TODO: 1) Isolate the packages such that we only need to send it info
//  TODO: 2) Then, we can just create a new project, follow a tutorial, then,


@OptIn(ExperimentalPagerApi::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JotaroTheme {
                // navController  :Do when tab layout is changed
//                val navController = rememberNavController()
//                NavHost(navController = navController, startDestination = "profile") {
//                    composable("Exercises") { VerticalExerciseList(exerciseItems = ) }
//                }
                TabLayout() // TODO: To deprecate (Because google did it :crying emoji:)
//                val backStackEntry = navController.currentBackStackEntryAsState()

            }
        }
    }
}

package com.idklol.jotaro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.idklol.jotaro.BottomBar.BottomNav

// TODO: 1) Isolate the packages such that we only need to send it info
//  TODO: 2) Then, we can just create a new project, follow a tutorial, then,


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // TODO: Can we add gradient backgrounds?
            BottomNav()

        }
    }
}

package com.idklol.jotaro.SettingsStuff

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.idklol.jotaro.ui.theme.gradientRB

@Composable
fun SettingsScreen() {
    // TODO: Make background color change global
    Surface(modifier = Modifier.background(gradientRB)) {
        Text(text = "This the Settings Screen")
    }

}

@Preview(showBackground = true)
@Composable
fun SettingsScreenPreview() {
    SettingsScreen()
}
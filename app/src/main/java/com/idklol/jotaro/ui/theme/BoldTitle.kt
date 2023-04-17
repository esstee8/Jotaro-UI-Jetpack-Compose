package com.idklol.jotaro.ui.theme

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight

@Composable
// Given a String (which is presumably a title) returns a text composable
//  that gives it a Bold font weight
// TODO: Convert this to a 'title' composable? Meaning, we don't just define the fontwieght, but
//  every other characteristic that relates to the 'title'.
fun BoldText(titleText: String) {
    Text(titleText, fontWeight = FontWeight.Bold)
}
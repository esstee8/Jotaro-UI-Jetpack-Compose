package com.idklol.jotaro

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.idklol.jotaro.ui.theme.jotaroDarkIntenseBlue

@Composable
fun TitleText(title: String){
    Text( // Returns this Text composable
        text = title,
        style = MaterialTheme.typography.h1,
        textAlign = TextAlign.Center,
        color = jotaroDarkIntenseBlue,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = 1.sp,
    )
}
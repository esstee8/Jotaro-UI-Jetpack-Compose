package com.idklol.jotaro

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp

@Composable
fun LineText(line: String){
    Text(
        text = line,
        style = MaterialTheme.typography.subtitle2,
        textAlign = TextAlign.Center,
        fontStyle = FontStyle.Italic,
        fontSize = 16.sp,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis
    )
}
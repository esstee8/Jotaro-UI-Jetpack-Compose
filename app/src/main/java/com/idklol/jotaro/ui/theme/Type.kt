package com.idklol.jotaro.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.idklol.jotaro.R

val SecularOneRegular = FontFamily(
    Font(R.font.secular_one_regular)
)

val AnonymousProItalic = FontFamily(
    Font(R.font.anonymous_pro_italic)
)

val ComfortaaLight = FontFamily(
    Font(R.font.comfortaa_light)
)

val ArvoFamily = FontFamily(
    Font(R.font.arvo_italic, FontWeight.Thin),
    Font(R.font.arvo_bold, FontWeight.Bold),
    Font(R.font.arvo_regular, FontWeight.Normal)
)

// Set of Material typography styles to start with
val Typography = Typography(

    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    h1 = TextStyle(
            fontFamily = SecularOneRegular,
            fontWeight = FontWeight.Normal,
            fontSize = 32.sp
    ),
    subtitle2 = TextStyle(
        fontFamily = ArvoFamily, // From the 'Arvo' set of fonts, select the version we denoted as 'Thin'
        fontWeight = FontWeight.Thin,
        fontSize = 20.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)
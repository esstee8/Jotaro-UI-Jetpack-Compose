package com.idklol.jotaro.Models

data class Exercise(
    val id: String,
    val name: String,
    val title: String,
    val primer: String,
    val type: String,
    val primary: List<String>,
    val secondary: List<String>,
    val equipment: List<String>,
    val steps: List<String>,
    val tips: List<String>,
    val references: List<String>,
    val svg: List<String>,
    val png: List<String>
)

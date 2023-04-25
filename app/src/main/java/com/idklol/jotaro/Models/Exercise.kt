package com.idklol.jotaro.Models

data class Exercise(
    val id: String = "",
    val name: String = "",
    val title: String = "",
    val primer: String = "",
    val type: String = "",
    val primary: List<String> = listOf(""),
    val secondary: List<String> = listOf(""),
    val equipment: List<String> = listOf(""),
    val steps: List<String> = listOf(""),
    val tips: List<String> = listOf(""),
    val references: List<String> = listOf(""),
    val svg: List<String> = listOf("", ""),
    val png: List<String> = listOf("", "")
)

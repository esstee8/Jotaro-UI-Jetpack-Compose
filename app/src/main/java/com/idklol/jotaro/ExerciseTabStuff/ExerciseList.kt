package com.idklol.jotaro.ExerciseTabStuff

import androidx.compose.runtime.Composable
import com.google.gson.Gson
import com.idklol.jotaro.Models.Exercise


@Composable
// Load the internal JSON data, then display it in VerticalExerciseList
fun ExerciseList() {
    // Load gson, create java array, then convert it to kotlin array for loading
    //  into `VerticalExerciseList` (which internally uses LazyColumn)
    val gson = Gson()
    // So, just put the string data in a Data Class. Doesn't matter what the input text is, since it
    //  (the `ExerciseJSONData` class) always has the json data as default
    val jsonData = ExerciseJSONData("").json_data
    // Then, deserialize the JSON data into a kotlin List
    val exerciseList = gson.fromJson(jsonData, Array<Exercise>::class.java).asList()
    // Then display it into a LazyColumn
    VerticalExerciseList(exerciseItems = exerciseList)

}

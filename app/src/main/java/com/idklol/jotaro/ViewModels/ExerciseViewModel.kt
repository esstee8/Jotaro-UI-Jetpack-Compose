package com.idklol.jotaro.ViewModels

import androidx.lifecycle.ViewModel
import com.idklol.jotaro.Assets.BaseData.DefaultExercises
import com.idklol.jotaro.ExerciseStuff.gson
import com.idklol.jotaro.Models.Exercise

class ExerciseViewModel : ViewModel() {
    /*          Exercise           */
    //TODO: (2) If there's a change, that's when we start saving it. Adjust the code below correspondingly w/a boolean
    private var _exercises = getDefaultWorkouts()

    //Get workouts (HERE TOO, IT HAS TO BE ADAPTED FROM DEFAULT/NON-DEFAULT
    val exercises: List<Exercise>
        get() = _exercises

    // Remove item
    fun remove(item: Exercise) {
        var exercisesMutable = _exercises.toMutableList()
        val itemIndex = exercisesMutable.indexOf(item)
        exercisesMutable.removeAt(itemIndex)
        _exercises = exercisesMutable.toList()
    }


}

// Returns default list of Exercises items.
private fun getDefaultWorkouts() : List<Exercise> {
    // extract the data as String
    val exercisesDefault = DefaultExercises()
    val exercise_json_string = exercisesDefault.defaultWorkouts

    val exercise_samples = gson.fromJson(
        exercise_json_string,
        Array<Exercise>::class.java).asList()

    return exercise_samples

}
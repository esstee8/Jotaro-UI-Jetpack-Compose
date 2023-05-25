package com.idklol.jotaro.ViewModels

import androidx.lifecycle.ViewModel
import com.idklol.jotaro.Assets.BaseData.DefaultWorkouts
import com.idklol.jotaro.ExerciseStuff.gson
import com.idklol.jotaro.Models.Workout

class WorkoutViewModel : ViewModel() {
    private val _workouts = getDefaultWorkouts()


}

// Returns default list of Workout items.
private fun getDefaultWorkouts() : List<Workout> {
    // extract the data as String
    val workoutsDefault = DefaultWorkouts()
    val workout_json_string = workoutsDefault.defaultWorkouts

    // convert it to Array<T>.asList()
    val workout_samples = gson.fromJson(
        workout_json_string,
        Array<Workout>::class.java).asList()

    return workout_samples

}
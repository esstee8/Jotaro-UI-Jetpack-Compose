package com.idklol.jotaro.ViewModels

import androidx.lifecycle.ViewModel
import com.idklol.jotaro.Assets.BaseData.DefaultWorkouts
import com.idklol.jotaro.ExerciseStuff.gson
import com.idklol.jotaro.Models.Workout

class WorkoutViewModel : ViewModel() {
    /*          WORKOUTS           */
    //TODO: (1) If there's a change, that's when we start saving it. Adjust the code below correspondingly w/a boolean
    private var _workouts = getDefaultWorkouts()

    //Get workouts  (HERE TOO, IT HAS TO BE ADAPTED FROM DEFAULT/NON-DEFAULT
    val workouts: List<Workout>
        get() = _workouts

    // Remove item
    fun remove(item: Workout) {
        var workoutsMutable = _workouts.toMutableList()
        val itemIndex = workoutsMutable.indexOf(item)
        workoutsMutable.removeAt(itemIndex)
        _workouts = workoutsMutable.toList()
    }


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
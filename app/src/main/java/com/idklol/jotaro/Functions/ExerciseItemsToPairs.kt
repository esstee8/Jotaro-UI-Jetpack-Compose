package com.idklol.jotaro.Functions

import com.idklol.jotaro.Models.Exercise

// Given: A list of Exercises
// Splits the list in half, and pairs them with a rolling 2-step for loop
// Returns: A list of Exercise pairs (if the list is odd, returns the last pair with the 2nd element as en empty Exercise)
fun ExerciseItemsToPairs(exerciseItems: List<Exercise>): Array<Pair<Exercise, Exercise>> {
    // From a linear list, split list in half and pair each item
    //  for a resultant array of pairs. For use with `VerticalGrid`. That's it.
    var exercisePairs: Array<Pair<Exercise, Exercise>> = arrayOf()
    var length = exerciseItems.size
    // A rolling window of two indices at a time. Build the 'pairs' list
    for (idx in 0 until length step 2) {
        if (idx+1 < length) {
            // Add current and next. Also, even sized lengths end here
            var pairEven = Pair(exerciseItems.get(idx), exerciseItems.get(idx+1))
            exercisePairs += pairEven
        } else {
            // This is where odd sized lists end
            val emptyExercise = Exercise()
            var pairOdd = Pair(exerciseItems.get(idx), emptyExercise )
            exercisePairs += pairOdd
        }
    }
    return exercisePairs
}
package com.idklol.jotaro.Models
import com.google.gson.annotations.SerializedName

data class Workout (
	@SerializedName("workout_id") val workout_id : Int,
	@SerializedName("title") val title : String,
	@SerializedName("exercises") val exercises : List<Int>,
	@SerializedName("notes") val notes : List<String>
)
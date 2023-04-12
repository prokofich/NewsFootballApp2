package com.example.football2.api

import com.example.football2.model.item_workout_day
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @POST("ios/ask.php")
    suspend fun setQuestion()

    @GET("ios/monday.json")
    suspend fun getWorkoutMonday():Response<item_workout_day>

    @GET("ios/tuesday.json")
    suspend fun getWorkoutTuesday():Response<item_workout_day>

    @GET("ios/wednesday.json")
    suspend fun getWorkoutWednesday():Response<item_workout_day>

    @GET("ios/thursday.json")
    suspend fun getWorkoutThursday():Response<item_workout_day>

    @GET("ios/friday.json")
    suspend fun getWorkoutFriday():Response<item_workout_day>

    @GET("ios/saturday.json")
    suspend fun getWorkoutSaturday():Response<item_workout_day>

    @GET("ios/sunday.json")
    suspend fun getWorkoutSunday():Response<item_workout_day>

}
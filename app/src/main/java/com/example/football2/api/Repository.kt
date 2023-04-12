package com.example.football2.api

import com.example.football2.model.item_workout_day
import retrofit2.Response

class Repository {

    suspend fun setQuestion(){
        RetrofitInstance.api.setQuestion()
    }

    suspend fun getWorkoutMonday():Response<item_workout_day>{
        return RetrofitInstance.api.getWorkoutMonday()
    }

    suspend fun getWorkoutTuesday():Response<item_workout_day>{
        return RetrofitInstance.api.getWorkoutTuesday()
    }

    suspend fun getWorkoutWednesday():Response<item_workout_day>{
        return RetrofitInstance.api.getWorkoutWednesday()
    }

    suspend fun getWorkoutThursday():Response<item_workout_day>{
        return RetrofitInstance.api.getWorkoutThursday()
    }

    suspend fun getWorkoutFriday():Response<item_workout_day>{
        return RetrofitInstance.api.getWorkoutFriday()
    }

    suspend fun getWorkoutSaturday():Response<item_workout_day>{
        return RetrofitInstance.api.getWorkoutSaturday()
    }

    suspend fun getWorkoutSunday():Response<item_workout_day>{
        return RetrofitInstance.api.getWorkoutSunday()
    }

}
package com.example.football2.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.football2.api.Repository
import com.example.football2.model.item_workout_day
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Response

class WorkoutViewModel:ViewModel() {

    val repo = Repository()
    var workout:MutableLiveData<Response<item_workout_day>> = MutableLiveData()

    fun getWorkout(day:String){

        when(day){
            "MONDAY" -> {
                viewModelScope.launch(Dispatchers.IO) {
                    val response = repo.getWorkoutMonday()
                    withContext(Dispatchers.Main){
                        workout.value = response
                    }
                }
            }
            "TUESDAY" -> {
                viewModelScope.launch(Dispatchers.IO) {
                    val response = repo.getWorkoutTuesday()
                    withContext(Dispatchers.Main){
                        workout.value = response
                    }
                }
            }
            "WEDNESDAY" -> {
                viewModelScope.launch(Dispatchers.IO) {
                    val response = repo.getWorkoutWednesday()
                    withContext(Dispatchers.Main){
                        workout.value = response
                    }
                }
            }
            "THURSDAY" -> {
                viewModelScope.launch(Dispatchers.IO) {
                    val response = repo.getWorkoutThursday()
                    withContext(Dispatchers.Main){
                        workout.value = response
                    }
                }
            }
            "FRIDAY" -> {
                viewModelScope.launch(Dispatchers.IO) {
                    val response = repo.getWorkoutFriday()
                    withContext(Dispatchers.Main){
                        workout.value = response
                    }
                }
            }
            "SATURDAY" -> {
                viewModelScope.launch(Dispatchers.IO) {
                    val response = repo.getWorkoutSaturday()
                    withContext(Dispatchers.Main){
                        workout.value = response
                    }
                }
            }
            "SUNDAY" -> {
                viewModelScope.launch(Dispatchers.IO) {
                    val response = repo.getWorkoutSunday()
                    withContext(Dispatchers.Main){
                        workout.value = response
                    }
                }
            }
        }

    }

}
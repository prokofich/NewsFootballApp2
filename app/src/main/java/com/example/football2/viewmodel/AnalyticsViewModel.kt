package com.example.football2.viewmodel


import androidx.lifecycle.ViewModel
import com.example.football2.MAIN

class AnalyticsViewModel:ViewModel() {

    fun updateProgress(distance:Int,squats:Int){
        val weight = MAIN.getWeightsharedPreferences()
        var progress = ((distance*1000 + squats*10)*weight)/10
        MAIN.updateProgressSharedPreferences(progress)
    }


}
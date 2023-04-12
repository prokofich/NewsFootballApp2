package com.example.football2.viewmodel

import androidx.lifecycle.ViewModel
import com.example.football2.MAIN

class RegistrationViewModel:ViewModel() {

    fun checkInputData(name:String,height:String,weight:String):Boolean{
        return name.isNotEmpty() && height.isNotEmpty() && weight.isNotEmpty()
    }

    fun checkSharedPreferences(): Boolean {
        var nameSharedPreferences = MAIN.getNamesharedPreferences()
        var heightSharedPreferences = MAIN.getHeightsharedPreferences()
        var weightSharedPreferences = MAIN.getWeightsharedPreferences()
        return nameSharedPreferences!="" && heightSharedPreferences!=0 && weightSharedPreferences!=0
    }

    fun setInputDataSharedPreferences(name: String,height: Int,weight: Int){
        MAIN.setsharedPreferences(name, height, weight)
    }

}
package com.example.football2.viewmodel

import androidx.lifecycle.ViewModel
import com.example.football2.MAIN

class SettingsViewModel:ViewModel() {

    fun clearPersonalData(){
        MAIN.clearPersonalData()
    }

}
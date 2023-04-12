package com.example.football2.view

import android.content.Context
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.football2.*
import kotlinx.android.synthetic.main.fragment_workout.*
import java.time.LocalDate

class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MAIN = this
        navController = Navigation.findNavController(this,R.id.id_nav_host)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            var today = LocalDate.now().toString()
            if(today!=getLastDaySharedPreferences()){
                updateProgressSharedPreferences(0)
                setLastDaySharedPreferences(today)
            }else{
                setLastDaySharedPreferences(today)
            }
        }


    }

    fun getNamesharedPreferences():String{
        val namePreferences = getSharedPreferences(APP_PREFERENCES,Context.MODE_PRIVATE).getString(NAME,"")
        return namePreferences ?: ""
    }

    fun getHeightsharedPreferences():Int{
        val heightPreferences = getSharedPreferences(APP_PREFERENCES,Context.MODE_PRIVATE).getInt(HEIGHT,0)
        return heightPreferences ?: 0
    }

    fun getWeightsharedPreferences():Int{
        val weightPreferences = getSharedPreferences(APP_PREFERENCES,Context.MODE_PRIVATE).getInt(WEIGHT,0)
        return weightPreferences ?: 0
    }

    fun getProgressSharedPreferences():Int{
        val progressSharedPreferences = getSharedPreferences(APP_PREFERENCES,Context.MODE_PRIVATE).getInt(PROGRESS,0)
        return progressSharedPreferences ?: 0
    }

    fun getLastDaySharedPreferences():String{
        val lastDaySharedPreferences = getSharedPreferences(APP_PREFERENCES,Context.MODE_PRIVATE).getString(LAST_DAY,"")
        return lastDaySharedPreferences ?: ""
    }

    fun updateProgressSharedPreferences(progress:Int){
        val progressSharedPreferences = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE)
        progressSharedPreferences.edit()
            .putInt(PROGRESS,progress)
            .apply()
    }

    fun setsharedPreferences(name:String,height:Int,weight:Int){
        val namePreferences = getSharedPreferences(APP_PREFERENCES,Context.MODE_PRIVATE)
        namePreferences.edit()
            .putString(NAME,name)
            .putInt(HEIGHT,height)
            .putInt(WEIGHT,weight)
            .apply()
    }

    fun setLastDaySharedPreferences(lastDay:String){
        val lastDayPreferences = getSharedPreferences(APP_PREFERENCES,Context.MODE_PRIVATE)
        lastDayPreferences.edit()
            .putString(LAST_DAY,lastDay)
            .apply()
    }

    fun clearPersonalData(){
        val dataPreferences = getSharedPreferences(APP_PREFERENCES,Context.MODE_PRIVATE)
        dataPreferences.edit()
            .putString(NAME,"")
            .putInt(HEIGHT,0)
            .putInt(WEIGHT,0)
            .apply()
        updateProgressSharedPreferences(0)

    }

}
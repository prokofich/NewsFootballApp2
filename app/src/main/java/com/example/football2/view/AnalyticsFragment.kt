package com.example.football2.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.football2.MAIN
import com.example.football2.PROGRESS
import com.example.football2.R
import com.example.football2.viewmodel.AnalyticsViewModel
import kotlinx.android.synthetic.main.fragment_analytics.*
import kotlinx.android.synthetic.main.fragment_menu.*

class AnalyticsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_analytics, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if(MAIN.getProgressSharedPreferences()>25000){
            id_analytics_progress_points.text = "цель достигнута"
        }else{
            id_analytics_progress_points.text = "прогресс ${MAIN.getProgressSharedPreferences()}"
        }


        val viewModelAnalytics = ViewModelProvider(this)[AnalyticsViewModel::class.java]

        id_analytics_insert.setOnClickListener {

            viewModelAnalytics.updateProgress(id_analytics_distance.text.toString().toInt(),id_analytics_squats.text.toString().toInt())

            id_analytics_distance.setText("")
            id_analytics_squats.setText("")

            if(MAIN.getProgressSharedPreferences()>25000){
                id_analytics_progress_points.text = "цель достигнута"
            }else{
                id_analytics_progress_points.text = "прогресс ${MAIN.getProgressSharedPreferences()}"
            }

        }

    }

}
package com.example.football2.view


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.football2.MAIN
import com.example.football2.R
import kotlinx.android.synthetic.main.fragment_menu.*


class MenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if((MAIN.getProgressSharedPreferences())>=25000){
            id_menu_progress_points.text = "цель достигнута"
        }else{
            id_menu_progress_points.text = "прогресс ${MAIN.getProgressSharedPreferences()}"
        }


        id_menu_settings.setOnClickListener {
            MAIN.navController.navigate(R.id.action_menuFragment_to_settingsFragment)
        }

        id_menu_question_coach.setOnClickListener {
            MAIN.navController.navigate(R.id.action_menuFragment_to_questionFragment)
        }

        id_menu_analytics.setOnClickListener {
            MAIN.navController.navigate(R.id.action_menuFragment_to_analyticsFragment)
        }

        id_menu_workout.setOnClickListener {
            MAIN.navController.navigate(R.id.action_menuFragment_to_workoutFragment)
        }



    }

}
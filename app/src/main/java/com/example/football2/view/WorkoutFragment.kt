package com.example.football2.view


import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.football2.R
import com.example.football2.viewmodel.WorkoutViewModel
import kotlinx.android.synthetic.main.fragment_workout.*
import java.time.LocalDate


class WorkoutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_workout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewModelWorkout = ViewModelProvider(this)[WorkoutViewModel::class.java]

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            id_workout_dayweek.text = LocalDate.now().dayOfWeek.toString()
            viewModelWorkout.getWorkout(LocalDate.now().dayOfWeek.toString())
        }

        viewModelWorkout.workout.observe(viewLifecycleOwner){ response ->
            Glide.with(requireContext())
                .load(response.body()?.get(0)!!.img)
                .into(id_workout_image)
            id_workout_text.text = response.body()?.get(0)!!.text
        }

    }

}
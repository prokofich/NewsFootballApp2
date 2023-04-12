package com.example.football2.view

import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.football2.MAIN
import com.example.football2.R
import com.example.football2.viewmodel.RegistrationViewModel
import kotlinx.android.synthetic.main.fragment_registration.*

class RegistrationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_registration, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewModelRegistration = ViewModelProvider(this).get(RegistrationViewModel::class.java)

        if(viewModelRegistration.checkSharedPreferences()){
            MAIN.navController.navigate(R.id.action_registrationFragment_to_menuFragment)
        }

        id_registration_go.setOnClickListener {
            val name = id_registration_name.text.toString()
            val height = id_registration_height.text.toString()
            val weight = id_registration_weight.text.toString()

            if(viewModelRegistration.checkInputData(name, height, weight)){

               viewModelRegistration.setInputDataSharedPreferences(name,height.toInt(),weight.toInt())
                MAIN.navController.navigate(R.id.action_registrationFragment_to_menuFragment)

            }else{
                Toast.makeText(requireContext(),"Некорректно введены данные",Toast.LENGTH_SHORT).show()
            }

        }


    }

}
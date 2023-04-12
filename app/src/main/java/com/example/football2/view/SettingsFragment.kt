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
import com.example.football2.viewmodel.SettingsViewModel
import kotlinx.android.synthetic.main.fragment_settings.*

class SettingsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_settings, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewModelSettings = ViewModelProvider(this)[SettingsViewModel::class.java]

        id_settings_clear.setOnClickListener {
            viewModelSettings.clearPersonalData()
            MAIN.updateProgressSharedPreferences(0)
            MAIN.navController.navigate(R.id.action_settingsFragment_to_registrationFragment)
        }

    }

}
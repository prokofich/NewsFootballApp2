package com.example.football2.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.football2.api.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class QuestionViewModel:ViewModel() {

    val repo = Repository()

    fun setQuestion(){
        viewModelScope.launch(Dispatchers.IO) {
            repo.setQuestion()
        }
    }

}
package com.example.football2.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.football2.R
import com.example.football2.viewmodel.QuestionViewModel
import kotlinx.android.synthetic.main.fragment_question.*

class QuestionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_question, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewModelQuestion = ViewModelProvider(this)[QuestionViewModel::class.java]

        id_question_button_go.setOnClickListener {
            id_question_textview_question.text = id_question_edittext.text.toString()
            id_question_textview_response.text = "запрос обрабатывается"
            id_question_edittext.setText("")
            viewModelQuestion.setQuestion()
        }

    }

}
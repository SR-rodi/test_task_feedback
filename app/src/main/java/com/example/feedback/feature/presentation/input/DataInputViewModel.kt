package com.example.feedback.feature.presentation.input

import androidx.lifecycle.ViewModel

import com.example.feedback.feature.data.Feedback

class DataInputViewModel : ViewModel() {

    fun createFeedBack(name: String, them: String, description: String) =
        if (name == EMPTY || them == EMPTY || description == EMPTY) false
        else {
            Feedback.name = name
            Feedback.theme = them
            Feedback.descriptions = description
            true
        }

    companion object {
        const val EMPTY = ""
    }
}
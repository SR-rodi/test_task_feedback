package com.example.feedback.feature.presentation.output

import androidx.lifecycle.ViewModel
import com.example.feedback.feature.data.Feedback

class DataOutputViewModel: ViewModel() {

    fun getFeedBack() = Feedback
}
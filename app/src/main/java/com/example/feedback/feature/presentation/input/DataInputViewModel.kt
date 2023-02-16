package com.example.feedback.feature.presentation.input

import androidx.lifecycle.ViewModel
import com.example.feedback.core.BaseViewModel
import com.example.feedback.feature.domain.module.Feedback
import com.example.feedback.feature.domain.usecase.CreateFeedbackUseCase
import javax.inject.Inject

class DataInputViewModel @Inject constructor(
    private val useCase: CreateFeedbackUseCase
) : BaseViewModel<Feedback>() {
}
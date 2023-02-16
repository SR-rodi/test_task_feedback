package com.example.feedback.feature.presentation.output

import com.example.feedback.core.BaseViewModel
import com.example.feedback.feature.domain.module.Feedback
import com.example.feedback.feature.domain.usecase.GetFeedbackUseCase

class DataOutputViewModel(
    private val useCase: GetFeedbackUseCase
) : BaseViewModel<Feedback>() {
}
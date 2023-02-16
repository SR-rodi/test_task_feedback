package com.example.feedback.feature.domain.usecase.impl

import com.example.feedback.feature.domain.module.Feedback
import com.example.feedback.feature.domain.repository.FeedbackRepository
import com.example.feedback.feature.domain.usecase.CreateFeedbackUseCase
import javax.inject.Inject

class CreateFeedbackUseCaseImpl @Inject constructor(
    private val repository: FeedbackRepository
) : CreateFeedbackUseCase {

    override suspend fun createFeedBack(data: Feedback) {
        repository.createFeedback(data)
    }
}
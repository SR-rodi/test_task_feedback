package com.example.feedback.feature.domain.usecase

import com.example.feedback.feature.domain.module.Feedback

interface CreateFeedbackUseCase {

    suspend fun createFeedBack(data:Feedback)
}
package com.example.feedback.feature.domain.usecase

import com.example.feedback.feature.domain.module.Feedback

interface GetFeedbackUseCase {

    suspend fun getFeedback(): Feedback?
}
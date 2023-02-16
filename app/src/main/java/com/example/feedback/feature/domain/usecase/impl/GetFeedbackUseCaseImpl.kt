package com.example.feedback.feature.domain.usecase.impl

import com.example.feedback.feature.domain.repository.FeedbackRepository
import com.example.feedback.feature.domain.usecase.GetFeedbackUseCase
import javax.inject.Inject

class GetFeedbackUseCaseImpl @Inject constructor(
    private val repository: FeedbackRepository
) : GetFeedbackUseCase {

    override suspend fun getFeedback() = repository.getFeedback()
}
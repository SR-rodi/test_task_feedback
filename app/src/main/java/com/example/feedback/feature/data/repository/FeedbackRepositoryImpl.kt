package com.example.feedback.feature.data.repository

import com.example.feedback.feature.data.fakeapi.FakeFeedbackApi
import com.example.feedback.feature.domain.module.Feedback
import com.example.feedback.feature.domain.repository.FeedbackRepository
import kotlinx.coroutines.delay

class FeedbackRepositoryImpl(private val feedbackApi: FakeFeedbackApi) : FeedbackRepository {

    override suspend fun createFeedback(data: Feedback) {
        delay(1_000) // имитируем работу сервера
        feedbackApi.createFeedback(data.toDto())
    }

    override suspend fun getFeedback(): Feedback? {
        delay(1_000) // имитируем работу сервера
        return feedbackApi.getFeedbackById()?.toFeedback()
    }

}
package com.example.feedback.feature.data.repository

import com.example.feedback.feature.data.fakeapi.FakeFeedbackApi
import com.example.feedback.feature.domain.module.Feedback
import com.example.feedback.feature.domain.repository.FeedbackRepository

class FeedbackRepositoryImpl(private val feedbackApi: FakeFeedbackApi) : FeedbackRepository {

    override suspend fun createFeedback(data: Feedback) = feedbackApi.createFeedback(data.toDto())

    override suspend fun getFeedback() = feedbackApi.getFeedbackById()?.toFeedback()

}
package com.example.feedback.feature.domain.repository

import com.example.feedback.feature.domain.module.Feedback

interface FeedbackRepository {

    suspend fun createFeedback(data: Feedback)

    suspend fun getFeedback(): Feedback?
}
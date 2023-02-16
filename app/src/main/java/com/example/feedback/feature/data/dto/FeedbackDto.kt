package com.example.feedback.feature.data.dto

import com.example.feedback.feature.domain.module.Feedback

class FeedbackDto(
   private val name: String,
   private val theme: String,
   private val descriptions: String
) {
    fun toFeedback() = Feedback(name, theme, descriptions)
}
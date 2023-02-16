package com.example.feedback.feature.domain.module

import com.example.feedback.feature.data.dto.FeedbackDto

class Feedback(
    val name: String,
    val theme: String,
    val descriptions: String
) {
    fun toDto() = FeedbackDto(name, theme, descriptions)
}
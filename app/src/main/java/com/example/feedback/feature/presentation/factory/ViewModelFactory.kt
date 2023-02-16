package com.example.feedback.feature.presentation.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.feedback.feature.domain.usecase.CreateFeedbackUseCase
import com.example.feedback.feature.domain.usecase.GetFeedbackUseCase
import com.example.feedback.feature.presentation.input.DataInputViewModel
import com.example.feedback.feature.presentation.output.DataOutputViewModel
import javax.inject.Inject

class ViewModelFactory @Inject constructor (
    private val createFeedbackUseCase: CreateFeedbackUseCase,
    private val getFeedbackUseCase: GetFeedbackUseCase
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when (modelClass) {
            DataInputViewModel::class.java -> DataInputViewModel(createFeedbackUseCase) as T
            DataOutputViewModel::class.java -> DataOutputViewModel(getFeedbackUseCase) as T
            else -> throw IllegalStateException("no ViewModelProvider")
        }
    }
}
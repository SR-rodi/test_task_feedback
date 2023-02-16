package com.example.feedback.feature.presentation.output

import androidx.lifecycle.viewModelScope
import com.example.feedback.core.BaseViewModel
import com.example.feedback.core.LoadState
import com.example.feedback.feature.domain.module.Feedback
import com.example.feedback.feature.domain.usecase.GetFeedbackUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DataOutputViewModel(
    private val useCase: GetFeedbackUseCase
) : BaseViewModel<Feedback>() {

    init {
        getFeedBack()
    }

    private fun getFeedBack() =
        viewModelScope.launch(Dispatchers.IO + handler) {
            _loadState.value = LoadState.LOADING
            val feedback = useCase.getFeedback()
            if (feedback != null)
                _data.emit(feedback)

            _loadState.value = LoadState.SUCCESS
        }
}
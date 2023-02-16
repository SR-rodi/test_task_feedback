package com.example.feedback.feature.presentation.input

import androidx.lifecycle.viewModelScope
import com.example.feedback.core.BaseViewModel
import com.example.feedback.core.LoadState
import com.example.feedback.feature.domain.module.Feedback
import com.example.feedback.feature.domain.usecase.CreateFeedbackUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

class DataInputViewModel @Inject constructor(
    private val useCase: CreateFeedbackUseCase
) : BaseViewModel<Feedback>() {

    fun createFeedBack(name: String, them: String, description: String) =
        viewModelScope.launch(Dispatchers.IO + handler) {
            if (name == EMPTY && them == EMPTY && description == EMPTY) _loadState.value =
                LoadState.EMPTY_FIELD
            else {
                _loadState.value = LoadState.LOADING
                useCase.createFeedBack(Feedback(name, them, description))
                _loadState.value = LoadState.NEXT
                delay(500)
                _loadState.value = LoadState.SUCCESS
            }
        }

    companion object {
        const val EMPTY = ""
    }
}
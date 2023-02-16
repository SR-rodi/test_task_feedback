package com.example.feedback.core

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow

abstract class BaseViewModel<I : Any> : ViewModel() {

    protected val _loadState = MutableStateFlow(LoadState.SUCCESS)
    val loadState = _loadState.asStateFlow()

    protected val _data = MutableSharedFlow<I>(replay = 1)
    val data = _data.asSharedFlow()

    protected val handler = CoroutineExceptionHandler { _, error ->
        Log.e("Kart", error.toString())
        _loadState.value = LoadState.ERROR
    }
}
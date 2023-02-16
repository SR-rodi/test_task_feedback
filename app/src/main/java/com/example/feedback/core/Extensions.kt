package com.example.feedback.core

import android.content.Context
import com.example.feedback.app.App
import com.example.feedback.di.AppComponent

fun Context.appComponent(): AppComponent =
    when (this) {
        is App -> appComponent
        else -> this.applicationContext.appComponent()
    }
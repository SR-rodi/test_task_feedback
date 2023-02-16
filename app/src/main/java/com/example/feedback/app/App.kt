package com.example.feedback.app

import android.app.Application
import com.example.feedback.di.AppComponent
import com.example.feedback.di.DaggerAppComponent

class App:Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}
package com.example.feedback.di

import com.example.feedback.feature.presentation.factory.ViewModelFactory
import dagger.Component
import javax.inject.Singleton

@Component(modules = [FeedbackModule::class])
@Singleton
interface AppComponent {

     val viewModelFactory: ViewModelFactory

}
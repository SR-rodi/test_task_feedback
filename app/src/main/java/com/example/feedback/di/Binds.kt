package com.example.feedback.di

import com.example.feedback.feature.data.repository.FeedbackRepositoryImpl
import com.example.feedback.feature.domain.repository.FeedbackRepository
import com.example.feedback.feature.domain.usecase.CreateFeedbackUseCase
import com.example.feedback.feature.domain.usecase.GetFeedbackUseCase
import com.example.feedback.feature.domain.usecase.impl.CreateFeedbackUseCaseImpl
import com.example.feedback.feature.domain.usecase.impl.GetFeedbackUseCaseImpl
import dagger.Binds
import javax.inject.Singleton

@dagger.Module
interface Binds {

    @Binds
    @Singleton
    fun bindsSearchRepository(repositoryImpl: FeedbackRepositoryImpl): FeedbackRepository

    @Binds
    @Singleton
    fun bindsGetUseCase(useCaseImpl: GetFeedbackUseCaseImpl): GetFeedbackUseCase

    @Binds
    @Singleton
    fun bindsCreateUseCase(useCaseImpl: CreateFeedbackUseCaseImpl): CreateFeedbackUseCase
}
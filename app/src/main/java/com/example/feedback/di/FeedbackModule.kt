package com.example.feedback.di

import com.example.feedback.feature.data.fakeapi.FakeFeedbackApi
import com.example.feedback.feature.data.repository.FeedbackRepositoryImpl
import com.example.feedback.feature.domain.repository.FeedbackRepository
import com.example.feedback.feature.domain.usecase.impl.CreateFeedbackUseCaseImpl
import com.example.feedback.feature.domain.usecase.impl.GetFeedbackUseCaseImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(
    includes = [
        Binds::class
    ]
)
class FeedbackModule {

    @Provides
    @Singleton
    fun provideFakeApi() = FakeFeedbackApi()

    @Provides
    @Singleton
    fun provideFeedbackRepository(api: FakeFeedbackApi) = FeedbackRepositoryImpl(api)


    @Provides
    @Singleton
    fun provideCreateUseCase(repository: FeedbackRepository) = CreateFeedbackUseCaseImpl(repository)

    @Provides
    @Singleton
    fun provideGetUseCase(repository: FeedbackRepository) = GetFeedbackUseCaseImpl(repository)
}


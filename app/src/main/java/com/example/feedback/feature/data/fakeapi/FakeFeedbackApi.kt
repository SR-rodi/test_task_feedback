package com.example.feedback.feature.data.fakeapi

import com.example.feedback.feature.data.dto.FeedbackDto

/** так как обратная связь должна у нас куда то отправлятся и от кудато получаться мы создадим
 *фейковый апи */
class FakeFeedbackApi {
    private var feedback: FeedbackDto? = null

    suspend fun createFeedback(data: FeedbackDto) {
        feedback = data
    }

    /** так как задание максимально расплывчатое то решаем что обращаемся к конкретному объекту
     *  обратной связи, наприммер по id*/
    suspend fun getFeedbackById(id: Int = 1) = feedback

}
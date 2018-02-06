package com.fernandocejas.cognitive.chatbot.di

import com.ibm.watson.developer_cloud.conversation.v1.Conversation
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageOptions
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class NetworkModule {
    companion object {
        private const val USER = "5bb88465-2121-4676-8122-2410505c1d87"
        private const val PASS = "vRHx3f7Z8jac"
        private const val WORKSPACE = "cbdb4b9c-b231-40f8-ba56-78e48d66eaae"
    }

    @Provides @Singleton fun provideConversationService(): Conversation {
        val conversationService = Conversation(Conversation.VERSION_DATE_2017_05_26)
        conversationService.setUsernameAndPassword(USER, PASS)

        return conversationService
    }

    @Provides fun provideMessageBuilder() = MessageOptions.Builder(NetworkModule.WORKSPACE)
}
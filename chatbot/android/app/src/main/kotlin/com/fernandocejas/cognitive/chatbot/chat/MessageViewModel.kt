package com.fernandocejas.cognitive.chatbot.chat

import com.fernandocejas.cognitive.chatbot.R

data class MessageViewModel(val message: String, val createdAt: String, val type: Type) {
    enum class Type(private val layoutRes: Int) {
        SENT(R.layout.item_message_sent),
        RECEIVED (R.layout.item_message_received);

        fun layoutRes(): Int = layoutRes
    }
}
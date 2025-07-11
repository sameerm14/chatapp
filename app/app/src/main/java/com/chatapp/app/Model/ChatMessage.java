package com.chatapp.app.Model;


import lombok.Data;


@Data
public class ChatMessage {

    private String sender;
    private String content;
    
        public ChatMessage() {}

        public ChatMessage(String sender, String content) {
            this.sender = sender;
            this.content = content;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }



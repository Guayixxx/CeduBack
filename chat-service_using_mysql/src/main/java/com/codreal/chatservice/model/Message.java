package com.codreal.chatservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.ManyToAny;

import java.util.Date;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String senderEmail;
    private Date time = new Date(System.currentTimeMillis());
    private String replymessage;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "chat_id")
    private Chat chat;

    public Message() {
    }

    public Message(int id, String senderEmail, Date time, String replymessage, Chat chat) {
        this.id = id;
        this.senderEmail = senderEmail;
        this.time = time;
        this.replymessage = replymessage;
        this.chat = chat;
    }

}

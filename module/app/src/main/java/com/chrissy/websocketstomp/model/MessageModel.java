package com.chrissy.websocketstomp.model;

import lombok.Data;

@Data
public class MessageModel {
    /**
     * user name
     */
    private String name;

    /**
     * message
     */
    private String message;
}
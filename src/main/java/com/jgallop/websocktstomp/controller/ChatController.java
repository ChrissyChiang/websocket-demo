package com.jgallop.websocktstomp.controller;

import com.jgallop.websocktstomp.model.MyMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    /**
     * <pre>
     * /hello 接收客户端發送此路徑的訊息
     * /topic/greetings 發布消息到訂閱此路徑的客户端
     * </pre>
     * @param message {@link MyMessage} 接受json格式轉物件
     */
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public String chat(MyMessage message) {
        return String.format("", message.getName(), message.getMessage());
    }
}

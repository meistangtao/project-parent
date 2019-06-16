package com.tao.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SmsSend {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @RequestMapping("/sms")
    public void send(String phone){
        Map<String, String> map = new HashMap<>();
        map.put("phone",phone);
        jmsMessagingTemplate.convertAndSend("sms",map);
    }
}



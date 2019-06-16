package com.tao.activmq;


import com.aliyuncs.exceptions.ClientException;
import com.tao.sms.SmsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class SmsListener {

    @Autowired
    private SmsUtil smsUtil;

    @JmsListener(destination = "sms")
    public void sendSms(Map<String,String> map){
        map.put("phone","15087662661");

        try {
            smsUtil.sendSms(map);
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }

}

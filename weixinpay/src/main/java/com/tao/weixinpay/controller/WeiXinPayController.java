package com.tao.weixinpay.controller;

import com.tao.weixinpay.service.WeixinPayService;
import com.tao.weixinpay.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/pay")
public class WeiXinPayController {

    @Autowired 
    private WeixinPayService weixinPayService;

    @RequestMapping("/createNative")
    public Map createNative(){

        System.out.println("============================");
        Map aNative = weixinPayService.createNative(new IdWorker(0, 0).nextId() + "", "13.56");

        System.out.println("aNative = " + aNative);
        return aNative;
    }
}

package com.tao.weixinpay.service.impl;

import com.github.wxpay.sdk.WXPayUtil;
import com.tao.weixinpay.service.WeixinPayService;
import com.tao.weixinpay.util.HttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class WeiXinPayServiceImpl implements WeixinPayService {

    @Value("appid")
    private String appid;

    @Value("partner")
    private String mchId;

    @Value("notifyurl")
    private String notify_url;

    @Value("partnerkey")
    private String partnerkey;


    @Override
    public Map createNative(String out_trade_no,String total_fee) {
        Map<String, String> param = new HashMap<>();
        param.put("appid","wx8397f8696b538317");
        param.put("mch_id","1473426802");
        param.put("nonce_str", WXPayUtil.generateNonceStr());
        param.put("body","品优购");
        param.put("out_trade_no",out_trade_no);
        param.put("total_fee",total_fee);
        param.put("spbill_create_ip","127.0.0.1");
        param.put("notify_url","http://www.itcast.cn");
        param.put("trade_type","NATIVE");

        try {
            String xmlParam = WXPayUtil.generateSignedXml(param, "8A627A4578ACE384017C997F12D68B23");

            HttpClient httpClient = new HttpClient("https://api.mch.weixin.qq.com/pay/unifiedorder");
            httpClient.setHttps(true);
            httpClient.setXmlParam(xmlParam);
            httpClient.post();

            String xmlResult = httpClient.getContent();
            Map<String, String> mapResult = WXPayUtil.xmlToMap(xmlResult);
            System.out.println("xmlResult = " + xmlResult);

            Map<String, String> map = new HashMap<>();
            //map.put("code_url",mapResult.get("code_url"));
            map.put("code_url","http://www.itcast.cn");
            map.put("out_trade_no",out_trade_no);
            map.put("total_fee",total_fee);

            return map;

        } catch (Exception e) {
            e.printStackTrace();
            return new HashMap<>();
        }


    }

    @Override
    public Map queryPayStatus(Map<String, String> map) {
        return null;
    }
}

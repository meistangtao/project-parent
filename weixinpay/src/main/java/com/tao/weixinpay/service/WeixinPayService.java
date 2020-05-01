package com.tao.weixinpay.service;

import java.util.Map;

public interface WeixinPayService {

    /**
     * 生产微信支付二维码
     * @param out_trade_no
     * @param total_fee
     * @return
     */
    Map createNative(String out_trade_no,String total_fee);

    /**
     * 查询支付状态
     * @param map
     * @return
     */
    Map queryPayStatus(Map<String,String> map);
}

package top.bypen.springcloud.services;

import org.springframework.stereotype.Component;

/**
 * @Author: LiangJinpeng
 * @Date: 2020/6/22 11:48
 */
@Component
public class PaymentFallbackService implements  PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}

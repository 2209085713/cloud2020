package top.bypen.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import top.byen.springcloud.entities.CommonResult;
import top.byen.springcloud.entities.Payment;
import top.bypen.springcloud.services.PaymentFeignService;

/**
 * @Author: LiangJinpeng
 * @Date: 2020/6/19 15:52
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout()
    {
        // OpenFeign客户端一般默认等待1秒钟
        return paymentFeignService.paymentFeignTimeout();
    }
}

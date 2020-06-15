package top.bypen.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import top.byen.springcloud.entities.CommonResult;
import top.byen.springcloud.entities.Payment;

/**
 * @Author: LiangJinpeng
 * @Date: 2020/6/15 15:39
 */
@RestController
@Slf4j
public class OrderFeignController {


    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {

        return null;
    }

}

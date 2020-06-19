package top.bypen.springcloud.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import top.byen.springcloud.entities.CommonResult;
import top.byen.springcloud.entities.Payment;

/**
 * @Author: LiangJinpeng
 * @Date: 2020/6/19 15:43
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}

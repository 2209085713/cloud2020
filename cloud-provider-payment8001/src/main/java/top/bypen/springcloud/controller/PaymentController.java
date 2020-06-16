package top.bypen.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import top.byen.springcloud.entities.CommonResult;
import top.byen.springcloud.entities.Payment;
import top.bypen.springcloud.services.PaymentService;

/**
 * @Author: LiangJinpeng
 * @Date: 2020/6/15 13:39
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("插入的结果："+ result);
        if(result > 0){
            return new CommonResult(200,"插入成功~"+serverPort,result);
        }else {
            return new CommonResult(444,"插入失败~"+serverPort,null);
        }
    }

    @GetMapping("/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询的结果："+payment);
        if (payment != null){
            return new CommonResult(200,"查询成功~"+serverPort,payment);
        }else {
            return new CommonResult(444,"查询失败~"+serverPort,null);
        }
    }
}

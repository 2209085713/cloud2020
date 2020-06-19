package top.bypen.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import top.byen.springcloud.entities.CommonResult;
import top.byen.springcloud.entities.Payment;
import top.bypen.springcloud.services.PaymentService;

import java.util.List;
import java.util.concurrent.TimeUnit;

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

    /**
     * 服务发现 获取服务信息
     */
    @Autowired
    private DiscoveryClient discoveryClient;

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

    @GetMapping("/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        for (String service: services) {
            log.info("******element****:"+service);
        }
        //一个微服务下的全部实例
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PROVIDER-SERVICE");
        for (ServiceInstance instance : instances){
            log.info(instance.getHost() + "\t" + instance.getServiceId() + "\t" + instance.getPort() + "\t" + instance.getUri());
        }
        return this.discoveryClient;
    }

    @GetMapping(value = "/feign/timeout")
    public String paymentFeignTimeout(){
        // 业务逻辑处理正确，但是需要耗费3秒钟
        try { TimeUnit.SECONDS.sleep(3); } catch (InterruptedException e) { e.printStackTrace(); }
        return serverPort;
    }
}

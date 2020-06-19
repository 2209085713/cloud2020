package top.bypen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import top.bypen.springcloud.myrule.MyselfRule;

/**
 * @Author: LiangJinpeng
 * @Date: 2020/6/15 14:26
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE-80", configuration = MyselfRule.class)
public class Consumer80Main {
    public static void main(String[] args) {
        SpringApplication.run(Consumer80Main.class, args);
    }
}

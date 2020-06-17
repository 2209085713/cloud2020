package top.bypen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: LiangJinpeng
 * @Date : 2020/6/15 11:30
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Payment8001Main {
    public static void main(String[] args) {
        SpringApplication.run(Payment8001Main.class, args);
    }
}

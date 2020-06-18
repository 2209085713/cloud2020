package top.bypen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: LiangJinpeng
 * @Date: 2020/6/18 11:25
 */
@SpringBootApplication
@EnableDiscoveryClient//该注解用于向使用consul或者zookeeper作为注册中心时注册服务
public class Payment8004Main {
    public static void main(String[] args) {
        SpringApplication.run(Payment8004Main.class, args);
    }
}

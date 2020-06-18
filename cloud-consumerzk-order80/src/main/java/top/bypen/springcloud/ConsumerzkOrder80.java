package top.bypen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: LiangJinpeng
 * @Date: 2020/6/18 11:57
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerzkOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerzkOrder80.class, args);
    }
}

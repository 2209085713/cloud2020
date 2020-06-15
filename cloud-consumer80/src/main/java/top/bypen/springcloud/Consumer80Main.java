package top.bypen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: LiangJinpeng
 * @Date: 2020/6/15 14:26
 */
@SpringBootApplication
@EnableEurekaClient
public class Consumer80Main {

    public static void main(String[] args) {
        SpringApplication.run(Consumer80Main.class, args);
    }
}

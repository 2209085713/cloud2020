package top.bypen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: LiangJinpeng
 * @Date: 2020/6/15 17:00
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7001Main {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001Main.class, args);
    }
}

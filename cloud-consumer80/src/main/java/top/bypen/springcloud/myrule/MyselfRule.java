package top.bypen.springcloud.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: LiangJinpeng
 * @Date: 2020/6/19 14:39
 */
@Configuration
public class MyselfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();//随机
    }
}

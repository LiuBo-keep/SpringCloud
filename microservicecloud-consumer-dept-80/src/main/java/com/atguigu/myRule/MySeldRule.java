package com.atguigu.myRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySeldRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();//目的：用我们重新选择的随机算法代替默认的轮询算法
    }
}

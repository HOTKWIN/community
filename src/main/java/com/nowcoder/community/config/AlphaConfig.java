package com.nowcoder.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

/**
 * @author kwin
 * @create 2019-12-27 9:21
 */
@Configuration
public class AlphaConfig {

    /**
     * 该方法返回的对象将会被装配到容器里
     * @return
     */
    @Bean
    public SimpleDateFormat simpleDateFormat(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
}

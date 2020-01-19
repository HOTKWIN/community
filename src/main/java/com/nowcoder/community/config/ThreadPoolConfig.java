package com.nowcoder.community.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author kwin
 * @create 2020-01-20 6:04
 */
@Configuration
@EnableScheduling
@EnableAsync
public class ThreadPoolConfig {
}

package com.nowcoder.community.config;

import com.nowcoder.community.quartz.AlphaJob;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;

/**
 * @author kwin
 * @create 2020-01-20 6:45
 */
//配置 -> 数据库 -> 调用
@Configuration
public class QuartzConfig {

    //FactoryBean可简化Bean的实例化过程
    //1.通过FactoryBean封装Bean实例化的过程
    //2.将FactoryBean装配到Spring容器里
    //3.将FactoryBean注入给其他的Bean
    //4.该Bean得到的是Factory所管理的对象实例

    //配置JobDetail
//    @Bean
    public JobDetailFactoryBean alphaJobDetail(){
        JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
        factoryBean.setJobClass(AlphaJob.class);
        factoryBean.setName("alphaJob");
        factoryBean.setGroup("alphaJobGroup");
        factoryBean.setDurability(true);
        factoryBean.setRequestsRecovery(true);
        return factoryBean;
    }

    //配置Trigger(SimpleTriggerFactoryBean,CronTriggerFactoryBean)
//    @Bean
    public SimpleTriggerFactoryBean alphaTrigger(JobDetail alphaJobDetail1){
        SimpleTriggerFactoryBean factoryBean = new SimpleTriggerFactoryBean();
        factoryBean.setJobDetail(alphaJobDetail1);
        factoryBean.setName("alphaTrigger");
        factoryBean.setGroup("alphaTriggerGroup");
        factoryBean.setRepeatInterval(3000);
        factoryBean.setJobDataMap(new JobDataMap());
        return factoryBean;
    }
}
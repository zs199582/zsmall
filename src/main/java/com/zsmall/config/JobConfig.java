package com.zsmall.config;

import com.zsmall.job.PrintJob;
import org.quartz.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.config.ScheduledTask;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;

/**
 * @author zhangshuo7@corp.netease.com
 * @date 2020/6/20
 */
@Configuration
@PropertySource("classpath:job.properties")
public class JobConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(JobConfig.class);

    @Value("${printTime}")
    private String jobSchedule;

    @Bean(name ="jobDetail")
    public JobDetail getQuartzDetail(){
        return JobBuilder.newJob(PrintJob.class).withIdentity("testQuartz").storeDurably().build();
    }

    @Bean(name = "jobTrigger")
    public Trigger quartzTrigger(){
        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(Integer.parseInt(jobSchedule)).repeatForever();
        //返回trigger 注册job 注册调度周期
        return TriggerBuilder.newTrigger().forJob(getQuartzDetail()).withIdentity("testQuartz").withSchedule(scheduleBuilder).build();
    }
}

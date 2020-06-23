package com.zsmall.job;

import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;

/**
 * 定时打印job
 * @author zhangshuo7@corp.netease.com
 * @date 2020/6/20
 */
public class PrintJob extends QuartzJobBean {
    @Override
    protected void executeInternal(org.quartz.JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("time now:"+new Date().toString());
    }
}

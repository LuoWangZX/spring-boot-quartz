package com.wzx.job;

/**
 * @author WangZX
 * @create 2018-09-21 16:36
 */

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 定时任务业务处理类，我们继承QuartzJobBean
 * 重写executeInternal方法来实现具体的定时业务逻辑
 */
public class PrintTimeJob extends QuartzJobBean {
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        //取出JobDetail中关联的键值对
        String msg = (String) context.getJobDetail().getJobDataMap().get("msg");
        System.out.println("current time :"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "---" + msg);
    }
}

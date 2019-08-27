package com.stock.myconfig;


import com.stock.util.SampleJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleSchedulerConfig {
    @Bean
    public JobDetail sampleJobDetail() {
        //withIdentity定义 TriggerKey,也可以不设置，会⾃动⽣成⼀个独⼀⽆⼆的 TriggerKey ⽤来区分不同的 Trigger
        //usingJobData("name", "World定时器") 设置SampleJob属性对应的值
        return JobBuilder.newJob(SampleJob.class).withIdentity("sampleJob")
                .usingJobData("name", "当前时间").storeDurably().build();
    }
    @Bean
    public Trigger sampleJobTrigger() {
        //withIntervalInSeconds(10)每隔10秒钟执行一次
        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(10).repeatForever();
        return TriggerBuilder.newTrigger().forJob(sampleJobDetail())
                .withIdentity("sampleTrigger").withSchedule(scheduleBuilder).build
                        ();
    }
}

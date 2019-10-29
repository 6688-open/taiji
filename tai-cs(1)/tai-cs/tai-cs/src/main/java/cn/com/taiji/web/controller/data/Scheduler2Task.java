package cn.com.taiji.web.controller.data;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
//要声明为bean，没有声明启动类启动无法实现定时效果
@Component
public class Scheduler2Task {

    private  static final SimpleDateFormat dataFormat=new SimpleDateFormat("HH:mm:ss");

    // 间隔5秒执行
    @Scheduled(cron = "0/5 * * * * ? ")
    public void reportCurrentTime(){
        System.out.println("现在时间："+dataFormat.format(new Date()));
    }


}

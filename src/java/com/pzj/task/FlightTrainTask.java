package com.pzj.task;

import com.pzj.bean.Note;
import com.pzj.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Component
public class FlightTrainTask {
    @Autowired
    private NoteService noteService;

    private int a=1;

    @Scheduled(cron = "0/5 * * * * ? ") // 间隔5秒执行
    public void taskCycle() {
        System.out.println("使用SpringMVC框架配置定时任务"+a);
        a++;
        //noteService.addNote(new Note(null,""+a,a+""+a,null));
    }
}

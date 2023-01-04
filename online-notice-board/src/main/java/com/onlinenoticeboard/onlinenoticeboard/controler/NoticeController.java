package com.onlinenoticeboard.onlinenoticeboard.controler;

import com.onlinenoticeboard.onlinenoticeboard.model.Notice;
import com.onlinenoticeboard.onlinenoticeboard.service.NoticeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api/noticeBoard")
@RestController
public class NoticeController {
    @Autowired
    private NoticeServices noticeServices;
    @PostMapping
    public Notice createNotice(@RequestBody Notice notice){
return noticeServices.createNotice(notice);
    }

}

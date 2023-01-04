package com.onlinenoticeboard.onlinenoticeboard.controler;

import com.onlinenoticeboard.onlinenoticeboard.model.Notice;
import com.onlinenoticeboard.onlinenoticeboard.service.NoticeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @GetMapping
    public List<Notice> getNotice(){
        return noticeServices.getNotice();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteNotice(@PathVariable Long id){
        boolean delete =false;
        delete=noticeServices.deleteNotice(id);

         Map<String,Boolean> response= new HashMap<>();
        response.put("deleted", delete);
        return ResponseEntity.ok(response);
    }

}

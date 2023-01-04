package com.onlinenoticeboard.onlinenoticeboard.service;

import com.onlinenoticeboard.onlinenoticeboard.repository.NoticeRepo;
import org.springframework.beans.factory.annotation.Autowired;



public class NoticeServiceImplementation implements NoticeServices {
    @Autowired
    private NoticeRepo noticeRepo;
}

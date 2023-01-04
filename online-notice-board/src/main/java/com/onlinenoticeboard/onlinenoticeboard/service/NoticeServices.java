package com.onlinenoticeboard.onlinenoticeboard.service;

import com.onlinenoticeboard.onlinenoticeboard.model.Notice;
import org.springframework.stereotype.Service;

import java.util.List;

public interface NoticeServices {
    Notice createNotice(Notice notice);

    public List<Notice> getNotice();

    public boolean deleteNotice(Long id);
}

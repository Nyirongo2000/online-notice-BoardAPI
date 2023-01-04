package com.onlinenoticeboard.onlinenoticeboard.service;

import com.onlinenoticeboard.onlinenoticeboard.model.Notice;
import org.springframework.stereotype.Service;

public interface NoticeServices {
    Notice createNotice(Notice notice);
}

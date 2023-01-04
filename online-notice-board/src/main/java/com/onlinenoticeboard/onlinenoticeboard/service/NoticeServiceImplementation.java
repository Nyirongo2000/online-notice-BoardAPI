package com.onlinenoticeboard.onlinenoticeboard.service;

import com.onlinenoticeboard.onlinenoticeboard.entity.NoticeEntity;
import com.onlinenoticeboard.onlinenoticeboard.model.Notice;
import com.onlinenoticeboard.onlinenoticeboard.repository.NoticeRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class NoticeServiceImplementation implements NoticeServices {
    @Autowired
    private NoticeRepo noticeRepo;

    @Override
    public Notice createNotice(Notice notice) {

        //       copying values from notice to noticeEntity
        NoticeEntity noticeEntity=new  NoticeEntity();
        BeanUtils.copyProperties(notice,noticeEntity);
        noticeRepo.save(noticeEntity);
        return notice;
    }

    @Override
    public List<Notice> getNotice() {
        List<NoticeEntity> noticeEntities= noticeRepo.findAll();
        //taking notice list from the repo and convert it so that its compartible with the ui list
        //loping through and converting
        List<Notice> noticeList=noticeEntities.stream()
                .map(notices -> new Notice(
                        notices.getNoticeId(),
                        notices.getNoticeTxt()
                ))
                .collect(Collectors.toList());
        return noticeList;
    }
}

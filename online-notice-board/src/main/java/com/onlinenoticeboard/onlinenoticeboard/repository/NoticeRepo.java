package com.onlinenoticeboard.onlinenoticeboard.repository;

import com.onlinenoticeboard.onlinenoticeboard.entity.NoticeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticeRepo extends JpaRepository<NoticeEntity,Long> {

}

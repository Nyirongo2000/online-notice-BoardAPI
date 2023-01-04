package com.onlinenoticeboard.onlinenoticeboard.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notice {

    private Long NoticeId;
    private String NoticeTxt;



}

package com.itbank.day01.vo;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

/*
    B_IDX       integer
    TITLE       vc
    CONTENTS    text
    A_IDX       integer
    V_COUNT     integer
    W_DATE      timestamp

    USERID      vc
    NICK        vc
    EMAIL       vc
*/

@Getter
@Setter
public class BoardVO {
    private int b_idx, a_idx, v_count;
    private String title, contents;
    private String userid, nick, email;
    private Timestamp w_date;
}

package com.itbank.day01.vo;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

/*
A_IDX     INTEGER
USERID    CHARACTER VARYING(20)
USERPW    CHARACTER VARYING(128)
NICK      CHARACTER VARYING(100)
EMAIL     CHARACTER VARYING(50)
TYPE      ENUM('관리자', '일반')
J_DATE    TIMESTAMP  
*/

@Getter
@Setter
public class AccountVO {
  private int a_idx;
  private String userid, userpw;
  private String nick, email, type;
  private Timestamp j_date;
}

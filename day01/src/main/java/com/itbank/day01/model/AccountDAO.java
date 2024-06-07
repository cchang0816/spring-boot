package com.itbank.day01.model;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.itbank.day01.vo.AccountVO;

@Mapper
public interface AccountDAO {

  @Select("select * from account where userid = #{userid} and userpw = #{userpw}")
  public AccountVO selectOne(AccountVO input);

  
  public int insert(AccountVO input);
}

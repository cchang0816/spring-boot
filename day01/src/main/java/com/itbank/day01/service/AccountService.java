package com.itbank.day01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.day01.model.AccountDAO;
import com.itbank.day01.vo.AccountVO;

@Service
public class AccountService {

  @Autowired
  private AccountDAO dao;

  public AccountVO lobin(AccountVO input) {
    return dao.selectOne(input);
  }

  public int signUp(AccountVO input) {
    return dao.insert(input);
  }

}

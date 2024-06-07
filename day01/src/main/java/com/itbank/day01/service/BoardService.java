package com.itbank.day01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.day01.model.BoardDAO;
import com.itbank.day01.vo.BoardVO;

@Service
public class BoardService {

    @Autowired
    private BoardDAO dao;
    
    public List<BoardVO> getBoards() {
        return dao.selectAll();
    }
}

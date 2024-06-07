package com.itbank.day01.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.itbank.day01.vo.BoardVO;

@Mapper
public interface BoardDAO {

    @Select("select * from v_board order by b_idx desc")
    public List<BoardVO> selectAll();
    
}

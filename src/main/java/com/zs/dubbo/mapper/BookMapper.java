package com.zs.dubbo.mapper;

import com.zs.dubbo.model.Book;
import com.zs.dubbo.model.vo.BookVo;

import java.util.List;

public interface BookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    List<BookVo> selectAllBook();

}
package com.zs.dubbo.service;

import com.zs.dubbo.model.Book;

import java.util.Map;

/**
 * @Company
 * @Author Zs
 * @Date Create in 2019/9/7
 **/
public interface IBookService {

    /**
     * 查询所有图书
     *
     * @return
     */
    Map<String, Object> selectAllBook();

    /**
     * 添加图书
     * @param book
     * @return
     */
    Map<String, Object> insertBook(Book book);

}

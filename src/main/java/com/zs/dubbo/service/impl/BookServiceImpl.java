package com.zs.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zs.dubbo.service.IBookService;
import com.zs.dubbo.mapper.BookMapper;
import com.zs.dubbo.model.Book;
import com.zs.dubbo.model.vo.BookVo;
import com.zs.dubbo.util.MapUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * @Company
 * @Author Zs
 * @Date Create in 2019/9/7
 **/
@Service(timeout = 5000)
public class BookServiceImpl implements IBookService {

    @Autowired
    private BookMapper bookMapper;
    @Override
    public Map<String, Object> selectAllBook() {
        List<BookVo> books = bookMapper.selectAllBook();
        return MapUtil.setResultMap(books);
    }

    @Override
    public Map<String, Object> insertBook(Book book) {
        int affectRows = bookMapper.insert(book);
        return MapUtil.setResultMap(affectRows);
    }
}

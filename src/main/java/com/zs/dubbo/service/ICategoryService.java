package com.zs.dubbo.service;

import java.util.Map;

/**
 * @Company
 * @Author Zs
 * @Date Create in 2019/9/7
 **/
public interface ICategoryService {

    /**
     * 查询所i有图书分类
     * @return
     */
    Map<String, Object> selectAllCategory();
}

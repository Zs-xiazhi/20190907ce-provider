package com.zs.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zs.dubbo.service.ICategoryService;
import com.zs.dubbo.mapper.CategoryMapper;
import com.zs.dubbo.model.Category;
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
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public Map<String, Object> selectAllCategory() {
        List<Category> categories = categoryMapper.selectAllCategory();
        return MapUtil.setResultMap(categories);
    }

}

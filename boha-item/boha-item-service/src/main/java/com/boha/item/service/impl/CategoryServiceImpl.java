package com.boha.item.service.impl;

import com.boha.item.mapper.CategoryMapper;
import com.boha.item.pojo.Category;
import com.boha.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CategoryServiceImpl
 * @Description 分类service
 * @Author dengsf
 * @Date 2019/10/22 8:33
 **/
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * @param pid
     * @return java.util.List<com.boha.item.pojo.Category>
     * @Author dengsf
     * @Description 根据父id查询子节点
     * @Date 8:34 2019/10/22
     * @Param [pid]
     */
    @Override
    public List<Category> queryCategoriesByPid(Long pid) {
        Category record = new Category();
        record.setParentId(pid);
        return this.categoryMapper.select(record);
    }
}

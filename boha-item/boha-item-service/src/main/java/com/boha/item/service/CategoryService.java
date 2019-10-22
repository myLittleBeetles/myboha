package com.boha.item.service;

import com.boha.item.pojo.Category;

import java.util.List;

public interface CategoryService {

    /**
     * @Author dengsf
     * @Description 根据父id查询子节点
     * @Date 8:34 2019/10/22
     * @Param [pid]
     * @return java.util.List<com.boha.item.pojo.Category>
     **/
    List<Category> queryCategoriesByPid(Long pid);
}

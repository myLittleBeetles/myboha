package com.boha.item.service;

import com.boha.common.pojo.PageResult;
import com.boha.item.pojo.Brand;

import java.util.List;

/**
 * @ClassName BrandService
 * @Description 品牌service
 * @Author dengsf
 * @Date 2019/10/22 23:10
 **/
public interface BrandService {


    /**
     * @Author dengsf
     * @Description 根据查询条件分页并排序查询品牌信息
     * @Date 23:15 2019/10/22
     * @Param [key, page, rows, sortBy, desc]
     * @return com.boha.common.pojo.PageResult<com.boha.item.pojo.Brand>
     **/
    PageResult<Brand> queryBrandsByPage(String key, Integer page, Integer rows, String sortBy, Boolean desc);

    /**
     * 新增品牌
     *
     * @param brand
     * @param cids
     */
    void saveBrand(Brand brand, List<Long> cids);
}

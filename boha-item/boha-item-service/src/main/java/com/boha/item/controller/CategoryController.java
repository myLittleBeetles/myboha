package com.boha.item.controller;

import com.boha.item.pojo.Category;
import com.boha.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @ClassName CategoryController
 * @Description TODO
 * @Author dengsf
 * @Date 2019/10/22 8:20
 **/
@Controller
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * @Author dengsf
     * @Description 根据父id查询子节点
     * @Date 8:32 2019/10/22
     * @Param [pid]
     * @return org.springframework.http.ResponseEntity<java.util.List<com.boha.item.pojo.Category>>
     **/
    @GetMapping("list")
    public ResponseEntity<List<Category>> queryCategoriesByPid(@RequestParam(value = "pid", defaultValue = "0") Long pid){
        if(pid == null || pid < 0){
            // 响应400，相当于ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            return ResponseEntity.badRequest().build();
        }
        List<Category> categories = this.categoryService.queryCategoriesByPid(pid);
        if(CollectionUtils.isEmpty(categories)){
            //响应404
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(categories);
    }


}

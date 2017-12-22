package com.how2java.service.impl;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.how2java.mapper.CategoryMapper;
import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;
 //CategoryServiceImpl实现其对应的service接口
 //CategoryServiceImpl被注解@Service表示为一个service
//并且装配了categoryMapper
@Service
public class CategoryServiceImpl  implements CategoryService{
    @Autowired  
    CategoryMapper categoryMapper;
     
    public List<Category> list(){
        return categoryMapper.list();
    };
 
}
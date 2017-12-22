package com.how2java.mapper;
  
import java.util.List;
 
import com.how2java.pojo.Category;
  
public interface CategoryMapper {
  //接口，定义一下方法
	//添加  函数名对应的是Category的id
    public void add(Category category);  
    //删除    
    public void delete(int id);  
    // select。 获得单个   
    public Category get(int id);  
     // 更新  
    public void update(Category category);   
      //  获得多个
    public List<Category> list();
     //计算
    public int count();  
     
}
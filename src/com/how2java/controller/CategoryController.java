package com.how2java.controller;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;
 //CategoryController��@Controller��ʾΪ���������Զ�װ����categoryService
//ͨ��@RequestMappingӳ�����·��/listCategory·��������listCategory().
//�� listCategory()�����У�ͨ��categoryService��ȡ��Ȼ�����ڡ�cs�����key��
// ����spring mvc����һ����������
@Controller
@RequestMapping("")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
   
    @RequestMapping("listCategory")
    public ModelAndView listCategory(){
        ModelAndView mav = new ModelAndView();
        List<Category> cs= categoryService.list();
         
        // ����ת������
        mav.addObject("cs", cs);
        // ����jsp·��
        mav.setViewName("listCategory");
        return mav;
    }
 
}
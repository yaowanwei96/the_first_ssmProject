package com.how2java.mapper;
  
import java.util.List;
 
import com.how2java.pojo.Category;
  
public interface CategoryMapper {
  //�ӿڣ�����һ�·���
	//���  ��������Ӧ����Category��id
    public void add(Category category);  
    //ɾ��    
    public void delete(int id);  
    // select�� ��õ���   
    public Category get(int id);  
     // ����  
    public void update(Category category);   
      //  ��ö��
    public List<Category> list();
     //����
    public int count();  
     
}
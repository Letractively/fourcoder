package com.fly.biz.dao.category;

import java.util.List;

import com.fly.biz.common.model.category.CategoryDO;



public interface CategoryDAO {

	/**
	 * ��ȡ������Ŀ��Ϣ
	 * @return
	 */
	public List<CategoryDO> getCategoryList();
	
	/**
	 * �������ƻ�ȡ��Ŀ
	 * @param categoryName
	 * @return
	 */
	public CategoryDO getByCategoryName(String catName);
	
	/**
	 * ������ĿID��ȡ��Ŀ
	 * @param categoryId
	 * @return
	 */
	public CategoryDO getByCategoryId(long catId);
	
	/**
	 * ������Ŀ��Ϣ
	 * @param categoryDO
	 */
	public void saveCategory(CategoryDO categoryDO);
	
	/**
	 * ɾ����Ŀ��Ϣ
	 * @param categoryId
	 */
	public void deleteCategory(long catId);
	
	/**
	 * ������Ŀ��Ϣ
	 * @param categoryDO
	 */
	public void updateCategory(CategoryDO categoryDO);
}

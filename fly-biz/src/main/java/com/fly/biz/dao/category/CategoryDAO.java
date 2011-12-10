package com.fly.biz.dao.category;

import java.util.List;

import com.fly.biz.common.model.category.CategoryDO;



public interface CategoryDAO {

	/**
	 * 获取所有类目信息
	 * @return
	 */
	public List<CategoryDO> getCategoryList();
	
	/**
	 * 根据名称获取类目
	 * @param categoryName
	 * @return
	 */
	public CategoryDO getByCategoryName(String catName);
	
	/**
	 * 根据类目ID获取类目
	 * @param categoryId
	 * @return
	 */
	public CategoryDO getByCategoryId(long catId);
	
	/**
	 * 保存类目信息
	 * @param categoryDO
	 */
	public void saveCategory(CategoryDO categoryDO);
	
	/**
	 * 删除类目信息
	 * @param categoryId
	 */
	public void deleteCategory(long catId);
	
	/**
	 * 更新类目信息
	 * @param categoryDO
	 */
	public void updateCategory(CategoryDO categoryDO);
}

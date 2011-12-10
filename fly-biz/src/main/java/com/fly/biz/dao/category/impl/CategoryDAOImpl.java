package com.fly.biz.dao.category.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fly.biz.common.model.category.CategoryDO;
import com.fly.biz.dao.category.CategoryDAO;

public class CategoryDAOImpl extends SqlMapClientDaoSupport implements CategoryDAO{

	/**
	 * 获取所有类目信息
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<CategoryDO> getCategoryList() {
		return this.getSqlMapClientTemplate().queryForList("getAllCategorys",null);
	}

	/**
	 * 根据名称获取类目
	 * @param categoryName
	 * @return
	 */
	public CategoryDO getByCategoryName(String categoryName) {
		return (CategoryDO)this.getSqlMapClientTemplate().queryForObject("CategoryDAO.getCategoryByName",categoryName);
	}

	/**
	 * 根据类目ID获取类目
	 * @param categoryId
	 * @return
	 */
	public CategoryDO getByCategoryId(long categoryId) {
		return (CategoryDO)this.getSqlMapClientTemplate().queryForObject("CategoryDAO.getCategoryById",categoryId);
	}

	/**
	 * 保存类目信息
	 * @param categoryDO
	 */
	public void saveCategory(CategoryDO categoryDO) {
		this.getSqlMapClientTemplate().insert("CategoryDAO.insertCategory",categoryDO);
	}

	/**
	 * 删除类目信息
	 * @param categoryId
	 */
	public void deleteCategory(long categoryId) {
		this.getSqlMapClientTemplate().delete("CategoryDAO.deleteCategory", categoryId);
	}

	/**
	 * 更新类目信息
	 * @param categoryDO
	 */
	public void updateCategory(CategoryDO categoryDO) {
		this.getSqlMapClientTemplate().update("CategoryDAO.updateCategory", categoryDO);
	}

}

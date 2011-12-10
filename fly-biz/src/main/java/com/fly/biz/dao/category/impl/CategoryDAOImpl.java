package com.fly.biz.dao.category.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fly.biz.common.model.category.CategoryDO;
import com.fly.biz.dao.category.CategoryDAO;

public class CategoryDAOImpl extends SqlMapClientDaoSupport implements CategoryDAO{

	/**
	 * ��ȡ������Ŀ��Ϣ
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<CategoryDO> getCategoryList() {
		return this.getSqlMapClientTemplate().queryForList("getAllCategorys",null);
	}

	/**
	 * �������ƻ�ȡ��Ŀ
	 * @param categoryName
	 * @return
	 */
	public CategoryDO getByCategoryName(String categoryName) {
		return (CategoryDO)this.getSqlMapClientTemplate().queryForObject("CategoryDAO.getCategoryByName",categoryName);
	}

	/**
	 * ������ĿID��ȡ��Ŀ
	 * @param categoryId
	 * @return
	 */
	public CategoryDO getByCategoryId(long categoryId) {
		return (CategoryDO)this.getSqlMapClientTemplate().queryForObject("CategoryDAO.getCategoryById",categoryId);
	}

	/**
	 * ������Ŀ��Ϣ
	 * @param categoryDO
	 */
	public void saveCategory(CategoryDO categoryDO) {
		this.getSqlMapClientTemplate().insert("CategoryDAO.insertCategory",categoryDO);
	}

	/**
	 * ɾ����Ŀ��Ϣ
	 * @param categoryId
	 */
	public void deleteCategory(long categoryId) {
		this.getSqlMapClientTemplate().delete("CategoryDAO.deleteCategory", categoryId);
	}

	/**
	 * ������Ŀ��Ϣ
	 * @param categoryDO
	 */
	public void updateCategory(CategoryDO categoryDO) {
		this.getSqlMapClientTemplate().update("CategoryDAO.updateCategory", categoryDO);
	}

}

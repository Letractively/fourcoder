package com.fly.biz.dao.category.impl;

import java.sql.SQLException;
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
		try {
			return this.getSqlMapClientTemplate().getSqlMapClient().queryForList("getAllCategorys",null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 根据名称获取类目
	 * @param categoryName
	 * @return
	 */
	public CategoryDO getByCategoryName(String categoryName) {
		try {
			return (CategoryDO)this.getSqlMapClientTemplate().getSqlMapClient().queryForObject("CategoryDAO.getCategoryByName",categoryName);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 根据类目ID获取类目
	 * @param categoryId
	 * @return
	 */
	public CategoryDO getByCategoryId(long categoryId) {
		try {
			return (CategoryDO)this.getSqlMapClientTemplate().getSqlMapClient().queryForObject("CategoryDAO.getCategoryById",categoryId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 保存类目信息
	 * @param categoryDO
	 */
	public void saveCategory(CategoryDO categoryDO) {
		try {
			this.getSqlMapClientTemplate().getSqlMapClient().insert("CategoryDAO.insertCategory",categoryDO);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 删除类目信息
	 * @param categoryId
	 */
	public void deleteCategory(long categoryId) {
		try {
			this.getSqlMapClientTemplate().getSqlMapClient().delete("CategoryDAO.deleteCategory", categoryId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 更新类目信息
	 * @param categoryDO
	 */
	public void updateCategory(CategoryDO categoryDO) {
		try {
			this.getSqlMapClientTemplate().getSqlMapClient().update("CategoryDAO.updateCategory", categoryDO);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

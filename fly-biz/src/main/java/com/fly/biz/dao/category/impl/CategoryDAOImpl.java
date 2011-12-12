package com.fly.biz.dao.category.impl;

import java.sql.SQLException;
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
		try {
			return this.getSqlMapClientTemplate().getSqlMapClient().queryForList("getAllCategorys",null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * �������ƻ�ȡ��Ŀ
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
	 * ������ĿID��ȡ��Ŀ
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
	 * ������Ŀ��Ϣ
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
	 * ɾ����Ŀ��Ϣ
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
	 * ������Ŀ��Ϣ
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

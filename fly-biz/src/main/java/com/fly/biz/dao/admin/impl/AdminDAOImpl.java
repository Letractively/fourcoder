package com.fly.biz.dao.admin.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fly.biz.common.model.user.AdminDO;
import com.fly.biz.dao.admin.AdminDAO;

public class AdminDAOImpl extends SqlMapClientDaoSupport implements AdminDAO{

	/**
	 * 获取管理员列表信息
	 */
	@SuppressWarnings("unchecked")
	public List<AdminDO> getAdminList() {
		try {
			return this.getSqlMapClientTemplate().getSqlMapClient().queryForList("getAllAdmins",null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 根据管理员名称获取管理员
	 */
	public AdminDO getByAdminName(String adminName) {
		try {
			return (AdminDO)this.getSqlMapClientTemplate().getSqlMapClient().queryForObject("AdminDAO.getAdminByName",adminName);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 根据ID获取管理员信息
	 */
	public AdminDO getByAdminId(String adminId) {
		try {
			return (AdminDO)this.getSqlMapClientTemplate().getSqlMapClient().queryForObject("AdminDAO.getAdminById",adminId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	/**
	 * 保存管理员信息
	 */
	public void saveAdmin(AdminDO adminDO) {
		try {
			this.getSqlMapClientTemplate().getSqlMapClient().insert("AdminDAO.insertAdmin",adminDO);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 删除管理员信息
	 */
	public void deleteAdmin(long adminId) {
		try {
			this.getSqlMapClientTemplate().getSqlMapClient().delete("AdminDAO.deleteAdmin", adminId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 更新管理员信息
	 */
	public void updateAdmin(AdminDO adminDO) {
		try {
			this.getSqlMapClientTemplate().getSqlMapClient().update("AdminDAO.updateAdmin", adminDO);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

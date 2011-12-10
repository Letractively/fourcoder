package com.fly.biz.dao.admin.impl;

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
		return this.getSqlMapClientTemplate().queryForList("getAllAdmins",null);
	}

	/**
	 * 根据管理员名称获取管理员
	 */
	public AdminDO getByAdminName(String adminName) {
		return (AdminDO)this.getSqlMapClientTemplate().queryForObject("AdminDAO.getAdminByName",adminName);
	}

	/**
	 * 根据ID获取管理员信息
	 */
	public AdminDO getByAdminId(String adminId) {
		return (AdminDO)this.getSqlMapClientTemplate().queryForObject("AdminDAO.getAdminById",adminId);

	}

	/**
	 * 保存管理员信息
	 */
	public void saveAdmin(AdminDO adminDO) {
		this.getSqlMapClientTemplate().insert("AdminDAO.insertAdmin",adminDO);
	}

	/**
	 * 删除管理员信息
	 */
	public void deleteAdmin(long adminId) {
		this.getSqlMapClientTemplate().delete("AdminDAO.deleteAdmin", adminId);
	}

	/**
	 * 更新管理员信息
	 */
	public void updateAdmin(AdminDO adminDO) {
		this.getSqlMapClientTemplate().update("AdminDAO.updateAdmin", adminDO);
	}

}

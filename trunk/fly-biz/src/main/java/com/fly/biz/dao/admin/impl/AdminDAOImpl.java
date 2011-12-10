package com.fly.biz.dao.admin.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fly.biz.common.model.user.AdminDO;
import com.fly.biz.dao.admin.AdminDAO;

public class AdminDAOImpl extends SqlMapClientDaoSupport implements AdminDAO{

	/**
	 * ��ȡ����Ա�б���Ϣ
	 */
	@SuppressWarnings("unchecked")
	public List<AdminDO> getAdminList() {
		return this.getSqlMapClientTemplate().queryForList("getAllAdmins",null);
	}

	/**
	 * ���ݹ���Ա���ƻ�ȡ����Ա
	 */
	public AdminDO getByAdminName(String adminName) {
		return (AdminDO)this.getSqlMapClientTemplate().queryForObject("AdminDAO.getAdminByName",adminName);
	}

	/**
	 * ����ID��ȡ����Ա��Ϣ
	 */
	public AdminDO getByAdminId(String adminId) {
		return (AdminDO)this.getSqlMapClientTemplate().queryForObject("AdminDAO.getAdminById",adminId);

	}

	/**
	 * �������Ա��Ϣ
	 */
	public void saveAdmin(AdminDO adminDO) {
		this.getSqlMapClientTemplate().insert("AdminDAO.insertAdmin",adminDO);
	}

	/**
	 * ɾ������Ա��Ϣ
	 */
	public void deleteAdmin(long adminId) {
		this.getSqlMapClientTemplate().delete("AdminDAO.deleteAdmin", adminId);
	}

	/**
	 * ���¹���Ա��Ϣ
	 */
	public void updateAdmin(AdminDO adminDO) {
		this.getSqlMapClientTemplate().update("AdminDAO.updateAdmin", adminDO);
	}

}

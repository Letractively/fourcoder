package com.fly.biz.dao.admin.impl;

import java.sql.SQLException;
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
		try {
			return this.getSqlMapClientTemplate().getSqlMapClient().queryForList("getAllAdmins",null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * ���ݹ���Ա���ƻ�ȡ����Ա
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
	 * ����ID��ȡ����Ա��Ϣ
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
	 * �������Ա��Ϣ
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
	 * ɾ������Ա��Ϣ
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
	 * ���¹���Ա��Ϣ
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

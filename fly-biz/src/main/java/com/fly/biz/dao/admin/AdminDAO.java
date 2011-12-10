package com.fly.biz.dao.admin;

import java.util.List;

import com.fly.biz.common.model.user.AdminDO;

public interface AdminDAO {

	/**
	 * ��ȡ���й���Ա�б�
	 * @return
	 */
	public List<AdminDO> getAdminList();
	
	/**
	 * �������ƻ�ȡ����Ա
	 * @param adminName
	 * @return
	 */
	public AdminDO getByAdminName(String adminName);
	
	/**
	 * ����ID��ȡ����Ա
	 * @param adminId
	 * @return
	 */
	public AdminDO getByAdminId(String adminId);
	
	/**
	 * �������Ա��Ϣ
	 * @param adminDO
	 */
	public void saveAdmin(AdminDO adminDO);
	
	/**
	 * ����IDɾ������Ա
	 * @param adminId
	 */
	public void deleteAdmin(long adminId);
	
	/**
	 * ���¹���Ա��Ϣ
	 * @param adminDO
	 */
	public void updateAdmin(AdminDO adminDO);
}

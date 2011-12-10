package com.fly.biz.dao.admin;

import java.util.List;

import com.fly.biz.common.model.user.AdminDO;

public interface AdminDAO {

	/**
	 * 获取所有管理员列表
	 * @return
	 */
	public List<AdminDO> getAdminList();
	
	/**
	 * 根据名称获取管理员
	 * @param adminName
	 * @return
	 */
	public AdminDO getByAdminName(String adminName);
	
	/**
	 * 根据ID获取管理员
	 * @param adminId
	 * @return
	 */
	public AdminDO getByAdminId(String adminId);
	
	/**
	 * 保存管理员信息
	 * @param adminDO
	 */
	public void saveAdmin(AdminDO adminDO);
	
	/**
	 * 根据ID删除管理员
	 * @param adminId
	 */
	public void deleteAdmin(long adminId);
	
	/**
	 * 更新管理员信息
	 * @param adminDO
	 */
	public void updateAdmin(AdminDO adminDO);
}

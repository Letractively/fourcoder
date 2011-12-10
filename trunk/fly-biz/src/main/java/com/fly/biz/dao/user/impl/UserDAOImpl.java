package com.fly.biz.dao.user.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fly.biz.common.model.user.UserDO;
import com.fly.biz.dao.user.UserDAO;

public class UserDAOImpl extends SqlMapClientDaoSupport implements UserDAO{

	@SuppressWarnings("unchecked")
	public List<UserDO> getList() {

		return getSqlMapClientTemplate().queryForList("getAllUsers",null);
	}

	public UserDO getByName(String userName) {

		return (UserDO)getSqlMapClientTemplate().queryForObject("UserDAO.getUserByName",userName);
	}

	public UserDO getById(long userId) {
		
		 return (UserDO)getSqlMapClientTemplate().queryForObject("UserDAO.getUserById",userId);
	}

	public void saveUser(UserDO user) {

		this.getSqlMapClientTemplate().insert("UserDAO.insertUser",user);
		
	}

	public void deleteUser(long userId) {

		this.getSqlMapClientTemplate().delete("UserDAO.deleteUser", userId);
		
	}

	public void updateUser(UserDO user) {

		this.getSqlMapClientTemplate().update("UserDAO.updateUser", user);
		
	}

	public List<UserDO> getAllUserList() {
		// TODO Auto-generated method stub
		return null;
	}

}

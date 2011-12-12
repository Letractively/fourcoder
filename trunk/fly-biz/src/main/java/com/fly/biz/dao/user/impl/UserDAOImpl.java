package com.fly.biz.dao.user.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.fly.biz.common.model.user.UserDO;
import com.fly.biz.dao.user.UserDAO;

public class UserDAOImpl extends SqlMapClientDaoSupport implements UserDAO{

	@SuppressWarnings("unchecked")
	public List<UserDO> getList() {

		try {
			return getSqlMapClientTemplate().getSqlMapClient().queryForList("getAllUsers",null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public UserDO getByName(String userName) {

		try {
			return (UserDO)getSqlMapClientTemplate().getSqlMapClient().queryForObject("UserDAO.getUserByName",userName);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public UserDO getById(long userId) {
		
		 try {
			return (UserDO)getSqlMapClientTemplate().getSqlMapClient().queryForObject("UserDAO.getUserById",userId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void saveUser(UserDO user) {

		try {
			this.getSqlMapClientTemplate().getSqlMapClient().insert("UserDAO.insertUser",user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void deleteUser(long userId) {

		try {
			this.getSqlMapClientTemplate().getSqlMapClient().delete("UserDAO.deleteUser", userId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void updateUser(UserDO user) {

		try {
			this.getSqlMapClientTemplate().getSqlMapClient().update("UserDAO.updateUser", user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public List<UserDO> getAllUserList() {
		// TODO Auto-generated method stub
		return null;
	}

}

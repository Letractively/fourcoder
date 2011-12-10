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

	public UserDO getByName(String name) {

		   return (UserDO)getSqlMapClientTemplate().queryForObject("getUsersByName",name);
	}

	public UserDO getById(String id) {
		
		 return (UserDO)getSqlMapClientTemplate().queryForObject("getUsersById",id);
	}

	public void save(UserDO user) {

		 getSqlMapClientTemplate().insert("insertUsers",user);
		
	}

	public void delete(long id) {

		  getSqlMapClientTemplate().delete("deleteUsers", id);
		
	}

	public void update(UserDO user) {

		  getSqlMapClientTemplate().update("updateUsers", user);
		
	}

}

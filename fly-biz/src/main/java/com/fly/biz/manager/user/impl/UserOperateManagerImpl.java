package com.fly.biz.manager.user.impl;

import com.fly.biz.common.model.result.UserResultDO;
import com.fly.biz.common.model.user.UserDO;
import com.fly.biz.dao.user.UserDAO;
import com.fly.biz.manager.user.UserOperateManager;

public class UserOperateManagerImpl implements UserOperateManager{

	private UserDAO userDAO;
	
	public void insertNewUser(UserDO user) {

		userDAO.saveUser(user);
		
	}

	public UserResultDO getSingleUserByUserId(long userId) {
		
		UserDO userDO=userDAO.getById(userId);
		UserResultDO userResultDO = new UserResultDO(true);
		
		if(userDO==null){
			userResultDO.setSuccess(false);
			userResultDO.setErrMsg("No data out !");
		}
		userResultDO.setModule(userDO);
		return userResultDO;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

}

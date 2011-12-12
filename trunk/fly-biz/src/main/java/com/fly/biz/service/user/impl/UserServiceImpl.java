package com.fly.biz.service.user.impl;

import java.sql.SQLException;

import com.fly.biz.common.model.result.UserResultDO;
import com.fly.biz.common.model.user.UserDO;
import com.fly.biz.manager.user.UserOperateManager;
import com.fly.biz.service.user.UserService;


public class UserServiceImpl implements UserService{

	
	private UserOperateManager userOperateManager;

	public void newUserRegister(UserDO userDO) {

		try {
			userOperateManager.insertNewUser(userDO);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public UserResultDO getUserInfoByUserId(long userId) {
		
		return userOperateManager.getSingleUserByUserId(userId);
	}

	public String toTestString() {
		
		return "ok";
	}

	public void setUserOperateManager(UserOperateManager userOperateManager) {
		this.userOperateManager = userOperateManager;
	}

}
package com.fly.biz.service.user;

import com.fly.biz.common.model.result.UserResultDO;
import com.fly.biz.common.model.user.UserDO;

public interface UserService {

	/**
	 * 新用户注册方法
	 * @param userDO
	 */
	public void newUserRegister(UserDO userDO);
	
	/**
	 * 根据用户id查询用户信息
	 * @param userId
	 * @return
	 */
	public UserResultDO getUserInfoByUserId(long userId);
	
	public String toTestString();
	
}

package com.fly.biz.manager.user;

import java.sql.SQLException;

import com.fly.biz.common.model.result.UserResultDO;
import com.fly.biz.common.model.user.UserDO;

public interface UserOperateManager {

	/**
	 * 添加新的用户
	 * @param user
	 * @throws SQLException 
	 */
	public void insertNewUser(UserDO user) throws SQLException;
	
	/**
	 * 根据用户的id查询单个用户
	 * @param userId
	 * @return
	 */
	public UserResultDO getSingleUserByUserId(long userId);
	
}

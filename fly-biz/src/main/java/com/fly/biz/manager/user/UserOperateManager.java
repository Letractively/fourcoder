package com.fly.biz.manager.user;

import java.sql.SQLException;

import com.fly.biz.common.model.result.UserResultDO;
import com.fly.biz.common.model.user.UserDO;

public interface UserOperateManager {

	/**
	 * ����µ��û�
	 * @param user
	 * @throws SQLException 
	 */
	public void insertNewUser(UserDO user) throws SQLException;
	
	/**
	 * �����û���id��ѯ�����û�
	 * @param userId
	 * @return
	 */
	public UserResultDO getSingleUserByUserId(long userId);
	
}

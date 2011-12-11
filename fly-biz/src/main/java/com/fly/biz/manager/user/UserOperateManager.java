package com.fly.biz.manager.user;

import com.fly.biz.common.model.result.UserResultDO;
import com.fly.biz.common.model.user.UserDO;

public interface UserOperateManager {

	/**
	 * ����µ��û�
	 * @param user
	 */
	public void insertNewUser(UserDO user);
	
	/**
	 * �����û���id��ѯ�����û�
	 * @param userId
	 * @return
	 */
	public UserResultDO getSingleUserByUserId(long userId);
	
}

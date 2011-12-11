package com.fly.biz.service.user;

import com.fly.biz.common.model.result.UserResultDO;
import com.fly.biz.common.model.user.UserDO;

public interface UserService {

	/**
	 * ���û�ע�᷽��
	 * @param userDO
	 */
	public void newUserRegister(UserDO userDO);
	
	/**
	 * �����û�id��ѯ�û���Ϣ
	 * @param userId
	 * @return
	 */
	public UserResultDO getUserInfoByUserId(long userId);
	
	public String toTestString();
	
}

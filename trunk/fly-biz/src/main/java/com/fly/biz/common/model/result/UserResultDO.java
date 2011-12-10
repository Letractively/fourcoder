package com.fly.biz.common.model.result;

import com.fly.biz.common.model.user.UserDO;

public class UserResultDO extends ResultDO<UserDO>{

	public UserResultDO(){
		
	}
	
	public UserResultDO(boolean isSuccess){
		super(isSuccess);
	}
}

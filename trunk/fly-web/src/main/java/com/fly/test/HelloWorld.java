package com.fly.test;

import java.util.Date;

import org.apache.log4j.Logger;

import com.fly.biz.common.model.user.UserDO;
import com.fly.biz.service.user.UserService;


public class HelloWorld {
	
	private Logger logger= Logger.getLogger(HelloWorld.class);
	

	private UserService userService;
	
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	public String execute(){

		String message="ok?";
		
			UserDO userDO=new UserDO();
			
			userDO.setBirthday(new Date());
			userDO.setUserId(201112111717L);
			userDO.setUserName("Hengheng");
			userDO.setEmailAddress("minghuisky@126.com");
			userDO.setLastLoginIp("110.110.110.110");
			userDO.setLoginNum(1);
			userDO.setUserPassword("forfourcoders");
			
			userService.newUserRegister(userDO);
			
			

			logger.error(message);

			return "SUCCESS";
	}
	
}  
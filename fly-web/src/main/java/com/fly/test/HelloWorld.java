package com.fly.test;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.Date;

import org.apache.log4j.Logger;

import com.fly.biz.common.model.user.UserDO;
import com.fly.biz.service.user.UserService;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;


public class HelloWorld {

	private UserService userService;	
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	public String execute() throws IOException, SQLException{

			String message="ok?";				
			UserDO userDO=new UserDO();			
			userDO.setBirthday(new Date());
			userDO.setUserId(201112111717L);
			userDO.setUserName("iiiiiii");
			userDO.setEmailAddress("iiiii@126.com");
			userDO.setLastLoginIp("110.110.110.110");
			userDO.setLoginNum(1);
			userDO.setUserPassword("forfourcoders");					
			userService.newUserRegister(userDO);
			return "SUCCESS";
	}
	
}  
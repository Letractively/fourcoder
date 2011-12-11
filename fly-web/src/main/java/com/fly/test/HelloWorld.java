package com.fly.test;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.fly.biz.service.user.UserService;


public class HelloWorld {

	private Logger logger= Logger.getLogger(HelloWorld.class);


	private UserService userService;


	public void setUserService(UserService userService){
		this.userService = userService;
	}


	public String execute(){

			String message="ok?";

			message=userService.toTestString();

			logger.error(message);

			return "SUCCESS";
	}
	
}  
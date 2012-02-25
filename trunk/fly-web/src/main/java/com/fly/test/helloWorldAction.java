package com.fly.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.fly.common.action.BaseAction;
import com.fly.common.util.SessionHelper;
import com.opensymphony.xwork2.ActionContext;

public class helloWorldAction extends BaseAction{
	public String userName;
	public String message;
	private String passWord;
	private user userA;
	private String city;
	private Saver saver;
	
	
	public String execute() throws Exception{
			setMessage("hello"+getUsername());
			SessionHelper sh = new SessionHelper(this.session);
			sh.put("hi", "hiiii");			
			city = "hangzhou ";
			userA.setUserName("userName");
			userA.setPassWord("passWord");
			ActionContext.getContext().getSession().put("msg", "session.msg hahaha");
			HttpServletRequest request = ServletActionContext.getRequest();
	        HttpServletResponse response = ServletActionContext.getResponse();        
	        HttpSession session = request.getSession();
	        session.putValue("msg", "msg from session");
	        saver = new Saver(session);
	        saver.saveSession(session);
			if("userName".equals(userA.getUserName())&&"passWord".equals(userA.getPassWord())){
				message = "ok";
			}else{
				message = "not ok";
			}
			return SUCCESS;
	}
	public user getUserA() {
		return userA;
	}

	public void setUserA(user userA) {
		this.userA = userA;
	}
	
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getUsername() {
		return userName;
	}
	public void setUsername(String username) {
		this.userName = username;
	}
	public void setMessage(String message){
		this.message = message;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}

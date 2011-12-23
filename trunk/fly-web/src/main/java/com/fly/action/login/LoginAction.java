package com.fly.action.login;

import com.fly.common.action.BaseAction;
import com.fly.common.util.SessionHelper;

public class LoginAction extends BaseAction{
	
	/**
	 * Ìø×ª
	 */
	private static final long serialVersionUID = -2841153430630242279L;

	private String username;
	
	private String password;
	
	public String getUsername(){
			return username;
	}
	public void setUsername(String username){
			this.username = username;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String execute() throws Exception{
		if (getUsername().equals("fourcoder")&& getPassword().equals("tiger") ){
			
			SessionHelper sh = new SessionHelper(this.session);
			
			if(sh.get("name")==null){
				sh.put("name", "hengheng");
				
				return SUCCESS;
			}
			return ERROR;

		}
		else
		{
			return ERROR;
		}
	}
}
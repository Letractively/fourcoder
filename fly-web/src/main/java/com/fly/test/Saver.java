package com.fly.test;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

public class Saver {
	public static Map<String,HttpSession> sessionMap = new HashMap<String,HttpSession>();
	HttpSession session;	
	Saver(HttpSession session){	
		this.session = session;		
	}
	public void saveSession(HttpSession session){
		sessionMap.put(session.getId(), session);
	}
}

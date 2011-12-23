package com.fly.common.util;

import java.util.Map;

public class SessionHelper {

	Map<Object, Object> session;
	
	public SessionHelper(Map<Object, Object> session){
		
		this.session=session;
	}
	

	public void put(Object name,Object value){
		
		this.session.put(name, value);
	}
	
	public Object get(Object name){
		
		Object result = this.session.get(name);
		
		return result;
	}
	
	public void remove(Object key){
		
		this.session.remove(key);
	}
	
	public boolean isContainsKey(Object key){
		
		return this.session.containsKey(key);
	}
	
	public void putAllMap(Map<Object,Object> atrributeMap){
		
		this.session.putAll(atrributeMap);
	}
	
	public void clearAllAtrribute(){
		this.session.clear();
	}
}

package com.fly.common.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements SessionAware{

	/**
	 * ����һ��������Action��������action�̳�ʹ��
	 */
	private static final long serialVersionUID = 5369800905735700564L;


	public Map<Object,Object> session;
	
    public void setSession(Map session) {
        this.session = session;
    }

	
	
	
}

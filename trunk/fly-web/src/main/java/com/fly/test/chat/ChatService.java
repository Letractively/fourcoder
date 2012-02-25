package com.fly.test.chat;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//客户端发消息服务类业务
public class ChatService implements ApplicationContextAware {

	private ApplicationContext ctx;
	
	public void setApplicationContext(ApplicationContext ctx)
			throws BeansException {		
		this.ctx = ctx;
	}

	//向服务器发送消息，服务器端监听ChatMessageEvent事件，
	//当有事件触发就向所有客户端发送消息
	public void sendMessage(Message msg){
		//发布事件
		ctx.publishEvent(new ChatMessageEvent(msg));
	}
}

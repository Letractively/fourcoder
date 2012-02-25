package com.fly.test.chat;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//�ͻ��˷���Ϣ������ҵ��
public class ChatService implements ApplicationContextAware {

	private ApplicationContext ctx;
	
	public void setApplicationContext(ApplicationContext ctx)
			throws BeansException {		
		this.ctx = ctx;
	}

	//�������������Ϣ���������˼���ChatMessageEvent�¼���
	//�����¼������������пͻ��˷�����Ϣ
	public void sendMessage(Message msg){
		//�����¼�
		ctx.publishEvent(new ChatMessageEvent(msg));
	}
}

package com.fly.test.chat;

import org.springframework.context.ApplicationEvent;

/**����������Ϣ�¼�
 * 
	�̳�ApplicationEvent������������ڴ��ݷ��͹�������Ϣ������¼���Ҫһ��������������һ������������¼���
	���ǾͿ�����ͻ��˷�����Ϣ��
*/

public class ChatMessageEvent extends ApplicationEvent {
	
	private static final long serialVersionUID = 1L;

	public ChatMessageEvent(Object source) {
		super(source);		
	}

}

package com.fly.test.chat;

import org.springframework.context.ApplicationEvent;

/**发送聊天信息事件
 * 
	继承ApplicationEvent，构造参数用于传递发送过来的消息。这个事件需要一个监听器监听，一旦触发了这个事件，
	我们就可以向客户端发送消息。
*/

public class ChatMessageEvent extends ApplicationEvent {
	
	private static final long serialVersionUID = 1L;

	public ChatMessageEvent(Object source) {
		super(source);		
	}

}

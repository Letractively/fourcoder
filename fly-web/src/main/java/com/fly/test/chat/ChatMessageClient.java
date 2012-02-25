package com.fly.test.chat;

import java.util.Collection;
import java.util.Date;
import javax.servlet.ServletContext;
import org.directwebremoting.ScriptBuffer;
import org.directwebremoting.ScriptSession;
import org.directwebremoting.ServerContext;
import org.directwebremoting.ServerContextFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.web.context.ServletContextAware;


public class ChatMessageClient implements ApplicationListener, ServletContextAware {

	private ServletContext ctx;
		
	public void setServletContext(ServletContext ctx) {
		this.ctx = ctx;		
	}

	@SuppressWarnings("deprecation")
	public void onApplicationEvent(ApplicationEvent event) {
		//����¼�������ChatMessageEvent��ִ���������
        if (event instanceof ChatMessageEvent) {
            Message msg = (Message) event.getSource();
            ServerContext context = ServerContextFactory.get();
            //��ÿͻ�������chatҳ��script session������
 
            Collection<ScriptSession> sessions = context.getScriptSessionsByPage(((ServerContext) ctx).getContextPath() + "/chat.jsp");
            for (ScriptSession session : sessions) {
                ScriptBuffer sb = new ScriptBuffer();
                Date time = msg.getTime();
                @SuppressWarnings("deprecation")
				String s = time.getYear() + "-" + (time.getMonth() + 1) + "-" +  time.getDate() + " " 
                        +  time.getHours() + ":" + time.getMinutes() + ":" + time.getSeconds();
                //ִ��setMessage����
 
                sb.appendScript("showMessage({msg: '")
                .appendScript(msg.getMsg())
                .appendScript("', time: '")
                .appendScript(s)
                .appendScript("'})");
                System.out.println(sb.toString());
                //ִ�пͻ���script session�������൱�������ִ��JavaScript����
                  //����ͻ�ִ�пͻ���������е�showMessage���������Ҵ���һ�������ȥ
 
                session.addScript(sb);
            }
        }		
	}

}

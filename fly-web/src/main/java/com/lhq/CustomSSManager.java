package com.lhq;

import java.util.Collection;  

import javax.servlet.http.HttpSession;  
  
import org.directwebremoting.ScriptSession;  
import org.directwebremoting.WebContextFactory;  
import org.directwebremoting.event.ScriptSessionEvent;  
import org.directwebremoting.event.ScriptSessionListener;  
import org.directwebremoting.impl.DefaultScriptSession;  
import org.directwebremoting.impl.DefaultScriptSessionManager;  
  
import com.lhq.User; 


public class CustomSSManager extends DefaultScriptSessionManager{
	public static final String SESSION_USER = "23654895";
	 public static final String SS_ID = "DWR_ScriptSession_Id";  
     public CustomSSManager() {  
          addScriptSessionListener(new ScriptSessionListener(){  
             public void sessionCreated(ScriptSessionEvent event) {  
                     ScriptSession scriptSession = event.getSession(); // ��ȡ�´�����SS  
                     HttpSession httpSession  = WebContextFactory.get().getSession();// ��ȡ����SS���û���HttpSession  
                     User user = (User)httpSession.getAttribute(SESSION_USER);  
                     if(user ==null){  
                             scriptSession.invalidate();  
                             httpSession.invalidate();  
                             return;  
                     }  
                     String ssId = (String) httpSession.getAttribute(SS_ID);  
                     if (ssId != null) {  
                             DefaultScriptSession old=sessionMap.get(ssId);  
                            if(old!=null)CustomSSManager.this.invalidate(old);  
                     }  
                     httpSession.setAttribute(SS_ID, scriptSession.getId());  
                     scriptSession.setAttribute("userId", user.getId());//�˴���userId��scriptSession��  
             }  
             public void sessionDestroyed(ScriptSessionEvent event) {}  
          });  
        ReqReverseAjax.manager=this;//���Լ���¶ReverseAjaxҵ������  

     }  
     public Collection getAllScriptSessions(){  
             return sessionMap.values();  
     }  
}

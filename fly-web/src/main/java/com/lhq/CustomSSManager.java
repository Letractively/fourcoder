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
                     ScriptSession scriptSession = event.getSession(); // 获取新创建的SS  
                     HttpSession httpSession  = WebContextFactory.get().getSession();// 获取构造SS的用户的HttpSession  
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
                     scriptSession.setAttribute("userId", user.getId());//此处将userId和scriptSession绑定  
             }  
             public void sessionDestroyed(ScriptSessionEvent event) {}  
          });  
        ReqReverseAjax.manager=this;//将自己暴露ReverseAjax业务处理类  

     }  
     public Collection getAllScriptSessions(){  
             return sessionMap.values();  
     }  
}

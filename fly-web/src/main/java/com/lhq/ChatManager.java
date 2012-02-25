package com.lhq;

import org.directwebremoting.ScriptBuffer;
import org.directwebremoting.ScriptSession;
import org.directwebremoting.ServerContext;
import org.directwebremoting.ServerContextFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.web.context.ServletContextAware;
import java.util.ArrayList;  
import java.util.Collection;  
import java.util.HashSet;  
import java.util.List;  
  
import javax.servlet.ServletContext;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpSession;
  
import org.directwebremoting.ScriptSession;  
import org.directwebremoting.ServerContext;  
import org.directwebremoting.ServerContextFactory;  
import org.directwebremoting.WebContextFactory;  
import org.directwebremoting.proxy.dwr.Util;  

public class ChatManager {
	/** ���浱ǰ�����û��б� */  
    public static List<User> users = new ArrayList<User>();  
    public static List<String> ms = new ArrayList<String>();
    public static List<String> userIds = new ArrayList<String>();
  
    /** 
     * ���������û��б� 
     * @param username ����ӵ��б���û��� 
     * @param flag ������û����б�,����ֻ��õ�ǰ�б� 
     * @param request 
     * @return �û�userid 
     */  
    public String updateUsersList(String username, boolean flag, HttpServletRequest request) {  
        User user = null;  
        if (flag) {   
            // ����ȡ�Ự(HttpSession)��idΪ�û�id   
            user = new User(request.getSession().getId(), username);  
            //�����û����б�  
            users.add(user);    
            userIds.add(request.getSession().getId());
            //���û�id��ҳ��ű�session��  
            this.setScriptSessionFlag(user.getUserid());  
        }  
        //���DWR������  
        ServletContext sc = request.getSession().getServletContext();  
        ServerContext sctx = ServerContextFactory.get(sc);  
        //��õ�ǰ��� index.jsp ҳ������нű�session  
        //Collection sessions = sctx.getScriptSessionsByPage("/ind.jsp");  
        Collection sessions = sctx.getScriptSessionsByPage("/fly-web/ind.jsp");  
        Util util = new Util(sessions);  
        //������Щҳ���е�һЩԪ��  
        util.removeAllOptions("users");  
        util.addOptions("users", users, "username");  
        util.removeAllOptions("receiver");  
        util.addOptions("receiver", users,"userid","username"); 
        //������������¼       
        util.addOptions("ms", ms,"msid","hahah");
        
        if(!flag){  
            return null;  
        }  
        return user.getUserid();  
    }  
  
    /** 
     * ���û�id��ҳ��ű�session�� 
     * @param userid 
     */  
    public void setScriptSessionFlag(String userid) {  
        WebContextFactory.get().getScriptSession().setAttribute("userid", userid);  
    }  
  
    /** 
     * �����û�id���ָ���û���ҳ��ű�session 
     * @param userid 
     * @param request 
     * @return 
     */  
    @SuppressWarnings("unchecked")  
    public ScriptSession getScriptSession(String userid, HttpServletRequest request) {  
        ScriptSession scriptSessions = null;  
        Collection<ScriptSession> sessions = new HashSet<ScriptSession>();  
       // sessions.addAll(ServerContextFactory.get(request.getSession().getServletContext())  
         //       .getScriptSessionsByPage("/ind.jsp"));  
        sessions.addAll(ServerContextFactory.get(request.getSession().getServletContext())  
                .getScriptSessionsByPage("/fly-web/ind.jsp"));
        HttpSession httpS = WebContextFactory.get().getSession();
       // User user = (User)httpS.getAttribute(name);
        for (ScriptSession session : sessions) {  
            String xuserid = (String) session.getAttribute("userid");  
            if (xuserid != null && xuserid.equals(userid)) {  
                scriptSessions = session;  
            }   
        }  
        return scriptSessions;  
    }  
      
    /** 
     * ������Ϣ 
     * @param sender ������ 
     * @param receiverid ������id 
     * @param msg ��Ϣ���� 
     * @param request 
     */  
    public void send(String sender,String receiverid,String msg,HttpServletRequest request){  
        ScriptSession session = this.getScriptSession(receiverid, request);  
        //
        ScriptSession scriptSessions = null;  
        Collection<ScriptSession> sessions = new HashSet<ScriptSession>(); 
        sessions.addAll(ServerContextFactory.get(request.getSession().getServletContext())  
                .getScriptSessionsByPage("/fly-web/ind.jsp"));  
        for (ScriptSession session1 : sessions) {        	
            ScriptBuffer sb = new ScriptBuffer();
            sb.appendScript("showMessage({msg: '").appendScript(msg).appendScript("'})");
            System.out.println(sb.toString());
            
            session.addScript(sb);
        }  
        Util util = new Util(session);  
        util.setStyle("showMessage", "display", "");  
        util.setValue("sender", sender);  
        util.setValue("msg", msg);  
        util.setValue("test",msg);
    }  
}

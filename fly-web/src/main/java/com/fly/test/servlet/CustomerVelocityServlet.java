package com.fly.test.servlet;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.velocity.Template;
import org.apache.velocity.context.Context;
import org.apache.velocity.tools.view.servlet.VelocityViewServlet;


@SuppressWarnings("serial")
public class CustomerVelocityServlet extends VelocityViewServlet{

    
    //���÷�����ͼΪtext/html����Ϊgbk
    @Override
    protected void setContentType(HttpServletRequest request,
            HttpServletResponse response) {
        response.setContentType("text/html;charset=gbk");
    }
    
    //��������
    @Override
    protected Template handleRequest(HttpServletRequest request,
            HttpServletResponse response, Context ctx) throws Exception {
        ctx.put("username", "����");
        ctx.put("password", "123456789");
        ctx.put("age", "20");
        ctx.put("address", "��������"); 
        ctx.put("blog", "http://blogjava.net/sxyx2008");
        
        List<Long> list=new ArrayList<Long>();
        list.add(1L);
        list.add(3L);
        list.add(4L);
        list.add(5L);

        
        ctx.put("list", list);
        //���ø���ķ���getTemplate()
        return getTemplate("index.vm", "gbk");
    }
    
}

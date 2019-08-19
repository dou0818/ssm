package com.test;

import com.service.UsersService;
import com.service.UsersServiceImpl;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTag;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;
//自定义标签实现类
public class TagTest extends TagSupport {
    @Override
    public int doEndTag() throws JspException {
        WebApplicationContext wc = WebApplicationContextUtils.getRequiredWebApplicationContext(this.pageContext.getServletContext());//获取spring容器
        UsersService us = (UsersService) wc.getBean("usersServiceImpl");//从spring容器获取bean对象

        System.out.println("dotag");
        try {
            this.pageContext.getOut().println("<a href='d'>aAAabb</a>"+us.selectByPrimaryKey(1).getUsername());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.doEndTag();
    }
}

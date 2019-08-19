package com.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class User2Controller {


    @RequestMapping(value = "/n/login")
    public void a() {
        System.out.println("a");
    }

    @RequestMapping(value = "/n/login/login")
    public void login(String name,String pwd) {
        Subject sub = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(name, pwd);
        try {
            sub.login(token);//只有这里成功，表示authc过滤器才能通过(类似登陆成功)
            sub.getSession().setAttribute("sess","session搜索");
            System.out.println("登陆成功");
        } catch (Exception e) {
            System.out.println("登陆失败");
        }

    }

    @RequiresAuthentication
    @RequiresPermissions(value = {"user:update"})
    @RequestMapping(value = "/y/b")
    public void b() {
        System.out.println("abbbb");
    }

    @RequiresAuthentication
    @RequiresPermissions(value = {"user:update2"})
    @RequestMapping(value = "/y/p/c")
    public void c() {
        System.out.println("a");
    }

    @RequestMapping(value = "/d")
    public void d() {
        System.out.println("a");
    }

}

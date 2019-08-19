package com.controller;

import com.domain.Permis;
import com.domain.Users;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.UsersService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UsersController {

    @Resource(name = "usersServiceImpl")
    UsersService usersService;

    @RequestMapping("/login")
    public String login(Users users, HttpServletRequest request) {
        Subject sub = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(users.getUsername(), users.getUserpwd());
        try {
            sub.login(token);//只有这里成功，表示authc过滤器才能通过(类似登陆成功)
            return "redirect:/usersmenu";
        } catch (Exception e) {
            System.out.println("登陆失败");
            return "redirect:/index.jsp";
        }

    }

    /**
     * 登陆用户的后台主菜单
     *
     * @return
     */
    @RequiresAuthentication
    @RequestMapping("/usersmenu")
    public String usersMenu(HttpServletRequest request) {

        Users users = (Users) request.getSession().getAttribute("loginuser");
        List<Permis> permisList = usersService.selectPermisByUsersId2(users);
        List<Map<String ,Object>> listm=new ArrayList<>();
        for (Permis permis : permisList) {
            Map<String ,Object> m=new HashMap<>();
            m.put("id",permis.getId());
            m.put("pId",permis.getParent());
            m.put("name",permis.getPermistitle());
            m.put("url",permis.getHref());
            m.put("target","midframe");
            listm.add(m);
        }

       String s= new ObjectMapper().valueToTree(listm).toString();
        System.out.println(s);
        request.setAttribute("trees",s);
        return "usersmenu";
    }

    @RequiresPermissions("user:add")
    @RequestMapping("/testa")
    public String testa() {
        System.out.println("testa");
        return "redirect:index.jsp";
    }
}

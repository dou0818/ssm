package com.controller;

import com.domain.Role;
import com.domain.RolePermis;
import com.service.RolePermisService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class RolePermisController {

    @Resource(name = "rolePermisServiceImpl")
    RolePermisService rolePermisService;

    @RequiresAuthentication
    @RequestMapping(value = "uprope")
    public String uprope(int[] permisid, HttpServletRequest request){
        System.out.println(permisid.length);
        RolePermis rolePermis= (RolePermis) request.getSession().getAttribute("rolePermis");
        rolePermisService.deleteByroleid(rolePermis);
        List<RolePermis> rolePermisList=new ArrayList<>();
        for (int i : permisid) {
            RolePermis rope=new RolePermis();
            rope.setRoleid(rolePermis.getRoleid());
            rope.setPermisid(i);
            rolePermisList.add(rope);
        }
        rolePermisService.insertRolePermis(rolePermisList);
        //return "forward:rolemenu";
        return "redirect:selpermis?roleid="+rolePermis.getRoleid();
    }
}

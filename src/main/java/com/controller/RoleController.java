package com.controller;

import com.common.RestFulResponseBody;
import com.domain.Permis;
import com.domain.Role;
import com.service.RoleService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class RoleController {
    @Resource(name = "roleServiceImpl")
    RoleService roleService;


    /**
     * 查询所有的角色
     *
     * @return
     */
    @RequiresAuthentication
    @RequiresPermissions("select:role")
    @RequestMapping(value = "/selectallrole")
    public String selectAllRole(Model model) {
        List<Role> roleList = roleService.selectAllRole();
        model.addAttribute("roleList", roleList);
        return "allrole";
    }

    /**
     * 获取所有的权限
     *
     * @return
     */
    @ResponseBody
    @RequiresAuthentication
    @RequiresPermissions("select:role:permis")
    @RequestMapping(value = "/selectallpermisandbyroleidrermis")
    public RestFulResponseBody selectAllPermisAndByRoleidRermis(HttpServletRequest request) {
        //获取所有的权限
        List<Map> list = roleService.selectAllPermisAndByRoleidRermis();//查询所有的权限

        RestFulResponseBody rs = new RestFulResponseBody("查询成功", HttpStatus.OK, list);
        return rs;
    }

    /**
     * 获取角色id对应的权限
     *
     * @return
     */
    @ResponseBody
    @RequiresAuthentication
    @RequiresPermissions("select:role:permis:byrole")
    @RequestMapping(value = "/selectpermisbyroleidid")
    public RestFulResponseBody selectPermisByRoleidId(HttpServletRequest request, Role role) {
        //获取所有的权限
        List<Integer> permisList = roleService.selectPermisByRoleidId(role);
        RestFulResponseBody rs = new RestFulResponseBody("查询成功", HttpStatus.OK, permisList);
        return rs;
    }

    @ResponseBody
    @RequestMapping(value = "/restful", method = RequestMethod.GET)
    public RestFulResponseBody restfulTest(Role role) {
        role = roleService.selectByPrimaryKey(role.getId());
        RestFulResponseBody rs = new RestFulResponseBody("查询成功", HttpStatus.OK, role);
        return rs;
    }

    @ResponseBody
    @RequestMapping(value = "/restful", method = RequestMethod.POST)
    public RestFulResponseBody restfulTest2(Role role) {
        int r = roleService.insertSelective(role);
        RestFulResponseBody rs = new RestFulResponseBody("增加成功", HttpStatus.OK, role);
        return rs;
    }

    @ResponseBody
    @RequestMapping(value = "/restful", method = RequestMethod.DELETE)
    public RestFulResponseBody restfulTest3(Role role) {
        System.out.println(role.getId());
        int r = roleService.deleteByPrimaryKey(role.getId());
        RestFulResponseBody rs = new RestFulResponseBody("删除成功", HttpStatus.OK, r);
        return rs;
    }


}

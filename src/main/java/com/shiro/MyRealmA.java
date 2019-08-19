package com.shiro;

import com.domain.Users;
import com.service.UsersService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashSet;
import java.util.Set;

/**
 * 自定义shiro的realm
 */
public class MyRealmA extends AuthorizingRealm {

    @Resource(name = "usersServiceImpl")
    UsersService usersService;

    @Autowired
    HttpServletRequest request;

    /**
     * 验证角色及权限的时候执行
     *
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("进行角色权限验证...");
        Users users = (Users) request.getSession().getAttribute("loginuser");//获取当前登陆的用户对象

        String name = principals.getPrimaryPrincipal().toString();//获取用户名
        //根据用户名去获取拥有的角色及权限
        SimpleAuthorizationInfo sm = new SimpleAuthorizationInfo();

        //////根据当前登陆的用户获取用户的角色集合
        Set<String> rolesSet = usersService.selectRoleByUsersId(users);//获取登陆用户的角色集合
        sm.setRoles(rolesSet);//设置用户的角色
        // //根据当前登陆的用户获取用户的权限集合
        Set<String> permisSet = usersService.selectPermisByUsersId(users);
        sm.setStringPermissions(permisSet);//设置用户的权限

        return sm;
    }

    /**
     * 登陆验证用户名及密码
     *
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        // System.out.println("bb" + token.getPrincipal().toString() + "\t" + new String((char[]) token.getCredentials()));
        String name = token.getPrincipal().toString();//获取用户名
        String pwd = new String((char[]) token.getCredentials());//密码
        Users u = new Users();
        u.setUsername(name);
        u.setUserpwd(pwd);

        //调用service查询用户名密码是否存在
        u = usersService.selectOne(u);

        SimpleAuthenticationInfo sa = null;
        if (u != null) {//用户名密码存在，登陆成功
            sa = new SimpleAuthenticationInfo(name, pwd, "abcd");
            request.getSession().setAttribute("loginuser", u);
        }
        return sa;
    }
}

package com.controller;

import com.domain.Users;
import org.springframework.core.style.ToStringCreator;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class Test {
    @ResponseBody
    @RequestMapping("/a")
    public String a() {
        return "aa";
    }

    @RequestMapping("/aa/aa")
    public String aa() {
        return "redirect:/error1.jsp";
    }

    @ResponseBody
    @RequestMapping(value = "/b", method = RequestMethod.GET)
    public List<Object> b(Users users) {
        // ObjectMapper om = new ObjectMapper();//jackson对象转换类
        // String pageInfoString = om.writeValueAsString(pageInfo);//对象转json字符串
        List<Object> list = new ArrayList<>();
        list.add("你好");
        list.add("好的");
        list.add(users);
        return list;
    }

    @CrossOrigin(origins = "*")
    @ResponseBody
    @RequestMapping(value = "/bk", method = RequestMethod.DELETE)
    public MyResponseEntity bk(Users user) {
        List<Object> list = new ArrayList<>();
        list.add("你好aaa");
        list.add("restful API");
        list.add(user);
        // return new MyResponseEntity(HttpStatus.OK,"成功");
        return new MyResponseEntity(HttpStatus.OK,"成功",list,list);
    }

}

/**
 * 自定义返回json对象
 */
class MyResponseEntity {
    private List<Object> data = new ArrayList<>();
    private HttpStatus httpstatus;
    private String message;

    MyResponseEntity() {
    }

    public MyResponseEntity(HttpStatus httpstatus,String message,Object... obj) {
        this.httpstatus=httpstatus;
        this.message=message;
        for (Object o : obj) {
            data.add(o);
        }
    }

    public HttpStatus getHttpstatus() {
        return httpstatus;
    }

    public void setHttpstatus(HttpStatus httpstatus) {
        this.httpstatus = httpstatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }
}

package com.common;


import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/***
 * 全局异常处理类
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BindException.class)
    @ResponseBody
    public RestFulResponseBody BindExceptionHandler(HttpServletRequest request,
                                       final Exception e, HttpServletResponse response) {
        System.out.println("BindException错误");
        RestFulResponseBody rs=  new RestFulResponseBody("参数错误", HttpStatus.INTERNAL_SERVER_ERROR);
        return rs;
    }


    @ExceptionHandler(Exception.class)
    @ResponseBody
    public RestFulResponseBody ExceptionHandler(HttpServletRequest request,
                                   final Exception e, HttpServletResponse response) {
        System.out.println("Exception错误");
        RestFulResponseBody rs=  new RestFulResponseBody("其他错误", HttpStatus.INTERNAL_SERVER_ERROR);
        return rs;
    }
}

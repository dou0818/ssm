package com.stock.commons;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/***
 * 全局异常处理类
 */

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public MyResponseRestful BindExceptionHandler(HttpServletRequest request,
                                       final Exception e, HttpServletResponse response) {
        System.out.println("BindException错误");
        MyResponseRestful rs=  new MyResponseRestful("参数错误", HttpStatus.INTERNAL_SERVER_ERROR);
        return rs;
    }
}
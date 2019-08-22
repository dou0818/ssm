package com.stock.commons;

import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义restful
 */
public class MyResponseRestful {
    private List<Object> data = new ArrayList<>();
    private HttpStatus httpstatus;
    private String message;

    public MyResponseRestful(){

    }
    public MyResponseRestful(HttpStatus httpstatus, String message,Object ...obj) {
        this.httpstatus = httpstatus;
        this.message = message;
        for (Object o : obj) {
            data.add(o);
        }
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
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
}

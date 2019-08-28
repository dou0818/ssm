package com.stock.util;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;


public class GetDate {

    public static String getDate(){
        Date date=new Date();
        SimpleDateFormat sdate=new SimpleDateFormat("yyyy-MM-dd");
        return sdate.format(date);
    }

}

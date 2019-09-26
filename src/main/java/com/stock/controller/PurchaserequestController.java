package com.stock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PurchaserequestController {

    @RequestMapping(value = "purchasing")
    public void purchasing(int[] skuids,int[] purchas){

    }
}

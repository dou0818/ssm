package com.stock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedireController {
    @RequestMapping("/selsale")
    public String html() {
        return "selsale";
    }
}

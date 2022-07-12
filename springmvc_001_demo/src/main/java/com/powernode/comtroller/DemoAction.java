package com.powernode.comtroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DemoAction {
    @RequestMapping(value = "/demo",method = RequestMethod.GET)
    public String get(){
        System.out.println("这是get请求来的");
        return "main";
    }
    @RequestMapping(value = "/demo",method = RequestMethod.POST)
    public String post(){
        System.out.println("这是post请求来的");
        return "main";
    }
}

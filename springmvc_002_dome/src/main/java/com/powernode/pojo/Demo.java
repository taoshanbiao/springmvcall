package com.powernode.pojo;

import com.powernode.pojodemo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Demo {
    @RequestMapping("/one")
    public String one(String uname, int uage) {
        System.out.println("用户名是" + uname + "年龄是" + uage);
        return "main";
    }

    @RequestMapping("/two")
    public String two(Users users){
        System.out.println(users);
        return "main";
    }
    @RequestMapping("/three/{name}/{age1}")
    public String three(
            @PathVariable
            String name,
            @PathVariable("age1")
            int age){
        System.out.println("用户名是" + name + "年龄是" + age);
        return "main";
    }
    @RequestMapping("/four")
    public String four(
            @RequestParam("uname")
            String name,
            @RequestParam("uage")
            int age){
        System.out.println("用户名是" + name + "年龄是" + age);
        return "main";
    }
}

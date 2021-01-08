package com.mhr.admin.controller;

import com.mhr.basic.utils.BackUtil.ApiResult;
import com.mhr.basic.utils.BackUtil.ResultUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName LoginController
 * Description TODO
 * @Author MaHaiRui
 * @Date 2020-06-06-13:54
 * Version 1.0
 */
@Controller
public class LoginController {


    @GetMapping("/")
    public String hello(){
        System.out.println("Index");
        return  "index";
    }
    @RequestMapping("/error404")
    public String error(){
        System.out.println("404");
        return "404";
    }
    @RequestMapping("/login")
    public  String indexOne(){
        System.out.println("mhr_login");
        return "mhr/login";
    }

    @RequestMapping("/vue")
    @ResponseBody
    public ApiResult<String> vue (){
        System.out.println("vue");
        return ResultUtil.getOKResult("SUCCESS");
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test (){
        System.out.println("test");


        return "SUCCESS";
    }
}

package com.mhr.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName LoginController
 * Description TODO
 * @Author MaHaiRui
 * @Date 2020-06-06-15:17
 * Version 1.0
 */
@Controller
public class LoginController {

    @RequestMapping("/")
    @ResponseBody
    public String basics(){
        return  "Hello Word!!! --- WEB";
    }


}

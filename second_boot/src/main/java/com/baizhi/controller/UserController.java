package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by 杨宁
 * On 2019/2/19.
 * @RestController=@Controller+@ResponseBody
 */
//@RestController
@Controller
public class UserController {
    @RequestMapping("/add")
    public String add(){
        return "index";
    }

}

package cn.sm1234.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author http://www.sm1234.cn
 * @version 1.0
 * @description cn.sm1234.controller
 * @date 18/4/16
 */
@Controller
public class MainController {

    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping("403")
    public String forbidden(){
        return "403";
    }
    @RequestMapping("login")
    public String login(){
        return "login";
    }
}

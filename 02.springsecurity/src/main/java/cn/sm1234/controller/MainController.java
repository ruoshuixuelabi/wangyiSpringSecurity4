package cn.sm1234.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @author admin
 */
@Controller
public class MainController {
    /**
     * 登录页面
     */
    @RequestMapping("/userLogin")
    public String login(){
        return "login";
    }
    /**
     * 错误页面
     */
    @RequestMapping("/error")
    public String error(){
        return "error";
    }
    /**
     * 生成验证码
     */
    @RequestMapping("/imageCode")
    public String imageCode(){
        return "imageCode";
    }
}

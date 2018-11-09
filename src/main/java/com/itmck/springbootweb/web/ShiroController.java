package com.itmck.springbootweb.web;

import com.itmck.springbootweb.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by it_mck 2018/11/9 15:24
 *
 * @Description:
 * @Version: 1.0
 */
@Controller
@RequestMapping("shiro")
public class ShiroController {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    @ResponseBody
    public Map<String,Object> login(String username, String password){
        Map<String,Object> map = new HashMap<>();

        // 从SecurityUtils里边创建一个 subject
        Subject subject = SecurityUtils.getSubject();
        // 在认证提交前准备 token（令牌）
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        // 执行认证登陆
        subject.login(token);
        //根据权限，指定返回数据
        String role = userService.getRole(username);
        if ("user".equals(role)) {
            map.put("msg","欢迎登录");
        }
        if ("admin".equals(role)) {
            map.put("msg","欢迎来到管理员页面");
        }else{
            map.put("msg","权限错误");
        }
        return map;
    }


    /**
     * 注销
     * @return
     */
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public Map<String,Object> logout() {
        Map<String,Object> map = new HashMap<>();
        Subject subject = SecurityUtils.getSubject();
        //注销
        subject.logout();
        map.put("msg","成功注销！！");
        return map;
    }



}

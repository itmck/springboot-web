package com.itmck.springbootweb.web;

import com.itmck.springbootweb.pojo.User;
import com.itmck.springbootweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create by it_mck 2018/10/23 9:22
 *
 * @Description:
 * @Version: 1.0
 */
@Controller
@RequestMapping(value = "m")
public class ActionController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "get")
    @ResponseBody
    public Map<String,Object> getMsg(){

        Map<String,Object> map = new HashMap<>();

        List<User> list = userService.getAllUser();

        map.put("userList",list);
        return map;

    }
}

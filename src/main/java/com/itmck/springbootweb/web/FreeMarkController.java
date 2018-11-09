package com.itmck.springbootweb.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create by it_mck 2018/11/9 11:53
 *
 * @Description:
 * @Version: 1.0
 */
@Controller
@RequestMapping("/free")
public class FreeMarkController {


    @RequestMapping("/h")
    public String helloFreeMarker(Model model) {
        model.addAttribute("name","ITDragon博客");
        return "hello";
    }

}

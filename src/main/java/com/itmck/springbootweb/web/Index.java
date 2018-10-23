package com.itmck.springbootweb.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Create by it_mck 2018/10/23 13:29
 *
 * @Description:
 * @Version: 1.0
 */
@RestController
@RequestMapping("i")
public class Index {

    @RequestMapping("/view")
    public ModelAndView view2(){
        ModelAndView mv=new ModelAndView("login_max");
        return mv;
    }

}

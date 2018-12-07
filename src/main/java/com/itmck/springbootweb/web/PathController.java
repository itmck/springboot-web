package com.itmck.springbootweb.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create by it_mck 2018/11/13 16:19
 *
 * @Description: @PathVariable注解获取路径参数.
 *                  使用此注解可以写多级路径.
 * @Version: 1.0
 */
@Controller
@RequestMapping("system")
public class PathController {

    /**
     * 一级路径
     * @param param
     * @return
     */
    @RequestMapping("/{param}")
    public String basePage(@PathVariable("param") String param){

        return param;
    }

    /**
     * 二级路径
     * @param param
     * @param param2
     * @return
     */
    @RequestMapping("/p/{param}/{param2}")
    public String baseToPage(@PathVariable("param") String param,@PathVariable("param2") String param2){

        return param+"/"+param2;
    }

    /**
     * 三级路径
     * @param param
     * @param param2
     * @return
     */
    @RequestMapping("/p/{param}/{param2}/{param3}")
    public String baseToPages(@PathVariable("param") String param,@PathVariable("param2") String param2,@PathVariable("param2") String param3){

        return param+"/"+param2+"/"+param3;
    }
}

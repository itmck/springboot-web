package com.itmck.springbootweb.web;

import com.itmck.springbootweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("ss")
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * 跳转至登录页面
     * @return
     */
    @RequestMapping("system")
    public ModelAndView view2(){
        ModelAndView mv=new ModelAndView("login_max");
        return mv;
    }

    /**
     * 登录验证
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/login")
    public ModelAndView  login(String username,String password){
        ModelAndView mv=new ModelAndView();
        String  upwd = userService.getPassword(username);
        if(!password.equals(upwd)){
            mv.addObject("index");
            mv.setViewName("index");
        }else{
            mv.addObject("fail");
            mv.setViewName("fail");
        }
        return mv;
    }

    /**
     * 获取验证码步骤
     * @param phone
     * @return
     */
//    public Map<String,Object> getBinCode(String phone){
//        Map<String, Object> map = new HashMap<>();
//        if(userService.binCode(RedisKeyConst.APP_BINDINGCODE,phone)){
//            //1在redis中根据手机号设置一个时间
//            //2返回前台验证码发送成功或者失败
//            map.put("flg",true);
//        }
//        else{
//            map.put("flg",false);
//        }
//        return map;
//    }
//    public Map<String,Object> checkBinCode(String phone,String code){
//        Map<String, Object> map = new HashMap<>();
//        //1根据手机号和验证码去redis中查询是否能对比成功
//        //2成功.....
//        //失败...
//        return map;
//    }

}

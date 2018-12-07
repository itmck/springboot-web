//package com.itmck.springbootweb.config;
//
//import org.apache.shiro.authc.AccountException;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * Create by it_mck 2018/11/9 16:10
// *
// * @Description: 抓取shiro抛出的异常
// * @Version: 1.0
// */
//@RestControllerAdvice
//public class ExceptionController {
//
//    // 捕捉 CustomRealm 抛出的异常
//    @ExceptionHandler(AccountException.class)
//    public Map<String,Object> handleShiroException(Exception ex) {
//
//        Map<String,Object> map = new HashMap<>();
//        map.put("msg",ex.getMessage());
//        return map;
//    }
//}

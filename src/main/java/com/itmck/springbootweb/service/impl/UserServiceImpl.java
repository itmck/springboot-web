package com.itmck.springbootweb.service.impl;

import com.itmck.springbootweb.dao.UserDaoMapper;
import com.itmck.springbootweb.pojo.User;
import com.itmck.springbootweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by it_mck 2018/10/23 9:26
 *
 * @Description:
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDaoMapper userDaoMapper;
//    @Autowired
//    private RedisMapper redisMapper;


    @Override
    public List<User> getAllUser() {
        return userDaoMapper.getAll();
    }

    @Override
    public String getRole(String username) {
        return userDaoMapper.getRole(username);
    }

    @Override
    public String getPassword(String username) {
        return userDaoMapper.getPassword(username);
    }

//    @Override
//    public boolean binCode(String phone, String redisKey) {
//        //1生成随机字符串
//        String code= RandomSort.generateRandomNum(4);
//        //2将生成的随机字符串与对应手机号一起存入redis
//        redisMapper.set(redisKey+phone,code,300);//存入redis设置过期时间
//        //3使用第三方发送随机字符串到手机
//        //返回发送是否成功状态
//        return false;
//    }
}

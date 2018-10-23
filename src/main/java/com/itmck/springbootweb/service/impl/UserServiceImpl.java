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


    @Override
    public List<User> getAllUser() {
        return userDaoMapper.getAll();
    }
}

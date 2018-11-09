package com.itmck.springbootweb.service;

import com.itmck.springbootweb.pojo.User;

import java.util.List;

/**
 * Create by it_mck 2018/10/23 9:23
 *
 * @Description:
 * @Version: 1.0
 */
public interface UserService {
    List<User> getAllUser();

    String getRole(String username);

//    boolean binCode(String phone, String s);
}

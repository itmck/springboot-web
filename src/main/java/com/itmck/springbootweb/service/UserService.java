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
    /**
     * 获取所有的用户
     * @return
     */
    List<User> getAllUser();

    /**
     * 获取所有的角色
     * @param username
     * @return
     */
    String getRole(String username);

    /**
     * 根据用户名获取密码
     * @param username
     * @return
     */
    String getPassword(String username);

//    boolean binCode(String phone, String s);
}

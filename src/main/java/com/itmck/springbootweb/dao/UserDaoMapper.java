package com.itmck.springbootweb.dao;

import com.itmck.springbootweb.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Create by it_mck 2018/10/23 9:27
 *
 * @Description:
 * @Version: 1.0
 */
@Mapper
@Repository
public interface UserDaoMapper {

    //获取所有
    List<User> getAll();

    //根据用户名获取密码
    String getPassword(String username);

    //根据用户名获取角色
    String getRole(String username);
}

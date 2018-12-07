package com.itmck.springbootweb.dao;

import com.itmck.springbootweb.common.BaseMapper;
import com.itmck.springbootweb.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Create by it_mck 2018/10/23 9:27
 *
 * @Description:
 * @Version: 1.0
 */
@Mapper//配置mapper注解扫描
public interface UserDaoMapper extends BaseMapper<User,Integer> {

    //获取所有
    List<User> getAll();

    //根据用户名获取密码
    String getPassword(String username);

    //根据用户名获取角色
    String getRole(String username);
}

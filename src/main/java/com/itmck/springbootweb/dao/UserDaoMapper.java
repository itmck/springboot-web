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
    //@Select(value = "select * from user")
    List<User> getAll();
}

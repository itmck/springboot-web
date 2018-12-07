package com.itmck.springbootweb.common;

import java.io.Serializable;

/**
 * Create by it_mck 2018/12/5 13:44
 *
 * @Description: mapper基类.继承此方法后,增删改查的方法不用写.只需要写mapper.xml文件即可
 *
 * @Version: 1.0
 *
 * @param <E> 对应实体类 如 操作Student类 将E改成Student即可
 * @param <PK> 对应实体类主键
 */
public interface BaseMapper <E,PK extends Serializable> {
    /**
     *
     * 根据id获取对象
     * @param id 对象id
     * @return 返回的对象
     */
    E selectByPrimaryKey(PK id);

    /**
     * 根据id进行删除
     * @param id
     * @return
     */
    Integer deleteByPrimaryKey(PK id);

    /**
     * 保存对象所有信息
     * @param entity 要保存的对象实体
     * @return
     */
    Integer insert(E entity);

    /**
     * 只保存对象不为空的字段 (会对每个字段进行非空校验)
     * @param entity 要保存的实体类
     * @return
     */
    Integer insertBySelective(E entity);

    /**
     *
     * 更新对象属性根据主键更新
     * @param entity
     * @return
     */
    Integer updateByPrimaryKey(E entity);

    /**
     * 更新对象属性根据主键更新(会进行属性的非空判断)
     * @param entity
     * @return
     */
    Integer updateByPrimaryKeySelective(E entity);


}

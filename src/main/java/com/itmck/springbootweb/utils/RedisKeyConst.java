package com.itmck.springbootweb.utils;

/**
 * Create by it_mck 2018/11/2 11:29
 *
 * @Description:
 * @Version: 1.0
 */
public class RedisKeyConst {

    /**
     * APP绑定验证码key
     */
    public final static  String APP_BINDINGCODE="APP_BINDINGCODE:";
    /**
     * APP绑定验证码获取次数
     */
    public final static  String APP_BINDINGCODE_NUM="APP_BINDINGCODE_NUM:";
    /**
     * APP验证码绑定错误次数
     */
    public final static  String APP_BINDINGBYCODE_NUM="APP_BINDINGBYCODE_NUM:";

    /**
     * APP密码修改验证码key
     */
    public final static  String APP_UPDATEPHONE_CODE="APP_UPDATEPHONE_CODE:";
    /**
     * APP密码修改验证码获取次数
     */
    public final static  String APP_UPDATEPHONE_CODE_NUM="APP_UPDATEPHONE_CODE_NUM:";
    /**
     * APP密码修改验证码错误次数
     */
    public final static  String APP_UPDATEPHONE_NUM="APP_UPDATEPHONE_NUM:";
}

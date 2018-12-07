package com.itmck.springbootweb.pojo;

/**
 * Create by it_mck 2018/10/23 9:26
 *
 * @Description:
 * @Version: 1.0
 */
public class User {

    private int id;
    private String uname;
    private String upwd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }
}

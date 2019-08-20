package com.stock.domain;

import javax.persistence.*;

@Table(name = "`user`")
public class User {
    @Id
    @Column(name = "userid")
    @GeneratedValue(generator = "JDBC")
    private Integer userid;

    @Column(name = "username")
    private String username;

    @Column(name = "usersex")
    private String usersex;

    @Column(name = "userphoto")
    private String userphoto;

    @Column(name = "userhobby")
    private String userhobby;

    @Column(name = "useraddress")
    private String useraddress;

    /**
     * @return userid
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return usersex
     */
    public String getUsersex() {
        return usersex;
    }

    /**
     * @param usersex
     */
    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    /**
     * @return userphoto
     */
    public String getUserphoto() {
        return userphoto;
    }

    /**
     * @param userphoto
     */
    public void setUserphoto(String userphoto) {
        this.userphoto = userphoto;
    }

    /**
     * @return userhobby
     */
    public String getUserhobby() {
        return userhobby;
    }

    /**
     * @param userhobby
     */
    public void setUserhobby(String userhobby) {
        this.userhobby = userhobby;
    }

    /**
     * @return useraddress
     */
    public String getUseraddress() {
        return useraddress;
    }

    /**
     * @param useraddress
     */
    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }
}
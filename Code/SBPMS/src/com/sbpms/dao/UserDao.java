package com.sbpms.dao;

import com.sbpms.bean.User;

/**
 * Define the interface of User DAO
 * 
 * @author IanLi
 */
public interface UserDao {


    /**
     * Get the information of the user
     * 
     * @param user
     *            the user with information of name and password
     * @return the detail information of the user ligin
     */
    public User selectUser(User user);
}

package com.sbpms.service;

import com.sbpms.bean.User;

/**
 * Define the interface for the User DAO
 * 
 * @author IanLi
 */
public interface UserService {

    /**
     * Used to get message of who login
     * 
     * @param user
     *            the information of the name and password that who login
     * @return the detail information of user who login
     */
    public User login(User user);
}

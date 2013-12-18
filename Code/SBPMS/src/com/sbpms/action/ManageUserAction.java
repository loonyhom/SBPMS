package com.sbpms.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sbpms.bean.User;
import com.sbpms.service.UserService;

/**
 * This action is used to validate and deal with login processing
 * @author IanLi
 *
 */
@SuppressWarnings("serial")
public class ManageUserAction extends ActionSupport {

    private UserService service;
    private User user;

    public UserService getService() {

        return service;
    }

    public void setService(UserService service) {

        this.service = service;
    }

    public User getUser() {

        return user;
    }

    public void setUser(User user) {

        this.user = user;
    }

    /*
     * This method is used to the login JSP, include the operations of call
     * database and do validation.
     */
    public String login() throws Exception {
        switch (this.user.getRole()) {
        case 0:
            return SUCCESS;
        case 1:
            return SUCCESS;
        case 2:
            return SUCCESS;
        case 3:
            return SUCCESS;
        case 4:
            return SUCCESS;
        default:
            return INPUT;
        }

    }


    public void validateLogin() {
        
        this.clearActionErrors();

        if (null == this.user) {
            this.addActionError("User name must not be empty");
            return;
        }

        // Judge the the name input by whether it is empty.
        if (this.user.getName() == "" || null == this.user.getName()) {
            this.addActionError("User name must not be empty");
        } else {
             
            System.out.println(this.user.toString());
            
            // Judge the password input by whether it it empty.
            if (this.user.getPassword().isEmpty()
                    ||null == this.user.getPassword()) {
                this.addActionError("Password must not be empty");
            } else {

                // Judge the input name and password by whether they are accord
                // with the database.
                this.user = this.service.login(this.user);
                if (null == this.user) {
                    this.addActionError("User name or Password error");
                    this.user = null;
                } else {
                }
            }
        }

    }
}

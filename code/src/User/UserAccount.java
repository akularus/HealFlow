/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import Roles.Role;

/**
 *
 * @author renuka
 */
public class UserAccount{
    private String userAccountId;
    private String userName;
    private String password;
    private Role userRole;
    private String userExperience;
    private String userDesignation;
    private static int counter = 0;
    
    public UserAccount(String username, String password, Role role) {
        this.userAccountId = "user" + this.counter++;
        this.userName = username;
        this.password = password;
        this.userRole = role;
    }

   

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        UserAccount.counter = counter;
    }

    @Override
    public String toString() {
        return  getUserName();
    }

    /**
     * @return the userExperience
     */
    public String getUserExperience() {
        return userExperience;
    }

    /**
     * @param userExperience the userExperience to set
     */
    public void setUserExperience(String userExperience) {
        this.userExperience = userExperience;
    }

    /**
     * @return the userDesignation
     */
    public String getUserDesignation() {
        return userDesignation;
    }

    /**
     * @param userDesignation the userDesignation to set
     */
    public void setUserDesignation(String userDesignation) {
        this.userDesignation = userDesignation;
    }

    /**
     * @return the userRole
     */
    public Role getUserRole() {
        return userRole;
    }

    /**
     * @param userRole the userRole to set
     */
    public void setUserRole(Role userRole) {
        this.userRole = userRole;
    }

    /**
     * @return the userAccountId
     */
    public String getUserAccountId() {
        return userAccountId;
    }

    /**
     * @param userAccountId the userAccountId to set
     */
    public void setUserAccountId(String userAccountId) {
        this.userAccountId = userAccountId;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    
    
}

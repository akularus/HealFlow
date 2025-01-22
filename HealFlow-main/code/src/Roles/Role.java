/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Roles;


import ApplicationSystem.ApplicationSystem;
import User.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author renuka
 */
public abstract class Role {
    
    private static String[] roles = {"hospital system admin", "ambulance system admin", "pharmacy system admin", "diagnostic system admin" };
    
    public static String[] getAllRoles() {
        return roles;
    }
    
    public abstract JFrame workAreaCreation(ApplicationSystem applicationSystem, UserAccount useraccount);
}

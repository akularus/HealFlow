/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import Roles.Role;
import User.UserAccount;

/**
 *
 * @author srivarini
 */
public class Nurse extends UserAccount{
    private String nurseAccountId;
    
    private static int counter = 0;
    
    public Nurse(String username, String password, Role role) {
        super(username, password, role);
        this.nurseAccountId = "user" + this.counter++;
    }

    /**
     * @return the nurseAccountId
     */
    public String getNurseAccountId() {
        return nurseAccountId;
    }

    /**
     * @param nurseAccountId the nurseAccountId to set
     */
    public void setNurseAccountId(String nurseAccountId) {
        this.nurseAccountId = nurseAccountId;
    }

    /**
     * @return the counter
     */
    public static int getCounter() {
        return counter;
    }

    /**
     * @param aCounter the counter to set
     */
    public static void setCounter(int aCounter) {
        counter = aCounter;
    }

    
    
}

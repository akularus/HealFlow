/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ambulance;

import Roles.Role;
import User.UserAccount;

/**
 *
 * @author renuka
 */
public class POC extends UserAccount{
    private String account_Id;
    
    private static int counters = 0;
    
    public POC(String username, String password, Role role) {
        super(username,password,role);
        this.account_Id = "user" + this.counters++;
        
    }

    public String getAccountId() {
        return account_Id;
    }

    public void setAccountId(String accountId) {
        this.account_Id = accountId;
    }

    public static int getCounter() {
        return counters;
    }

    public static void setCounter(int counter) {
        POC.counters = counter;
    }

    
    
    
}

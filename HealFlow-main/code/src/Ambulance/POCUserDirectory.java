/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ambulance;

import Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author renuka
 */
public class POCUserDirectory {
    private ArrayList<POC> userAccountList;
    
    public POCUserDirectory() {
        this.userAccountList = new ArrayList<POC>();
    }

    public ArrayList<POC> getUseraccountlist() {
        return userAccountList;
    }

    public void setUseraccountlist(ArrayList<POC> useraccountlist) {
        this.userAccountList = useraccountlist;
    }
    
    public POC userAccountCreation(String name, String password, Role role) {
        POC user = new POC(name, password, role);
        this.userAccountList.add(user);
        return user;
    }
    
    public POC userAuthentication(String name, String password) {
        for(POC ua: this.userAccountList) {
            System.out.println(ua.getUserName());
            
            if(ua.getUserName().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkingUniqueUserName(String user_Name){
        for (POC user: this.userAccountList){
            if(user.getUserName().equals(user_Name)){
                return false;
            }
        }
        return true;
    }
}

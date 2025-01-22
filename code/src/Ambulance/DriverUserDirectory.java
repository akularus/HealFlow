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
public class DriverUserDirectory {
    private ArrayList<Driver> userAccountList;
    
    public DriverUserDirectory() {
        this.userAccountList = new ArrayList<Driver>();
    }

    public ArrayList<Driver> getUseraccountlist() {
        return userAccountList;
    }

    public void setUseraccountlist(ArrayList<Driver> useraccountlist) {
        this.userAccountList = useraccountlist;
    }
    
    public Driver userAccountCreation(String name, String password, Role role, double age, String experience) {
        Driver user = new Driver(name, password, role, age, experience);
        this.userAccountList.add(user);
        return user;
    }
    
    public Driver userAuthentication(String name, String password) {
        for(Driver ua: this.userAccountList) {
            System.out.println(ua.getUserName());
            
            if(ua.getUserName().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkingUniqueUserName(String userName){
        for (Driver user: this.userAccountList){
            if(user.getUserName().equals(userName)){
                return false;
            }
        }
        return true;
    }
    public Driver getDriverByUsername(String userName) {
        for (Driver driver : this.userAccountList) {
            if (driver.getUserName().equals(userName)) {
                return driver;
            }
        }
        return null;
    }
    
}

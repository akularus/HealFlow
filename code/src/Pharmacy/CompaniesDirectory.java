/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacy;

import Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author srivarini
 */
public class CompaniesDirectory {

    /**
     * @return the companyList
     */
    public ArrayList<Companies> getCompanyList() {
        return companyList;
    }

    /**
     * @param companyList the companyList to set
     */
    public void setCompanyList(ArrayList<Companies> companyList) {
        this.companyList = companyList;
    }
    private ArrayList<Companies> companyList;
    
    
    public CompaniesDirectory() {
        this.companyList = new ArrayList<Companies>();
    }

    
    
    public Companies userAccountCreation(String name, String password, Role role,String companyName) {
        Companies user = new Companies(name, password, role,companyName);
       
        this.getCompanyList().add(user);
        return user;
    }
    
    public Companies userAuthentication(String name, String password) {
        for(Companies ua: this.getCompanyList()) {
            System.out.println(ua.getUserName());
            
            if(ua.getUserName().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkingUniqueUserName(String userName){
        for (Companies user: this.getCompanyList()){
            if(user.getUserName().equals(userName)){
                return false;
            }
        }
        return true;
    }
}

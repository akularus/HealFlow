/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diagnostic;

import Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author renuka
 */
public class VendorsUserDirectory {
    private ArrayList<Vendors> vendorUserAccountList;
    
    public VendorsUserDirectory() {
        this.vendorUserAccountList = new ArrayList<Vendors>();
    }
    
    public Vendors createUserAccount(String name, String password, Role role, String companyname) {
        Vendors user = new Vendors(name, password, role);
        user.setVendorCompany(companyname);
        this.vendorUserAccountList.add(user);
        return user;
    }
    
    public Vendors authenticateUser(String name, String password) {
        for(Vendors ua: this.vendorUserAccountList) {
            System.out.println(ua.getUserName());
            
            if(ua.getUserName().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkUniqueUsername(String userName){
        for (Vendors user: this.vendorUserAccountList){
            if(user.getUserName().equals(userName)){
                return false;
            }
        }
        return true;
    }

    /**
     * @return the vendorUserAccountList
     */
    public ArrayList<Vendors> getVendorUserAccountList() {
        return vendorUserAccountList;
    }

    /**
     * @param vendorUserAccountList the vendorUserAccountList to set
     */
    public void setVendorUserAccountList(ArrayList<Vendors> vendorUserAccountList) {
        this.vendorUserAccountList = vendorUserAccountList;
    }
    
}

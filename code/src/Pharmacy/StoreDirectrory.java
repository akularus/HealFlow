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
public class StoreDirectrory {
    private ArrayList<Store> storeList;
    
    public StoreDirectrory() {
        this.storeList = new ArrayList<Store>();
    }

    
    public Store userAccountCreation(String name, String password, Role role,String storeName) {
        Store user = new Store(name, password, role,storeName);
       
        this.storeList.add(user);
        return user;
    }
    
    public Store userAuthentication(String name, String password) {
        for(Store ua: this.storeList) {
            System.out.println(ua.getUserName());
            
            if(ua.getUserName().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkingUniqueUserName(String userName){
        for (Store user: this.storeList){
            if(user.getUserName().equals(userName)){
                return false;
            }
        }
        return true;
    }

    /**
     * @return the storeList
     */
    public ArrayList<Store> getStoreList() {
        return storeList;
    }

    /**
     * @param storeList the storeList to set
     */
    public void setStoreList(ArrayList<Store> storeList) {
        this.storeList = storeList;
    }
    
}

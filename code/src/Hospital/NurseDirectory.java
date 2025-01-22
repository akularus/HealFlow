/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author srivarini
 */
public class NurseDirectory {
    private ArrayList<Nurse> nurseAccountList;
    
    public NurseDirectory() {
        this.nurseAccountList = new ArrayList<Nurse>();
    }
    public Nurse userAccountCreation(String name, String password, Role role) {
        Nurse user = new Nurse(name, password, role);
       
        this.getNurseAccountList().add(user);
        return user;
    }
    
    public Nurse userAuthentication(String name, String password) {
        for(Nurse ua: this.getNurseAccountList()) {
            System.out.println(ua.getUserName());
            
            if(ua.getUserName().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkingUniqueUserName(String userName){
        for (Nurse user: this.getNurseAccountList()){
            if(user.getUserName().equals(userName)){
                return false;
            }
        }
        return true;
    }

    /**
     * @return the nurseAccountList
     */
    public ArrayList<Nurse> getNurseAccountList() {
        return nurseAccountList;
    }

    /**
     * @param nurseAccountList the nurseAccountList to set
     */
    public void setNurseAccountList(ArrayList<Nurse> nurseAccountList) {
        this.nurseAccountList = nurseAccountList;
    }
    
}

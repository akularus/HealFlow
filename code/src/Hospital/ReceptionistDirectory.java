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
public class ReceptionistDirectory {
    private ArrayList<Receptionist> receptionistList;
    
    public ReceptionistDirectory() {
        this.receptionistList = new ArrayList<Receptionist>();
    }

   
    
    public Receptionist userAccountCreation(String name, String password, Role role) {
        Receptionist user = new Receptionist(name, password, role);
       
        this.receptionistList.add(user);
        return user;
    }
    
    public Receptionist userAuthentication(String name, String password) {
        for(Receptionist ua: this.receptionistList) {
            System.out.println(ua.getUserName());
            
            if(ua.getUserName().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkingUniqueUserName(String userName){
        for (Receptionist user: this.receptionistList){
            if(user.getUserName().equals(userName)){
                return false;
            }
        }
        return true;
    }

    /**
     * @return the receptionistList
     */
    public ArrayList<Receptionist> getReceptionistList() {
        return receptionistList;
    }

    /**
     * @param receptionistList the receptionistList to set
     */
    public void setReceptionistList(ArrayList<Receptionist> receptionistList) {
        this.receptionistList = receptionistList;
    }
    
}

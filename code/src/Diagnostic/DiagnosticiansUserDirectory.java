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
public class DiagnosticiansUserDirectory {
    private ArrayList<Diagnosticians> diagUserAccountList;
    
    public DiagnosticiansUserDirectory() {
        this.diagUserAccountList = new ArrayList<Diagnosticians>();
    }
    
    
    
    
    public Diagnosticians userAccountCreation(String name, String password, Role role) {
        Diagnosticians user = new Diagnosticians(name, password, role);
        this.getDiagUserAccountList().add(user);
        return user;
    }
    
    public Diagnosticians userAuthentication(String name, String password) {
        for(Diagnosticians ua: this.getDiagUserAccountList()) {
            System.out.println(ua.getUserName());
            
            if(ua.getUserName().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkingUniqueUserName(String userName){
        for (Diagnosticians user: this.diagUserAccountList){
            if(user.getUserName().equals(userName)){
                return false;
            }
        }
        return true;
    }

    /**
     * @return the diagUserAccountList
     */
    public ArrayList<Diagnosticians> getDiagUserAccountList() {
        return diagUserAccountList;
    }

    /**
     * @param diagUserAccountList the diagUserAccountList to set
     */
    public void setDiagUserAccountList(ArrayList<Diagnosticians> diagUserAccountList) {
        this.diagUserAccountList = diagUserAccountList;
    }
}

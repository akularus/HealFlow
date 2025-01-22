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
public class Receptionist extends UserAccount {

        private String receptionistId;
    
    private static int counter = 0;
    
    public Receptionist(String username, String password, Role role) {
        super(username, password, role);
        this.receptionistId = "user" + this.counter++;
    }

    
    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Receptionist.counter = counter;
    }
    
    /**
     * @return the receptionistId
     */
    public String getReceptionistId() {
        return receptionistId;
    }

    /**
     * @param receptionistId the receptionistId to set
     */
    public void setReceptionistId(String receptionistId) {
        this.receptionistId = receptionistId;
    }

    
}

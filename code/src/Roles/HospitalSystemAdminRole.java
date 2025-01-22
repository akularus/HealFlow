/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

import ApplicationSystem.ApplicationSystem;
import UI.AmbulanceSystemAdmin.AmbulanceSystemAdmin;
import UI.HospitalSystemAdmin.HospitalSystemAdmin;
import User.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author srivarini
 */
public class HospitalSystemAdminRole extends Role {
    
    @Override
    public JFrame workAreaCreation(ApplicationSystem applicationSystem, UserAccount useraccount) {
        System.out.println(applicationSystem);
        return new HospitalSystemAdmin(applicationSystem, useraccount);
    }
    
}

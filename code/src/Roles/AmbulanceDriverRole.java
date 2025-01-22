/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

import ApplicationSystem.ApplicationSystem;
import UI.AmbulanceDriver.AmbulanceDriver;
import User.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author renuka
 */
public class AmbulanceDriverRole extends Role {
    
    @Override
    public JFrame workAreaCreation(ApplicationSystem applicationSystem, UserAccount useraccount) {
        System.out.println(applicationSystem);
        return new AmbulanceDriver(applicationSystem, useraccount);
    }
}

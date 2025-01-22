/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diagnostic;

import Roles.Role;
import User.UserAccount;

/**
 *
 * @author renuka
 */
public class Vendors extends UserAccount {
    
    private String vendorAccountId;
    
    private static int counter = 0;
    private String vendorCompany;
    
    private int lends = 0;
    
    private MachineDirectory machineDirectory;

    public Vendors(String username, String password, Role role) {
        super(username, password, role);
        this.vendorAccountId = "user" + this.counter++;
        this.machineDirectory = new MachineDirectory();
        
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Vendors.counter = counter;
    }

    
    public MachineDirectory getMachineDirectory() {
        return machineDirectory;
    }

    public void setMachineDirectory(MachineDirectory machineDirectory) {
        this.machineDirectory = machineDirectory;
    }
       
    public void increaselends()
    {
        lends++;
    }

    /**
     * @return the vendorAccountId
     */
    public String getVendorAccountId() {
        return vendorAccountId;
    }

    /**
     * @param vendorAccountId the vendorAccountId to set
     */
    public void setVendorAccountId(String vendorAccountId) {
        this.vendorAccountId = vendorAccountId;
    }

    /**
     * @return the vendorCompany
     */
    public String getVendorCompany() {
        return vendorCompany;
    }

    /**
     * @param vendorCompany the vendorCompany to set
     */
    public void setVendorCompany(String vendorCompany) {
        this.vendorCompany = vendorCompany;
    }
    
    
    
}

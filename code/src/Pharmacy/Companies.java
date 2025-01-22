/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacy;

import Roles.Role;
import User.UserAccount;

/**
 *
 * @author srivarini
 */
public class Companies extends UserAccount{
        
    private String companyId;
    private String companyName;
    private static int counter = 0;
    private MedicineRequestDirectory medicineRequestRegistry;
    private MedicineDirectory medicineRegistry;
    
    public Companies(String username, String password, Role role,String companyName) {
        super(username, password, role);
        this.companyId = "user" + this.counter++;
        this.companyName=companyName;
        this.medicineRegistry = new MedicineDirectory();
        this.medicineRequestRegistry = new MedicineRequestDirectory();
    }

    

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Companies.counter = counter;
    }

    /**
     * @return the companyId
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * @param companyId the companyId to set
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /**
     * @return the medicineRequestRegistry
     */
    public MedicineRequestDirectory getMedicineRequestRegistry() {
        return medicineRequestRegistry;
    }

    /**
     * @param medicineRequestRegistry the medicineRequestRegistry to set
     */
    public void setMedicineRequestRegistry(MedicineRequestDirectory medicineRequestRegistry) {
        this.medicineRequestRegistry = medicineRequestRegistry;
    }

    /**
     * @return the medicineRegistry
     */
    public MedicineDirectory getMedicineRegistry() {
        return medicineRegistry;
    }

    /**
     * @param medicineRegistry the medicineRegistry to set
     */
    public void setMedicineRegistry(MedicineDirectory medicineRegistry) {
        this.medicineRegistry = medicineRegistry;
    }

    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    
    
}

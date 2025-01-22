/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacy;

import Patient.PharmacyRequestDirectory;
import Roles.Role;
import User.UserAccount;

/**
 *
 * @author srivarini
 */
public class Store extends UserAccount {
    
    private String storeId;
    private String storeName;
    private static int counter = 0;
    
    private MedicineRequestDirectory medicineRequestRegistry;
    private MedicineDirectory medicineRegistry;
    private PharmacyRequestDirectory pharmacyRequestRegistry;
    
    private int revenue = 0;
    
    public Store(String username, String password, Role role,String storeName) {
        super(username, password, role);
        this.medicineRequestRegistry = new MedicineRequestDirectory();
        this.storeId = "user" + this.counter++;
        this.storeName=storeName;
        this.medicineRegistry = new MedicineDirectory();
        this.pharmacyRequestRegistry = new PharmacyRequestDirectory();
    }

    

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Store.counter = counter;
    }


    
    public void upgradeMedicine(String medicineName, int quantity)
    {
        
        
        for(Medicine medicine:  getMedicineRegistry().getMedicineCatalog())
        {
            if(medicine.getName().equalsIgnoreCase(medicineName))
            {
                int updatedValue = medicine.getQuantity() + quantity;
                medicine.setQuantity(updatedValue);
                return;
            }
        }
        
        int number = getMedicineRegistry().getMedicineCatalog().size() + 1;
        getMedicineRegistry().createMedicine(number, medicineName, quantity);
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int sales) {
        this.revenue = sales;
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
     * @return the pharmacyRequestRegistry
     */
    public PharmacyRequestDirectory getPharmacyRequestRegistry() {
        return pharmacyRequestRegistry;
    }

    /**
     * @param pharmacyRequestRegistry the pharmacyRequestRegistry to set
     */
    public void setPharmacyRequestRegistry(PharmacyRequestDirectory pharmacyRequestRegistry) {
        this.pharmacyRequestRegistry = pharmacyRequestRegistry;
    }

    /**
     * @return the storeName
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * @param storeName the storeName to set
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    
    
    
}

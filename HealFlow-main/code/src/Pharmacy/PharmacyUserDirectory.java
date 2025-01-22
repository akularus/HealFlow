/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacy;

import Roles.Role;
import User.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author renuka
 */
public class PharmacyUserDirectory {
    private ArrayList<UserAccount> pharmacyUserList;
    private CompaniesDirectory companiesDirectoryList;
    private StoreDirectrory storeDirectoryList;
    private MedicineDirectory medicineDirectoryList;
    
    public PharmacyUserDirectory(){
        this.pharmacyUserList = new ArrayList<UserAccount>();
        this.companiesDirectoryList = new CompaniesDirectory();
        this.storeDirectoryList = new StoreDirectrory();
        this.medicineDirectoryList = new MedicineDirectory();
    }
 
    public UserAccount userAccountCreation(String name, String password, Role role) {
        UserAccount user = new UserAccount(name, password, role);
        this.getPharmacyUserList().add(user);
        return user;
    }
    
    public UserAccount userAuthentication(String name, String password) {
        for(UserAccount ua: this.getPharmacyUserList()) {
            System.out.println(ua.getUserName());
            
            if(ua.getUserName().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkingUniqueUsername(String userName){
        for (UserAccount user: this.getPharmacyUserList()){
            if(user.getUserName().equals(userName)){
                return false;
            }
        }
        return true;
    }

    /**
     * @return the pharmacyUserList
     */
    public ArrayList<UserAccount> getPharmacyUserList() {
        return pharmacyUserList;
    }

    /**
     * @param pharmacyUserList the pharmacyUserList to set
     */
    public void setPharmacyUserList(ArrayList<UserAccount> pharmacyUserList) {
        this.pharmacyUserList = pharmacyUserList;
    }

    /**
     * @return the companiesDirectoryList
     */
    public CompaniesDirectory getCompaniesDirectoryList() {
        return companiesDirectoryList;
    }

    /**
     * @param companiesDirectoryList the companiesDirectoryList to set
     */
    public void setCompaniesDirectoryList(CompaniesDirectory companiesDirectoryList) {
        this.companiesDirectoryList = companiesDirectoryList;
    }

    /**
     * @return the storeDirectoryList
     */
    public StoreDirectrory getStoreDirectoryList() {
        return storeDirectoryList;
    }

    /**
     * @param storeDirectoryList the storeDirectoryList to set
     */
    public void setStoreDirectoryList(StoreDirectrory storeDirectoryList) {
        this.storeDirectoryList = storeDirectoryList;
    }

    /**
     * @return the medicineDirectoryList
     */
    public MedicineDirectory getMedicineDirectoryList() {
        return medicineDirectoryList;
    }

    /**
     * @param medicineDirectoryList the medicineDirectoryList to set
     */
    public void setMedicineDirectoryList(MedicineDirectory medicineDirectoryList) {
        this.medicineDirectoryList = medicineDirectoryList;
    }
}

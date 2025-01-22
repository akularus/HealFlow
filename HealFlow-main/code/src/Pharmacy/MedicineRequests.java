/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacy;

/**
 *
 * @author srivarini
 */
public class MedicineRequests {
    Store store;
    Companies companies;
    int quantity;
    Medicine medicine;
    String status;
    
    public MedicineRequests(){
        
    }
    
    public MedicineRequests(Store store, Companies companies, Medicine medicine){
        this.store = store;
        this.companies = companies;
        this.medicine = medicine;
        this.status = "Requested";
  
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Companies getCompanies() {
        return companies;
    }

    public void setCompanies(Companies companies) {
        this.companies = companies;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}

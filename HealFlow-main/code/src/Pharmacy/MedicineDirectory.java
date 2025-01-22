/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacy;

import java.util.ArrayList;

/**
 *
 * @author srivarini
 */
public class MedicineDirectory {
    private ArrayList<Medicine> medicineCatalog;
    
    public MedicineDirectory(){
        this.medicineCatalog = new ArrayList<Medicine>();
    }

    
    
    public Medicine createMedicine(int number,String name, int quantity){
        Medicine medicine = new Medicine();
        
        medicine.setNumber(number);
        medicine.setName(name);
        medicine.setQuantity(quantity);
        
        this.getMedicineCatalog().add(medicine);
        
        return medicine;
        
    }
    
    public Boolean checkUniqueMedicineNumber(int num){
        for(Medicine vehicle: this.getMedicineCatalog()){
            if(vehicle.getNumber()==num){
                return false;
            }
        }return true;
    }
    
    public void deleteMedicine(Medicine medicine){
        this.getMedicineCatalog().remove(medicine);
    }
    
    public Medicine getMedicineById(int num){
        for(Medicine medicine: this.getMedicineCatalog()){
            if(medicine.getNumber()==num){
                return medicine;
            }
        }return null;
    }

    /**
     * @return the medicineCatalog
     */
    public ArrayList<Medicine> getMedicineCatalog() {
        return medicineCatalog;
    }

    /**
     * @param medicineCatalog the medicineCatalog to set
     */
    public void setMedicineCatalog(ArrayList<Medicine> medicineCatalog) {
        this.medicineCatalog = medicineCatalog;
    }
    
}

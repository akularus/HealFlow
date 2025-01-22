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
public class MedicineRequestDirectory {
    private ArrayList<MedicineRequests> medicineSupplyRegister;
    
    public MedicineRequestDirectory(){
        this.medicineSupplyRegister = new ArrayList<MedicineRequests>();
    }

    
    
    public MedicineRequests requestMedicine(Store store, Companies companies, Medicine medicine, int quantity){
        MedicineRequests requestMedicne = new MedicineRequests(store,companies,medicine);
        requestMedicne.setQuantity(quantity);
        this.getMedicineSupplyRegister().add(requestMedicne);
        return requestMedicne;
    } 

    /**
     * @return the medicineSupplyRegister
     */
    public ArrayList<MedicineRequests> getMedicineSupplyRegister() {
        return medicineSupplyRegister;
    }

    /**
     * @param medicineSupplyRegister the medicineSupplyRegister to set
     */
    public void setMedicineSupplyRegister(ArrayList<MedicineRequests> medicineSupplyRegister) {
        this.medicineSupplyRegister = medicineSupplyRegister;
    }
    
}

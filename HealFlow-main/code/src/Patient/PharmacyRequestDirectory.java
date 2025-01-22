/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import Hospital.Doctor;
import Pharmacy.Medicine;
import Pharmacy.Store;
import java.util.ArrayList;

/**
 *
 * @author renuka
 */
public class PharmacyRequestDirectory {
    private ArrayList<PharmacyRequest> pharmacyDetailList;
    
    public PharmacyRequestDirectory(){
        this.pharmacyDetailList = new ArrayList<PharmacyRequest>();
    }

    public PharmacyRequest requestpharmacy(Doctor doctor, Store store, Patient patient,Medicine medicine, int quantity){
      PharmacyRequest requestedPharmacy = new PharmacyRequest(doctor, store, patient, medicine, quantity);
      this.getPharmacyDetailList().add(requestedPharmacy);
      return requestedPharmacy;
    }

    /**
     * @return the pharmacyDetailList
     */
    public ArrayList<PharmacyRequest> getPharmacyDetailList() {
        return pharmacyDetailList;
    }

    /**
     * @param pharmacyDetailList the pharmacyDetailList to set
     */
    public void setPharmacyDetailList(ArrayList<PharmacyRequest> pharmacyDetailList) {
        this.pharmacyDetailList = pharmacyDetailList;
    }
}

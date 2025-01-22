/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import Hospital.Doctor;
import Pharmacy.Medicine;
import Pharmacy.Store;

/**
 *
 * @author renuka
 */
public class PharmacyRequest {
    
    private Doctor doctorDetailedInfo;
    private Store storeDetailInfo;
    private Patient patientDetailInfo;
    private int quantityNumber;
    private Medicine medicineDetailList;
    
    public PharmacyRequest(){
        
    }
    
    public PharmacyRequest(Doctor doctor, Store store, Patient patient, Medicine medicine, int quantity){
        this.doctorDetailedInfo = doctor;
        this.storeDetailInfo = store;
        this.patientDetailInfo = patient;
        this.medicineDetailList = medicine;
        this.quantityNumber = quantity;
        
    }

    /**
     * @return the doctorDetailedInfo
     */
    public Doctor getDoctorDetailedInfo() {
        return doctorDetailedInfo;
    }

    /**
     * @param doctorDetailedInfo the doctorDetailedInfo to set
     */
    public void setDoctorDetailedInfo(Doctor doctorDetailedInfo) {
        this.doctorDetailedInfo = doctorDetailedInfo;
    }

    /**
     * @return the storeDetailInfo
     */
    public Store getStoreDetailInfo() {
        return storeDetailInfo;
    }

    /**
     * @param storeDetailInfo the storeDetailInfo to set
     */
    public void setStoreDetailInfo(Store storeDetailInfo) {
        this.storeDetailInfo = storeDetailInfo;
    }

    /**
     * @return the patientDetailInfo
     */
    public Patient getPatientDetailInfo() {
        return patientDetailInfo;
    }

    /**
     * @param patientDetailInfo the patientDetailInfo to set
     */
    public void setPatientDetailInfo(Patient patientDetailInfo) {
        this.patientDetailInfo = patientDetailInfo;
    }

    /**
     * @return the quantityNumber
     */
    public int getQuantityNumber() {
        return quantityNumber;
    }

    /**
     * @param quantityNumber the quantityNumber to set
     */
    public void setQuantityNumber(int quantityNumber) {
        this.quantityNumber = quantityNumber;
    }

    /**
     * @return the medicineDetailList
     */
    public Medicine getMedicineDetailList() {
        return medicineDetailList;
    }

    /**
     * @param medicineDetailList the medicineDetailList to set
     */
    public void setMedicineDetailList(Medicine medicineDetailList) {
        this.medicineDetailList = medicineDetailList;
    }

   
    
}

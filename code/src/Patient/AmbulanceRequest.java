/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import Ambulance.AssignedVehicles;
import Hospital.Receptionist;



/**
 *
 * @author renuka
 */
public class AmbulanceRequest {
    private Receptionist receptionistDetails;
    private Patient patientDetails;
    private AssignedVehicles assignedVehiclesDetails;
    private String patientAddress;
    
    public AmbulanceRequest(){
        
    }
    
    public AmbulanceRequest(Receptionist receptionist, Patient patient, AssignedVehicles assignedVehicles){
        this.receptionistDetails = receptionist;
        this.patientDetails = patient;
        this.assignedVehiclesDetails = assignedVehicles;
    }

    /**
     * @return the receptionistDetails
     */
    public Receptionist getReceptionistDetails() {
        return receptionistDetails;
    }

    /**
     * @param receptionistDetails the receptionistDetails to set
     */
    public void setReceptionistDetails(Receptionist receptionistDetails) {
        this.receptionistDetails = receptionistDetails;
    }

    /**
     * @return the patientDetails
     */
    public Patient getPatientDetails() {
        return patientDetails;
    }

    /**
     * @param patientDetails the patientDetails to set
     */
    public void setPatientDetails(Patient patientDetails) {
        this.patientDetails = patientDetails;
    }

    /**
     * @return the assignedVehiclesDetails
     */
    public AssignedVehicles getAssignedVehiclesDetails() {
        return assignedVehiclesDetails;
    }

    /**
     * @param assignedVehiclesDetails the assignedVehiclesDetails to set
     */
    public void setAssignedVehiclesDetails(AssignedVehicles assignedVehiclesDetails) {
        this.assignedVehiclesDetails = assignedVehiclesDetails;
    }

    /**
     * @return the patientAddress
     */
    public String getPatientAddress() {
        return patientAddress;
    }

    /**
     * @param patientAddress the patientAddress to set
     */
    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    
    
    
}

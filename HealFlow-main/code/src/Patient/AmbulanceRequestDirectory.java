/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import Ambulance.AssignedVehicles;
import Ambulance.Driver;
import Ambulance.Vehicle;
import Hospital.Receptionist;
import java.util.ArrayList;

/**
 *
 * @author renuka
 */
public class AmbulanceRequestDirectory {
    
    private ArrayList<AmbulanceRequest> ambulanceRequestDetailsList;
    
    public AmbulanceRequestDirectory(){
        this.ambulanceRequestDetailsList = new ArrayList<AmbulanceRequest>();
    }

    public AmbulanceRequest requestAmbulance(Receptionist receptionist, Patient patient, AssignedVehicles assignedVehicles, String address){
      AmbulanceRequest requestedAmbulance = new AmbulanceRequest(receptionist,patient,assignedVehicles);
      requestedAmbulance.setPatientAddress(address);
      this.getAmbulanceRequestDetailsList().add(requestedAmbulance);
      return requestedAmbulance;
    }

    /**
     * @return the ambulanceRequestDetailsList
     */
    public ArrayList<AmbulanceRequest> getAmbulanceRequestDetailsList() {
        return ambulanceRequestDetailsList;
    }

    /**
     * @param ambulanceRequestDetailsList the ambulanceRequestDetailsList to set
     */
    public void setAmbulanceRequestDetailsList(ArrayList<AmbulanceRequest> ambulanceRequestDetailsList) {
        this.ambulanceRequestDetailsList = ambulanceRequestDetailsList;
    }
    
}

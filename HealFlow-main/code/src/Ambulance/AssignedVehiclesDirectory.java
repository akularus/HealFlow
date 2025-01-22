/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ambulance;

import java.util.ArrayList;

/**
 *
 * @author renuka
 */
public class AssignedVehiclesDirectory {
    ArrayList<AssignedVehicles> assignedVehicleList;
    
    
    public AssignedVehiclesDirectory(){
        this.assignedVehicleList = new ArrayList<AssignedVehicles>();
        
    }

    public ArrayList<AssignedVehicles> getAssignedVehicles() {
        return assignedVehicleList;
    }

    public void setAssignedVehicles(ArrayList<AssignedVehicles> assignedVehicles) {
        this.assignedVehicleList = assignedVehicles;
    }
    
    public AssignedVehicles assignedVehicleDetail(Vehicle vehicle, Driver driver){
      AssignedVehicles assignedVehicle = new AssignedVehicles(driver,vehicle);
      this.assignedVehicleList.add(assignedVehicle);
      return assignedVehicle;
    }
    
    public AssignedVehicles findAssignedVehicleByDriver(Driver driver) {
        for (AssignedVehicles assignedVehicle : this.assignedVehicleList) {
            if (assignedVehicle.getDriver().equals(driver)) {
                return assignedVehicle;
            }
        }
        return null;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ambulance;

/**
 *
 * @author renuka
 */
public class AssignedVehicles {
    Driver drivers;
    Vehicle vehicles;
    String StatusAvailability;
    
    public AssignedVehicles(){
        
    }
    
    public AssignedVehicles(Driver driver, Vehicle vehicle){
        this.drivers = driver;
        this.vehicles = vehicle;
        this.StatusAvailability = "Avaialable";
    }

    public Driver getDriver() {
        return drivers;
    }

    public void setDriver(Driver driver) {
        this.drivers = driver;
    }

    public Vehicle getVehicle() {
        return vehicles;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicles = vehicle;
    }

    public String getStatus() {
        return StatusAvailability;
    }

    public void setStatus(String Status) {
        this.StatusAvailability = Status;
    }

    
    
    
}

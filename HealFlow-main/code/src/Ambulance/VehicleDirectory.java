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
public class VehicleDirectory {
    
    ArrayList<Vehicle> vehicleDetails;
    
    public VehicleDirectory(){
        this.vehicleDetails =  new ArrayList <Vehicle>();
    }

    public ArrayList<Vehicle> getVehicle() {
        return vehicleDetails;
    }

    public void setVehicle(ArrayList<Vehicle> vehicle) {
        this.vehicleDetails = vehicle;
    }
    
    public Vehicle createVehicle(int number,String name){
        Vehicle vehicle = new Vehicle();
        
        vehicle.setNumber(number);
        vehicle.setName(name);
        
        this.vehicleDetails.add(vehicle);
        
        return vehicle;
        
    }
    
    public Boolean checkUniqueVehicleNumber(int num){
        for(Vehicle vehicle: this.vehicleDetails){
            if(vehicle.getNumber()==num){
                return false;
            }
        }return true;
    }
    
    public void deleteVehicle(Vehicle vehicle){
        this.vehicleDetails.remove(vehicle);
    }
    
    public Vehicle getVehicleByJobId(int num){
        for(Vehicle vehicle: this.getVehicle()){
            if(vehicle.getNumber()==num){
                return vehicle;
            }
        }return null;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ambulance;

import Patient.AmbulanceRequestDirectory;
import Roles.Role;

import User.UserAccount;

/**
 *
 * @author renuka
 */
public class Driver extends UserAccount{
    private String account_Id;
    private static int counters = 0;
    private int tripCount = 0;
    private AmbulanceRequestDirectory ambulanceRequestDirectoryList;
    double driverAge;
    String workExperience;
    
    
    public Driver(String username, String password, Role role, double age, String experience) {
        super(username,password,role);
        this.account_Id = "user" + this.counters++;
        this.ambulanceRequestDirectoryList = new AmbulanceRequestDirectory();
        this.driverAge = age;
        this.workExperience = experience;
        
        
    }

    public String getAccountId() {
        return account_Id;
    }

    public void setAccountId(String accountId) {
        this.account_Id = accountId;
    }

    public static int getCounter() {
        return counters;
    }

    public static void setCounter(int counter) {
        Driver.counters = counter;
    }

    public AmbulanceRequestDirectory getAmbulanceRequestDirectory() {
        return ambulanceRequestDirectoryList;
    }

    public void setAmbulanceRequestDirectory(AmbulanceRequestDirectory ambulanceRequestDirectory) {
        this.ambulanceRequestDirectoryList = ambulanceRequestDirectory;
    }

    public int getTrips() {
        return tripCount;
    }

    public void setTrips(int trips) {
        this.tripCount = trips;
    }

    public double getAge() {
        return driverAge;
    }

    public void setAge(double age) {
        this.driverAge = age;
    }

    public String getExperience() {
        return workExperience;
    }

    public void setExperience(String experience) {
        this.workExperience = experience;
    }
    
    public void increaseTrip()
    {
        tripCount++;
    }
    
    
}

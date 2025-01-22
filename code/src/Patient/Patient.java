/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import Roles.Role;
import User.UserAccount;

/**
 *
 * @author renuka
 */
public class Patient extends UserAccount{
    private String patientAccountId;
    private static int counter = 0;
    private String bloodPressue;
    private double patientAge;
    private double PatientWeight;

    public double getPatientWeight() {
        return PatientWeight;
    }

    public void setPatientWeight(double PatientWeight) {
        this.PatientWeight = PatientWeight;
    }
      
    
    public Patient(String username, String password, Role role, double age, double weight) {
        super(username, password, role);
        this.patientAge = age;
        this.PatientWeight = weight;
    }

    /**
     * @return the patientAccountId
     */
    public String getPatientAccountId() {
        return patientAccountId;
    }

    /**
     * @param patientAccountId the patientAccountId to set
     */
    public void setPatientAccountId(String patientAccountId) {
        this.patientAccountId = patientAccountId;
    }

    /**
     * @return the counter
     */
    public static int getCounter() {
        return counter;
    }

    /**
     * @param aCounter the counter to set
     */
    public static void setCounter(int aCounter) {
        counter = aCounter;
    }

    /**
     * @return the bloodPressue
     */
    public String getBloodPressue() {
        return bloodPressue;
    }

    /**
     * @param bloodPressue the bloodPressue to set
     */
    public void setBloodPressue(String bloodPressue) {
        this.bloodPressue = bloodPressue;
    }

    /**
     * @return the patientAge
     */
    public double getPatientAge() {
        return patientAge;
    }

    /**
     * @param patientAge the patientAge to set
     */
    public void setPatientAge(double patientAge) {
        this.patientAge = patientAge;
    }

    /**
     * @return the PatientWeight
     */
   

    /**
     * @param PatientWeight the PatientWeight to set
     */
    

    
}

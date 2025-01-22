/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author renuka
 */
public class PatientDirectory {
    private ArrayList<Patient> patientDetailList;
    
    public PatientDirectory(){
        this.patientDetailList = new ArrayList<Patient>();
    }

    
    public Patient userAccountCreation(String name, String password, Role role, String bp, double age, double weight) {
        Patient user = new Patient(name, password, role, age, weight);
        user.setBloodPressue(bp);
        this.getPatientDetailList().add(user);
        return user;
    }
    
    public Patient authenticateUser(String name, String password) {
        for(Patient ua: this.getPatientDetailList()) {
            System.out.println(ua.getUserName());
            
            if(ua.getUserName().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkUniqueUsername(String userName){
        for (Patient user: this.getPatientDetailList()){
            if(user.getUserName().equals(userName)){
                return false;
            }
        }
        return true;
    }

    /**
     * @return the patientDetailList
     */
    public ArrayList<Patient> getPatientDetailList() {
        return patientDetailList;
    }

    /**
     * @param patientDetailList the patientDetailList to set
     */
    public void setPatientDetailList(ArrayList<Patient> patientDetailList) {
        this.patientDetailList = patientDetailList;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;
import Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author srivarini
 */
public class DoctorUserDirectory {
    private ArrayList<Doctor> doctorUserAccountList;
    
    public DoctorUserDirectory() {
        this.doctorUserAccountList = new ArrayList<Doctor>();
    }
 
    public Doctor userAccountCreation(String name, String password, Role role) {
        Doctor user = new Doctor(name, password, role);
       
        this.getDoctorUserAccountList().add(user);
        return user;
    }
    
    public Doctor userAuthentication(String name, String password) {
        for(Doctor ua: this.getDoctorUserAccountList()) {
            System.out.println(ua.getUserName());
            
            if(ua.getUserName().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkingUniqueUserName(String userName){
        for (Doctor user: this.getDoctorUserAccountList()){
            if(user.getUserName().equals(userName)){
                return false;
            }
        }
        return true;
    }


    /**
     * @return the doctorUserAccountList
     */
    public ArrayList<Doctor> getDoctorUserAccountList() {
        return doctorUserAccountList;
    }
    /**
     * @param doctorUserAccountList the doctorUserAccountList to set
     */
    public void setDoctorUserAccountList(ArrayList<Doctor> doctorUserAccountList) {
        this.doctorUserAccountList = doctorUserAccountList;
    }
}

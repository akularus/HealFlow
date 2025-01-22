/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import Roles.HospitalSystemAdminRole;
import Roles.Role;
import User.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author srivarini
 */
public class HospitalUserDirectory {
    private ArrayList<UserAccount> healthCareRegistry;
    private DoctorUserDirectory doctorRegistry;
    private NurseDirectory nurseRegistry;
    private ReceptionistDirectory receptionistRegistry;

    public HospitalUserDirectory() {
        this.healthCareRegistry = new ArrayList<UserAccount>(); 
        
        this.doctorRegistry = new DoctorUserDirectory();
        this.nurseRegistry = new NurseDirectory();
        this.receptionistRegistry = new ReceptionistDirectory(); 
        this.userAccountCreation("admin","admin", new HospitalSystemAdminRole());
    }
    
    public UserAccount userAccountCreation(String name, String password, Role role) {
        UserAccount user = new UserAccount(name, password, role);
        this.getHealthCareRegistry().add(user);
        return user;
    }
    
    public UserAccount userAuthentication(String name, String password) {
        for(UserAccount ua: this.getHealthCareRegistry()) {
            System.out.println(ua.getUserName());
            
            if(ua.getUserName().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkingUniqueUserName(String userName){
        for (UserAccount user: this.getHealthCareRegistry()){
            if(user.getUserName().equals(userName)){
                return false;
            }
        }
        return true;
    }

    /**
     * @return the healthCareRegistry
     */
    public ArrayList<UserAccount> getHealthCareRegistry() {
        return healthCareRegistry;
    }

    /**
     * @param healthCareRegistry the healthCareRegistry to set
     */
    public void setHealthCareRegistry(ArrayList<UserAccount> healthCareRegistry) {
        this.healthCareRegistry = healthCareRegistry;
    }

    /**
     * @return the doctorRegistry
     */
    public DoctorUserDirectory getDoctorRegistry() {
        return doctorRegistry;
    }

    /**
     * @param doctorRegistry the doctorRegistry to set
     */
    public void setDoctorRegistry(DoctorUserDirectory doctorRegistry) {
        this.doctorRegistry = doctorRegistry;
    }

    /**
     * @return the nurseRegistry
     */
    public NurseDirectory getNurseRegistry() {
        return nurseRegistry;
    }

    /**
     * @param nurseRegistry the nurseRegistry to set
     */
    public void setNurseRegistry(NurseDirectory nurseRegistry) {
        this.nurseRegistry = nurseRegistry;
    }

    /**
     * @return the receptionistRegistry
     */
    public ReceptionistDirectory getReceptionistRegistry() {
        return receptionistRegistry;
    }

    /**
     * @param receptionistRegistry the receptionistRegistry to set
     */
    public void setReceptionistRegistry(ReceptionistDirectory receptionistRegistry) {
        this.receptionistRegistry = receptionistRegistry;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ApplicationSystem;

import Ambulance.AmbulanceUserDirectory;
import Diagnostic.DiagnosticUserDirectory;
import Hospital.HospitalUserDirectory;
import Patient.PatientUserDirectory;
import Pharmacy.PharmacyUserDirectory;
import Roles.AmbulanceSystemAdminRole;
import Roles.DiagnosticSystemAdminRole;
import Roles.PharmacySystemAdminRole;
import Roles.SystemAdminRole;
import User.UserAccount;
import User.UserAccountDirectory;

/**
 *
 * @author renuka
 */
public class ApplicationSystem {
    private UserAccountDirectory userDirectory;
    private AmbulanceUserDirectory ambulanceDirectory;
    private HospitalUserDirectory hospitalDirectory;
    private PharmacyUserDirectory pharmacyUsersDirectory;
    private DiagnosticUserDirectory diagnosticUsersDirectory;
    private PatientUserDirectory patientUserAccountDirectory;
    
    public ApplicationSystem(){
         this.userDirectory = new UserAccountDirectory();
         this.ambulanceDirectory = new AmbulanceUserDirectory();
         this.hospitalDirectory = new HospitalUserDirectory();
         this.pharmacyUsersDirectory = new PharmacyUserDirectory();
         this.diagnosticUsersDirectory = new DiagnosticUserDirectory();
         this.patientUserAccountDirectory = new PatientUserDirectory();
         
         
         this.userDirectory.userAccountCreation("admin", "admin", new SystemAdminRole());
         this.ambulanceDirectory.userAccountCreation("admin", "admin", new AmbulanceSystemAdminRole());
         
         this.pharmacyUsersDirectory.userAccountCreation("admin", "admin", new PharmacySystemAdminRole());
         this.diagnosticUsersDirectory.userAccountCreation("admin", "admin", new DiagnosticSystemAdminRole());

    }
    
    public boolean checkExistingCustomer(String name){
        for(UserAccount user: this.getUserDirectory().getUserAccountListDetail())
        {
            if(user.getUserName().equals(name)){
                System.out.println(user.getUserName());
                return false;
            }
        }
        return true;
    }
    
     public static ApplicationSystem getInstance() {
        return new ApplicationSystem();
    }

    /**
     * @return the userDirectory
     */
    public UserAccountDirectory getUserDirectory() {
        return userDirectory;
    }

    /**
     * @param userDirectory the userDirectory to set
     */
    public void setUserDirectory(UserAccountDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }

    /**
     * @return the ambulanceDirectory
     */
    public AmbulanceUserDirectory getAmbulanceDirectory() {
        return ambulanceDirectory;
    }

    /**
     * @param ambulanceDirectory the ambulanceDirectory to set
     */
    public void setAmbulanceDirectory(AmbulanceUserDirectory ambulanceDirectory) {
        this.ambulanceDirectory = ambulanceDirectory;
    }

    /**
     * @return the hospitalDirectory
     */
    public HospitalUserDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    /**
     * @param hospitalDirectory the hospitalDirectory to set
     */
    public void setHospitalDirectory(HospitalUserDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    /**
     * @return the pharmacyUsersDirectory
     */
    public PharmacyUserDirectory getPharmacyUsersDirectory() {
        return pharmacyUsersDirectory;
    }

    /**
     * @param pharmacyUsersDirectory the pharmacyUsersDirectory to set
     */
    public void setPharmacyUsersDirectory(PharmacyUserDirectory pharmacyUsersDirectory) {
        this.pharmacyUsersDirectory = pharmacyUsersDirectory;
    }

    /**
     * @return the diagnosticUsersDirectory
     */
    public DiagnosticUserDirectory getDiagnosticUsersDirectory() {
        return diagnosticUsersDirectory;
    }

    /**
     * @param diagnosticUsersDirectory the diagnosticUsersDirectory to set
     */
    public void setDiagnosticUsersDirectory(DiagnosticUserDirectory diagnosticUsersDirectory) {
        this.diagnosticUsersDirectory = diagnosticUsersDirectory;
    }

    /**
     * @return the patientUserAccountDirectory
     */
    public PatientUserDirectory getPatientUserAccountDirectory() {
        return patientUserAccountDirectory;
    }

    /**
     * @param patientUserAccountDirectory the patientUserAccountDirectory to set
     */
    public void setPatientUserAccountDirectory(PatientUserDirectory patientUserAccountDirectory) {
        this.patientUserAccountDirectory = patientUserAccountDirectory;
    }
    public UserAccount getUserAccountByUsername(String username) {
    for (UserAccount userAccount : this.userDirectory.getUserAccountListDetail()) {
        if (userAccount.getUserName().equals(username)) {
            return userAccount;
        }
    }
    // Optionally, handle other directories if there are multiple types of users

    return null; // return null if no matching user is found
}
}

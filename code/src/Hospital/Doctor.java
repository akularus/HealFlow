/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;
import Patient.DiagnosticRequestDirectory;
import Patient.PatientDirectory;
import Roles.Role;
import User.UserAccount;

/**
 *
 * @author srivarini
 */
public class Doctor extends UserAccount {
    
    private String doctorAccountId;
    
    private static int counter = 0;
    
    private PatientDirectory patientDirectoryDetail;
    private DiagnosticRequestDirectory diagnosticRequestDirectoryDetail;
    
    public Doctor(String username, String password, Role role) {
        super(username, password, role);
        this.doctorAccountId = "user" + this.counter++;
        this.patientDirectoryDetail = new PatientDirectory();
        this.diagnosticRequestDirectoryDetail = new DiagnosticRequestDirectory();
    }

    /**
     * @return the doctorAccountId
     */
    public String getDoctorAccountId() {
        return doctorAccountId;
    }

    /**
     * @param doctorAccountId the doctorAccountId to set
     */
    public void setDoctorAccountId(String doctorAccountId) {
        this.doctorAccountId = doctorAccountId;
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
     * @return the patientDirectoryDetail
     */
    public PatientDirectory getPatientDirectoryDetail() {
        return patientDirectoryDetail;
    }

    /**
     * @param patientDirectoryDetail the patientDirectoryDetail to set
     */
    public void setPatientDirectoryDetail(PatientDirectory patientDirectoryDetail) {
        this.patientDirectoryDetail = patientDirectoryDetail;
    }

    /**
     * @return the diagnosticRequestDirectoryDetail
     */
    public DiagnosticRequestDirectory getDiagnosticRequestDirectoryDetail() {
        return diagnosticRequestDirectoryDetail;
    }

    /**
     * @param diagnosticRequestDirectoryDetail the diagnosticRequestDirectoryDetail to set
     */
    public void setDiagnosticRequestDirectoryDetail(DiagnosticRequestDirectory diagnosticRequestDirectoryDetail) {
        this.diagnosticRequestDirectoryDetail = diagnosticRequestDirectoryDetail;
    }

    
    
    
    
}

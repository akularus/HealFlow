/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

/**
 *
 * @author renuka
 */
public class PatientUserDirectory {
    private PatientDirectory patientDetailDirectory;
    private AmbulanceRequestDirectory ambulanceRequestDetailDirectory;
    private DiagnosticRequestDirectory diagnosticRequestDirectory;
    private PharmacyRequestDirectory pharmacyRequestDirectory; 
    
    public PatientUserDirectory(){
        this.patientDetailDirectory = new PatientDirectory();
        this.ambulanceRequestDetailDirectory = new AmbulanceRequestDirectory();
        this.diagnosticRequestDirectory = new DiagnosticRequestDirectory();
        this.pharmacyRequestDirectory = new PharmacyRequestDirectory();
    }

    /**
     * @return the patientDetailDirectory
     */
    public PatientDirectory getPatientDetailDirectory() {
        return patientDetailDirectory;
    }

    /**
     * @param patientDetailDirectory the patientDetailDirectory to set
     */
    public void setPatientDetailDirectory(PatientDirectory patientDetailDirectory) {
        this.patientDetailDirectory = patientDetailDirectory;
    }

    /**
     * @return the ambulanceRequestDetailDirectory
     */
    public AmbulanceRequestDirectory getAmbulanceRequestDetailDirectory() {
        return ambulanceRequestDetailDirectory;
    }

    /**
     * @param ambulanceRequestDetailDirectory the ambulanceRequestDetailDirectory to set
     */
    public void setAmbulanceRequestDetailDirectory(AmbulanceRequestDirectory ambulanceRequestDetailDirectory) {
        this.ambulanceRequestDetailDirectory = ambulanceRequestDetailDirectory;
    }

    /**
     * @return the diagnosticRequestDirectory
     */
    public DiagnosticRequestDirectory getDiagnosticRequestDirectory() {
        return diagnosticRequestDirectory;
    }

    /**
     * @param diagnosticRequestDirectory the diagnosticRequestDirectory to set
     */
    public void setDiagnosticRequestDirectory(DiagnosticRequestDirectory diagnosticRequestDirectory) {
        this.diagnosticRequestDirectory = diagnosticRequestDirectory;
    }

    /**
     * @return the pharmacyRequestDirectory
     */
    public PharmacyRequestDirectory getPharmacyRequestDirectory() {
        return pharmacyRequestDirectory;
    }

    /**
     * @param pharmacyRequestDirectory the pharmacyRequestDirectory to set
     */
    public void setPharmacyRequestDirectory(PharmacyRequestDirectory pharmacyRequestDirectory) {
        this.pharmacyRequestDirectory = pharmacyRequestDirectory;
    }

    
}

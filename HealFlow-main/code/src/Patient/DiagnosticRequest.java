/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import Diagnostic.Diagnosticians;
import Hospital.Doctor;



/**
 *
 * @author renuka
 */
public class DiagnosticRequest {
    private Doctor doctorInfo;
    private Patient patientInfo;
    private Diagnosticians diagInfo;
    private String testNameDetail;
    private String resultInfo;
    
    public DiagnosticRequest(){
        
    }
    
    public DiagnosticRequest(Doctor doctor, Patient patient,  Diagnosticians diag, String testName){
        this.doctorInfo = doctor;
        this.patientInfo = patient;
        this.diagInfo = diag;
        this.resultInfo = "Under Process";
        this.testNameDetail = testName;
    }

    /**
     * @return the doctorInfo
     */
    public Doctor getDoctorInfo() {
        return doctorInfo;
    }

    /**
     * @param doctorInfo the doctorInfo to set
     */
    public void setDoctorInfo(Doctor doctorInfo) {
        this.doctorInfo = doctorInfo;
    }

    /**
     * @return the patientInfo
     */
    public Patient getPatientInfo() {
        return patientInfo;
    }

    /**
     * @param patientInfo the patientInfo to set
     */
    public void setPatientInfo(Patient patientInfo) {
        this.patientInfo = patientInfo;
    }

    /**
     * @return the diagInfo
     */
    public Diagnosticians getDiagInfo() {
        return diagInfo;
    }

    /**
     * @param diagInfo the diagInfo to set
     */
    public void setDiagInfo(Diagnosticians diagInfo) {
        this.diagInfo = diagInfo;
    }

    /**
     * @return the testNameDetail
     */
    public String getTestNameDetail() {
        return testNameDetail;
    }

    /**
     * @param testNameDetail the testNameDetail to set
     */
    public void setTestNameDetail(String testNameDetail) {
        this.testNameDetail = testNameDetail;
    }

    /**
     * @return the resultInfo
     */
    public String getResultInfo() {
        return resultInfo;
    }

    /**
     * @param resultInfo the resultInfo to set
     */
    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
    }    
}

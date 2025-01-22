/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import Diagnostic.Diagnosticians;
import Hospital.Doctor;
import java.util.ArrayList;

/**
 *
 * @author renuka
 */
public class DiagnosticRequestDirectory {
    private ArrayList<DiagnosticRequest> diagnosticDetailRequestList;
    
    public DiagnosticRequestDirectory(){
        this.diagnosticDetailRequestList = new ArrayList<DiagnosticRequest>();
    }

    public DiagnosticRequest requestDiagnostic(Doctor doctor, Patient patient, Diagnosticians diag, String testName){
        DiagnosticRequest dr = new DiagnosticRequest(doctor,patient,diag,testName);
        this.getDiagnosticDetailRequestList().add(dr);
        return dr;
                
    }

    /**
     * @return the diagnosticDetailRequestList
     */
    public ArrayList<DiagnosticRequest> getDiagnosticDetailRequestList() {
        return diagnosticDetailRequestList;
    }

    /**
     * @param diagnosticDetailRequestList the diagnosticDetailRequestList to set
     */
    public void setDiagnosticDetailRequestList(ArrayList<DiagnosticRequest> diagnosticDetailRequestList) {
        this.diagnosticDetailRequestList = diagnosticDetailRequestList;
    }
    
}

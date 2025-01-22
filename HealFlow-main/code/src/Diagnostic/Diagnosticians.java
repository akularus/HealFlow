/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diagnostic;

import Patient.DiagnosticRequestDirectory;
import Roles.Role;
import User.UserAccount;

/**
 *
 * @author renuka
 */
public class Diagnosticians extends UserAccount {
    
    private String diagAccountId;
    
    private static int counter = 0;
    
    private int diagtests = 0;
    
    private DiagnosticRequestDirectory diagnosticRequestDirectory;
    private AssignedMachineDirectory assgMachineDirectory;
    
    public Diagnosticians(String username, String password, Role role) {
        super(username, password, role);
        this.diagAccountId = "user" + this.counter++;
        this.diagnosticRequestDirectory = new DiagnosticRequestDirectory();
        this.assgMachineDirectory = new AssignedMachineDirectory();
    }
 
    public void increasetests()
    {
        setDiagtests(getDiagtests() + 1);
    }

    

    /**
     * @return the diagAccountId
     */
    public String getDiagAccountId() {
        return diagAccountId;
    }

    /**
     * @param diagAccountId the diagAccountId to set
     */
    public void setDiagAccountId(String diagAccountId) {
        this.diagAccountId = diagAccountId;
    }

    /**
     * @return the diagtests
     */
    public int getDiagtests() {
        return diagtests;
    }

    /**
     * @param diagtests the diagtests to set
     */
    public void setDiagtests(int diagtests) {
        this.diagtests = diagtests;
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
     * @return the assgMachineDirectory
     */
    public AssignedMachineDirectory getAssgMachineDirectory() {
        return assgMachineDirectory;
    }

    /**
     * @param assgMachineDirectory the assgMachineDirectory to set
     */
    public void setAssgMachineDirectory(AssignedMachineDirectory assgMachineDirectory) {
        this.assgMachineDirectory = assgMachineDirectory;
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
    
    
}

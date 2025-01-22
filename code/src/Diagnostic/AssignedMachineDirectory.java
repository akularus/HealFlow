/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diagnostic;

import java.util.ArrayList;

/**
 *
 * @author renuka
 */
public class AssignedMachineDirectory {
    private ArrayList<AssignedMachine> assignedMachineHospital;
    
    public AssignedMachineDirectory(){
        this.assignedMachineHospital = new  ArrayList<AssignedMachine>();
    }

   
    
    public AssignedMachine assignedMachine(Machine machine, Diagnosticians diag){
      AssignedMachine assignedMachine = new AssignedMachine(machine,diag);
      this.getAssignedMachineHospital().add(assignedMachine);
      return assignedMachine;
    }

    /**
     * @return the assignedMachineHospital
     */
    public ArrayList<AssignedMachine> getAssignedMachineHospital() {
        return assignedMachineHospital;
    }

    /**
     * @param assignedMachineHospital the assignedMachineHospital to set
     */
    public void setAssignedMachineHospital(ArrayList<AssignedMachine> assignedMachineHospital) {
        this.assignedMachineHospital = assignedMachineHospital;
    }
    
}

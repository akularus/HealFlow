/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diagnostic;

/**
 *
 * @author renuka
 */
public class AssignedMachine {
    private Machine machineDetail;
    private Diagnosticians diagnosticians;
    
    
    public AssignedMachine(){
        
    }
    
    public AssignedMachine(Machine machine, Diagnosticians diag){
        this.diagnosticians = diag;
        this.machineDetail = machine;
        
    }

    /**
     * @return the machineDetail
     */
    public Machine getMachineDetail() {
        return machineDetail;
    }

    /**
     * @param machineDetail the machineDetail to set
     */
    public void setMachineDetail(Machine machineDetail) {
        this.machineDetail = machineDetail;
    }

    /**
     * @return the diagnosticians
     */
    public Diagnosticians getDiagnosticians() {
        return diagnosticians;
    }

    /**
     * @param diagnosticians the diagnosticians to set
     */
    public void setDiagnosticians(Diagnosticians diagnosticians) {
        this.diagnosticians = diagnosticians;
    }

    
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diagnostic;

/**
 *
 * @author renuka
 */
public class Machine {
    private String machineName;
    private int machineId;
    private boolean availability;
    private Diagnosticians diagnosticians;
    
    public Machine(){
        this.availability = true;
    }

    /**
     * @return the machineName
     */
    public String getMachineName() {
        return machineName;
    }

    /**
     * @param machineName the machineName to set
     */
    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    /**
     * @return the machineId
     */
    public int getMachineId() {
        return machineId;
    }

    /**
     * @param machineId the machineId to set
     */
    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    /**
     * @return the availability
     */
    public boolean isAvailability() {
        return availability;
    }

    /**
     * @param availability the availability to set
     */
    public void setAvailability(boolean availability) {
        this.availability = availability;
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

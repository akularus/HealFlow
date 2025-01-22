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
public class MachineDirectory {
    
   private ArrayList<Machine> machinesList;
   
   public MachineDirectory(){
       this.machinesList = new ArrayList<Machine>();
   }

   
   
   public Machine createMachine(String name, int id) {
        Machine machine = new Machine();
        
        machine.setMachineId(id);
        machine.setMachineName(name);
        
        this.getMachinesList().add(machine);
        return machine;
    }
   
   public Boolean checkUniqueMachineNumber(int num){
        for(Machine machine: this.getMachinesList()){
            if(machine.getMachineId()==num){
                return false;
            }
        }return true;
    }
    
    public void deleteMachine(Machine machine){
        this.getMachinesList().remove(machine);
    }
    
    public Machine getMachineByJobId(int num){
        for(Machine machine: this.getMachinesList()){
            if(machine.getMachineId()==num){
                return machine;
            }
        }return null;
    }

    /**
     * @return the machinesList
     */
    public ArrayList<Machine> getMachinesList() {
        return machinesList;
    }

    /**
     * @param machinesList the machinesList to set
     */
    public void setMachinesList(ArrayList<Machine> machinesList) {
        this.machinesList = machinesList;
    }
    
}

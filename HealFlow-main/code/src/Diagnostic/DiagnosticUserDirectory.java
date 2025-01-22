/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diagnostic;

import Roles.Role;
import User.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author renuka
 */
public class DiagnosticUserDirectory {
    private ArrayList<UserAccount> diagnosticUserList;
    private DiagnosticiansUserDirectory  diagnosticiansUserAccountDirectory;
    private VendorsUserDirectory vendorsUserAccountDirectory;
    private MachineDirectory machineDetailDirectory;
    private AssignedMachineDirectory assignedMachineDirectory;
    
    
    public DiagnosticUserDirectory() {
        this.diagnosticUserList = new ArrayList<UserAccount>(); 
        this.diagnosticiansUserAccountDirectory= new DiagnosticiansUserDirectory();
        this.vendorsUserAccountDirectory = new VendorsUserDirectory();
        this.machineDetailDirectory = new MachineDirectory();
        this.assignedMachineDirectory = new AssignedMachineDirectory();
    }

    
    public UserAccount userAccountCreation(String name, String password, Role role) {
        UserAccount user = new UserAccount(name, password, role);
        this.diagnosticUserList.add(user);
        return user;
    }
    
    public UserAccount userAuthentication(String name, String password) {
        for(UserAccount ua: this.diagnosticUserList) {
            System.out.println(ua.getUserName());
            
            if(ua.getUserName().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkingUniqueUserName(String userName){
        for (UserAccount user: this.diagnosticUserList){
            if(user.getUserName().equals(userName)){
                return false;
            }
        }
        return true;
    }

    /**
     * @return the diagnosticUserList
     */
    public ArrayList<UserAccount> getDiagnosticUserList() {
        return diagnosticUserList;
    }

    /**
     * @param diagnosticUserList the diagnosticUserList to set
     */
    public void setDiagnosticUserList(ArrayList<UserAccount> diagnosticUserList) {
        this.diagnosticUserList = diagnosticUserList;
    }

    /**
     * @return the diagnosticiansUserAccountDirectory
     */
    public DiagnosticiansUserDirectory getDiagnosticiansUserAccountDirectory() {
        return diagnosticiansUserAccountDirectory;
    }

    /**
     * @param diagnosticiansUserAccountDirectory the diagnosticiansUserAccountDirectory to set
     */
    public void setDiagnosticiansUserAccountDirectory(DiagnosticiansUserDirectory diagnosticiansUserAccountDirectory) {
        this.diagnosticiansUserAccountDirectory = diagnosticiansUserAccountDirectory;
    }

    /**
     * @return the vendorsUserAccountDirectory
     */
    public VendorsUserDirectory getVendorsUserAccountDirectory() {
        return vendorsUserAccountDirectory;
    }

    /**
     * @param vendorsUserAccountDirectory the vendorsUserAccountDirectory to set
     */
    public void setVendorsUserAccountDirectory(VendorsUserDirectory vendorsUserAccountDirectory) {
        this.vendorsUserAccountDirectory = vendorsUserAccountDirectory;
    }

    /**
     * @return the machineDetailDirectory
     */
    public MachineDirectory getMachineDetailDirectory() {
        return machineDetailDirectory;
    }

    /**
     * @param machineDetailDirectory the machineDetailDirectory to set
     */
    public void setMachineDetailDirectory(MachineDirectory machineDetailDirectory) {
        this.machineDetailDirectory = machineDetailDirectory;
    }

    /**
     * @return the assignedMachineDirectory
     */
    public AssignedMachineDirectory getAssignedMachineDirectory() {
        return assignedMachineDirectory;
    }

    /**
     * @param assignedMachineDirectory the assignedMachineDirectory to set
     */
    public void setAssignedMachineDirectory(AssignedMachineDirectory assignedMachineDirectory) {
        this.assignedMachineDirectory = assignedMachineDirectory;
    }
}

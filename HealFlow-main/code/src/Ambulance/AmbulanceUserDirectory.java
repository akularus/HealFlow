/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ambulance;


import Roles.Role;
import User.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author renuka
 */
public class AmbulanceUserDirectory {
    private ArrayList<UserAccount> ambulanceUsersAccountList;
    private DriverUserDirectory driverUsersDirectory;
    private POCUserDirectory pocusersDirectoryList;
    private VehicleDirectory vehicledirectoryList;
    private AssignedVehiclesDirectory assignedVehicleDirectoryList;
    
    public AmbulanceUserDirectory(){
        this.ambulanceUsersAccountList = new ArrayList<UserAccount>();
        this.driverUsersDirectory = new DriverUserDirectory();
        this.pocusersDirectoryList = new POCUserDirectory();
        this.vehicledirectoryList = new VehicleDirectory();
        this.assignedVehicleDirectoryList = new AssignedVehiclesDirectory();      
    }

    public ArrayList<UserAccount> getAmbulanceuseraccountlist() {
        return ambulanceUsersAccountList;
    }

    public void setAmbulanceuseraccountlist(ArrayList<UserAccount> ambulanceuseraccountlist) {
        this.ambulanceUsersAccountList = ambulanceuseraccountlist;
    }

    public DriverUserDirectory getDriverUserDirectory() {
        return driverUsersDirectory;
    }

    public void setDriverUserDirectory(DriverUserDirectory driverUserDirectory) {
        this.driverUsersDirectory = driverUserDirectory;
    }

    public POCUserDirectory getPocUserDirectory() {
        return pocusersDirectoryList;
    }

    public void setPocUserDirectory(POCUserDirectory pocUserDirectory) {
        this.pocusersDirectoryList = pocUserDirectory;
    }

    public VehicleDirectory getVehicleDirectory() {
        return vehicledirectoryList;
    }

    public void setVehicleDirectory(VehicleDirectory vehicleDirectory) {
        this.vehicledirectoryList = vehicleDirectory;
    }

    public AssignedVehiclesDirectory getAssignedVehiclesDirectory() {
        return assignedVehicleDirectoryList;
    }

    public void setAssignedVehiclesDirectory(AssignedVehiclesDirectory assignedVehiclesDirectory) {
        this.assignedVehicleDirectoryList = assignedVehiclesDirectory;
    }
    
    public UserAccount userAccountCreation(String name, String password, Role role) {
        UserAccount user = new UserAccount(name, password, role);
        this.ambulanceUsersAccountList.add(user);
        return user;
    }
    
    public UserAccount userAuthentication(String name, String password) {
        for(UserAccount ua: this.ambulanceUsersAccountList) {
            System.out.println(ua.getUserName());
            
            if(ua.getUserName().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkingUniqueUserName(String userName){
        for (UserAccount user: this.ambulanceUsersAccountList){
            if(user.getUserName().equals(userName)){
                return false;
            }
        }
        return true;
    }
    
    public Vehicle getAssignedAmbulance(Driver driver){
        for(AssignedVehicles av: this.assignedVehicleDirectoryList.assignedVehicleList){
            if(av.getDriver().getUserName().equals(driver.getUserName())){
                return av.getVehicle();
            }
        }
        return null;
    
    }
    
}

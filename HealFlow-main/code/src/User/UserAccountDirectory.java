/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author renuka
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountListDetail;
    
    public UserAccountDirectory() {
        this.userAccountListDetail = new ArrayList<UserAccount>();
    }

    
    
    public UserAccount userAccountCreation(String name, String password, Role role) {
        UserAccount user = new UserAccount(name, password, role);
        this.getUserAccountListDetail().add(user);
        return user;
    }
    
    public UserAccount userAuthentication(String name, String password) {
        for(UserAccount ua: this.getUserAccountListDetail()) {
            System.out.println(ua.getUserName());
            
            if(ua.getUserName().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkingUniqueUserName(String userName){
        for (UserAccount user: this.getUserAccountListDetail()){
            if(user.getUserName().equals(userName)){
                return false;
            }
        }
        return true;
    }

    /**
     * @return the userAccountListDetail
     */
    public ArrayList<UserAccount> getUserAccountListDetail() {
        return userAccountListDetail;
    }

    /**
     * @param userAccountListDetail the userAccountListDetail to set
     */
    public void setUserAccountListDetail(ArrayList<UserAccount> userAccountListDetail) {
        this.userAccountListDetail = userAccountListDetail;
    }
}

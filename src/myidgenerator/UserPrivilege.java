/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myidgenerator;

/**
 *
 * @author Sandaka Geethaj
 */
public class UserPrivilege {

    String userType;

    public UserPrivilege(String userType) {
        this.userType = userType;
        switch(this.userType){
            case "Admin" :
                System.out.println("Admin userType");
                System.out.println("Admin userType");
                System.out.println("Admin userType");
                System.out.println("Admin userType");
                break;
            case "Normal User" :
                System.out.println("Normal user");
                System.out.println("Normal user");
                System.out.println("Normal user");
                System.out.println("Normal user");
                UserFrame.okButton.setEnabled(false);
        }
    }
}

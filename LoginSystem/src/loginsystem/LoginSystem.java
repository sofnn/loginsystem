/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginsystem;

/**
 *
 * @author sofiyanesterova
 */
public class LoginSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IDandPasswords idandPasswords = new IDandPasswords();
        
     
        
        LoginPage loginPage = new LoginPage (idandPasswords.getLoginInfo());
        
    }
    
}

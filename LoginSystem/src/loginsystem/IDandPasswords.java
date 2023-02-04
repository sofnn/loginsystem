package loginsystem;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sofiyanesterova
 */
public class IDandPasswords {
    
    
    HashMap<String,String> logininfo = new HashMap<String,String>();
    
    IDandPasswords(){
        
        logininfo.put("Bro","pizza");
        logininfo.put("Bro1","pizza1");
        logininfo.put("Bro2","pizza2");
    }
    
    protected HashMap getLoginInfo(){
        return logininfo;
    }
}

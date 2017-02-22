/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.models;

/**
 *
 * @author LSTI
 */
public class Authentication {
    
    public static boolean authenticate(String username, String password) {

        
        User user = new User();
        
        if(username.equals(user.getUsername()) && password.equals(user.getPassword())) {
            return true;
        }
        else {
            return false;
        }
    }
}

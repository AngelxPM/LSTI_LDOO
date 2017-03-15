/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio5.models;

/**
 *
 * @author Angel Adolfo Pacheco Mazuca 1656991
 */
public class Authetication {
        public static boolean authenticate(String username, String password) {
            User user = new User();   
      
        //username.equals(userDataBase) realiza una comparación entre las cadenas username y userDataBase
        //Si son iguales devuelve true. Si son diferentes devuelve false.
        if(username.equals(user.getUsername()) && password.equals(user.getPassword())) {
            return true;
        }
        else {
            return false;
        }  
    }
}

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
public class User {
    
    private String username;
    private String password;
    private String email;
    private String apellido;
    private String name;
    private String ocupacion;
    
    
    
    public User(){
        this.username = "Sofia_s";
        this.password = "12345";
        this.email = "sof.123@gmail.com";
        this.name = "Sofia";
        this.apellido = "Pecina";
        this.ocupacion = "Estudiante";
    }
    
    public void setUsername(String a) {
        this.username = a;
    }
    
    public void setEmail(String b) {
        this.email = b;
    }
    
    public void setName(String c) {
        this.name = c;
    }
    
    public void setApellido(String d) {
        this.apellido = d;
    }
    
    public void setOcupacion(String e) {
        this.ocupacion = e;
    }
    
    
    
    public String getUsername() {
        return this.username;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getApellido() {
        return this.apellido;
    }
    
    public String getOcupacion() {
        return this.ocupacion   ;
    }
    
}

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
public class User {
    
    private String username;
    private String password;
    private String email;
    private String nombre;
    private String apellido;
    private String ocupacion;
    
    public User() {
        this.username = "Angel";
        this.password = "1656991";
        this.email = "email.@gmail.com";
        this.nombre = "Angel ";
        this.apellido = "Pacheco";
        this.ocupacion = "Estudiante";
                
    }

    public String getUsername() {
        return this.username;  
    }
    
    public String getPassword(){
        return this.password;
    }

    public String getEmail(){
        return this.email;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public String getOcupacion(){
        return this.ocupacion;
    }
}

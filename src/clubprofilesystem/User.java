/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubprofilesystem;

/**
 *
 * @author Muhammad M Fadel
 */
public class User {
    private String firstName;
    private String lastName;
    private String Password;
    private String kindOfUser;
    
    public User(String firstName, String lastName, String Password, String kindOfUser){
        this.firstName = firstName;
        this.lastName = lastName;
        this.Password = Password;
        this.kindOfUser = kindOfUser;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getPassword(){
        return this.Password;
    }
    public String kindOfUser(){
        return this.kindOfUser;
    }
}

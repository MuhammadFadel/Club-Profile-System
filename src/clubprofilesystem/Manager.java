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
public class Manager extends Staff{
    User user;
    Staff staff;
    Player player;
    Coach coach;
    Team team;
    Sport sport;
    Activities activities;
    
    
    public Manager(String firstName, String lastName, String ID, 
            double Salary, String Adress, String SSN, String mobileNumber,
            String EMail, int Age, Date dateOfBirth, Date dateOfStartWork,
            String Position, String Department) {
        super(firstName, lastName, ID, Salary, Adress, SSN, mobileNumber,
                EMail, Age, dateOfBirth, dateOfStartWork, Position, Department);
    }
    
    public void addUser(){
        
    }
    public User getUser(){
        
    }
    public void editUser(){
        
    }
    public void removeUser(){
        
    }
    public void Logout(){
        
    }
    
}

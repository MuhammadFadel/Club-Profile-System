/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubprofilesystem;

import java.io.Serializable;

/**
 *
 * @author Muhammad M Fadel
 */
public class Staff extends Person implements Serializable{
    private Date dateOfStartWork; 
    private String Position;
    private String Department;

    public Staff(String firstName, String lastName, String ID, double Salary, String Adress, String SSN,
                String mobileNumber, String EMail, int Age, Date dateOfBirth,
                Date dateOfStartWork, String Position, String Department) {
        super(firstName, lastName, ID, Salary, Adress, SSN, mobileNumber, EMail, Age, dateOfBirth);      
        this.dateOfStartWork = dateOfStartWork;
        this.Position = Position;   
        this.Department = Department;
    }
        
    
     public Date getDataOfStartWork(){
        return this.dateOfStartWork;
    }
     public String getPosition(){
        return this.Position;
    }
    public String getDepartment(){
        return this.Department;
    }
}

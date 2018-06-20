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
public class Person implements Serializable{
    private String firstName;
    private String lastName;
    private String ID; 
    private double Salary;
    private String Adress;
    private String SSN;
    private String moblieNumber;
    private String EMail;
    private int Age;
    private Date dateOfBirth;
    
    // this the constractor we use it instead of setMethod to set the value 
   public Person(String firstName, String lastName, String ID, double Salary, String Adress,
                 String SSN, String mobileNumber, String EMail, int Age, Date dateOfBirth ){
     
       this.firstName=firstName;
       this.lastName = lastName;
       this.ID = ID;
       this.Salary = Salary;
       this.Adress = Adress;
       this.SSN = SSN;
       this.moblieNumber = mobileNumber;
       this.EMail = EMail;
       this.Age = Age;
       this.dateOfBirth = dateOfBirth;
    }
    
   public String getFirstName(){
       return this.firstName;
   }
   public String getLastName(){
       return this.lastName;
   }
   public String getID(){
       return this.ID;
   }
   public double getSalary(){
       return this.Salary;       
   }
   public String getAdress(){
       return this.Adress;
   }
   public String getSSN(){
       return this.SSN;
   }
   public String getMoblieNumber(){
       return this.moblieNumber;
   }
   public String getEMail(){
       return this.EMail;
   }
   public int getAge(){
       return this.Age;
   }
   public Date getDate(){
       return this.dateOfBirth;
   }
}

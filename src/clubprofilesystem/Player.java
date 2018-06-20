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
public class Player extends Staff implements Serializable{
    private String startContract;
    private String endContract;
    private String whichTeam;
 
     
    public Player(String firstName, String lastName, String ID, double Salary, String Adress,
            String SSN, String mobileNumber, String EMail, int Age,
            Date dateOfBirth, Date dateOfStartWork, String Position,
            String Department,String startContract, String endContract, String whichTeam) {
        super(firstName,lastName, ID, Salary, Adress, SSN, mobileNumber, EMail,
                Age, dateOfBirth, dateOfStartWork, Position, Department);
   
        this.startContract = startContract;
        this.endContract = endContract;
        this.whichTeam = whichTeam;

   
    }
  

   public String getStartContract(){
       return this.startContract;
   }
   public String getEndContract(){
       return this.endContract;
   }
   public String getWhichTeam(){
       return this.whichTeam;
   }
}

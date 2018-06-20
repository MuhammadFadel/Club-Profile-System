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
public class Coach extends Staff{
    private String positionOfGame;
    private String coachOfTeam;
    private static int numOfRop = 0;
        
    public Coach(String firstName, String lastName, String ID, double Salary, 
            String Adress, String SSN, String mobileNumber, 
            String EMail, int Age, Date dateOfBirth, Date dateOfStartWork, 
            String Position, String Department, String positionOfGame, String coachOfTeam) {
        super(firstName, lastName, ID, Salary, Adress, SSN, mobileNumber, 
                EMail, Age, dateOfBirth, dateOfStartWork, Position, Department);
        this.coachOfTeam = coachOfTeam;
        this.positionOfGame = positionOfGame;
    }
    
    public String getCoachOfTeam(){
        return this.coachOfTeam;
    }
    public String getPositionOfGame(){
        return this.positionOfGame;
    }
    public int getNumOfRop(){
        return numOfRop;
    }
    
}

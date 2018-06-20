/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubprofilesystem;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Muhammad M Fadel
 */
public class Team  {
    private Player player;
    private Coach coach;
    private Schedule schedule;
    private String teamName;
    private static int numOfPlayer=0;
    private static int numOfCoach=0;      
    
    public Team(String teamName){
        this.teamName = teamName;
    }
    public void setTeamName(String teamName){
        this.teamName = teamName;
    }
    public String getTeamName(){
        return this.teamName;
    }
    
    public void addPlayer(String firstName, String lastName, String ID, double Salary, String Adress,
            String SSN, String mobileNumber, String EMail, int Age,
            Date dateOfBirth, Date dateOfStartWork, String Position,
            String Department,String startContract, String endContract, String whichTeam)
            throws IOException, ClassNotFoundException{

        player = new Player(firstName,lastName,ID,Salary, Adress,SSN, mobileNumber,
                EMail,Age, dateOfBirth, dateOfStartWork,
                Position, Department, startContract, endContract, whichTeam);
        
        fileManager.Add(player, "Player.bin");
        
        numOfPlayer++;
    }

    public void editPlayer(String ID, Player NP){
      ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Player.bin");
      player= null;
        for(int i=0; i< list.size(); i++){
            player = (Player) list.get(i);
            if(player.getID().equals(ID)){
                list.remove(i);
            }            
        }
        list.add(NP);
        fileManager.Add(list, "Player.bin");
    }

    public Player getPlayer(String ID) throws IOException, ClassNotFoundException{
       ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Player.bin");
       player=null;
       for(int i=0; i<list.size(); i++){
           player = (Player) list.get(i);
           if(player.getID().equals(ID)) 
               return player;
       }
       return player;
       
    }

    public void removePlayer(String ID){
        ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Player.bin");
        player=null;
        for(int i=0; i< list.size(); i++){
            player = (Player) list.get(i);
            if(player.getID().equals(ID))
                list.remove(i);
            numOfPlayer--;
        }
        fileManager.Write(list, "Player.bin");
    }
    
    public void addCoach(String firstName, String lastName, String ID, double Salary, 
            String Adress, String SSN, String mobileNumber, 
            String EMail, int Age, Date dateOfBirth, Date dateOfStartWork, 
            String Position, String Department, String positionOfGame, String coachOfTeam) throws IOException{       
       
        coach = new Coach(firstName,lastName,ID,Salary, 
           Adress, SSN, mobileNumber, 
             EMail, Age,dateOfBirth,dateOfStartWork, 
            Position,  Department,  positionOfGame,  coachOfTeam);
        
         fileManager.Add(coach, "Coach.bin");        
        numOfCoach++;
    }
    
    public Coach getCoach(String ID) throws IOException, ClassNotFoundException{
         ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Coach.bin");
       coach=null;
       for(int i=0; i<list.size(); i++){
           coach = (Coach) list.get(i);
           if(coach.getID().equals(ID)) 
               return coach;
       }
       return coach;
    }
    
    public void editCoach(String ID, Coach NC){
        ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Coach.bin");
        coach=null;
        for(int i=0; i< list.size(); i++){
            coach = (Coach) list.get(i);
            if(coach.getID().equals(ID)){
                list.remove(i);
            }            
        }
        list.add(NC);
        fileManager.Add(list, "Coach.bin");
    }
   
    public void removeCoach(String ID){
        ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Coach.bin");
        coach=null;
        for(int i=0; i< list.size(); i++){
            coach = (Coach) list.get(i);
            if(coach.getID().equals(ID))
                list.remove(i);
            numOfCoach--;
        }
        fileManager.Write(list, "Coach.bin");
    }
       
    public void setSchedule(String teamName, String Day, Time time){
        schedule = new Schedule(teamName, Day, time);
    }
    
    public void addSchedule(String teamName, String Day, Time time) throws IOException{
        
         fileManager.Add(schedule, "Schedule.bin");
   
    }
    
    public void addSchedule(Schedule schedule) throws IOException{
        
         fileManager.Add(schedule, "Schedule.bin");
   
    }
    
    public Schedule getSchedule(String teamName) throws IOException, ClassNotFoundException{
        ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Schedule.bin");
       schedule=null;
       for(int i=0; i<list.size(); i++){
           schedule = (Schedule) list.get(i);
           if(schedule.getTeamName().equals(teamName)) 
               return schedule;
       }
       return schedule;
    }
    
    public void editSchedule(String teamName, Schedule NS){
        ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Schedule.bin");
        schedule=null;
        for(int i=0; i< list.size(); i++){
            schedule = (Schedule) list.get(i);
            if(schedule.getTeamName().equals(teamName)){
                list.remove(i);
            }            
        }
        list.add(NS);
        fileManager.Add(list, "Schedule.bin");
    }
    
    public void removeSchedule(String teamName){
        ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Schedule.bin");
        schedule=null;
        for(int i=0; i< list.size(); i++){
            schedule = (Schedule) list.get(i);
            if(schedule.getTeamName().equals(teamName))
                list.remove(i);
            
        }
        fileManager.Write(list, "Schedule.bin");
    }
    
    public Schedule getLocalSchedule(){
        return schedule;
    }
}
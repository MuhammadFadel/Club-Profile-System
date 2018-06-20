/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubprofilesystem;

import java.util.ArrayList;

/**
 *
 * @author Muhammad M Fadel
 */
public class Sport {
    private static int numOfTeams;
    private String whichSport;
    private String nameOfSport;
    private String rulesOfSport;
    private Team team;
    
    public Sport(String whichSport, String nameOfSport){
        this.nameOfSport = nameOfSport;
        this.whichSport = whichSport;
    }
    public int getNumOfTeams(){
        return numOfTeams;
    }
    public String getWhichSport(){
        return whichSport;
    }
    public String getNameOfSport(){
        return nameOfSport;
    }
    public void setRulesOfSport(String Rules){
        rulesOfSport = Rules;
    }
    public String getRulesOfSport(){
     return rulesOfSport;   
    }
    
    public void addTeam(String teamName){
        team = new Team(teamName);
        
        fileManager.Add(team, "Team.bin");
        numOfTeams++;
    }
    
    public Team getTeam(String teamName){
         ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Team.bin");
       team=null;
       for(int i=0; i<list.size(); i++){
           team = (Team) list.get(i);
           if(team.getTeamName().equals(teamName)) 
               return team;
       }
       return team;
    }
    
    public void editTeam(String teamName, Team NT){
        ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Team.bin");
        team=null;
        for(int i=0; i< list.size(); i++){
            team = (Team) list.get(i);
            if(team.getTeamName().equals(teamName)){
                list.remove(i);
            }            
        }
        list.add(NT);
        fileManager.Add(list, "Team.bin");
    }
    
    public void removeTeam(String teamName){
        ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Team.bin");
        team=null;
        for(int i=0; i< list.size(); i++){
            team = (Team) list.get(i);
            if(team.getTeamName().equals(teamName))
                list.remove(i);
            numOfTeams--;
        }
        fileManager.Write(list, "Team.bin");
    }
}

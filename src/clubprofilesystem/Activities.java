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
public class Activities {
    private static int numOfSports;
    private static int numOfIndevidual;
    private static int numOfGroup;
    private String nameOfActivities;
    private Sport sport;
    
    public int getNumOfSports(){
        return numOfSports;
    }
    public int getNumOfIndevidual(){
        return numOfIndevidual;
    }
    public int getNumOfGroup(){
        return numOfGroup;
    }    
    public void setNameOfActivities(String nameOfActivities){
        this.nameOfActivities = nameOfActivities;
    }
    public String getNameOfActivities(){
        return nameOfActivities;
    }
    
    public void addSport(String whichSport, String nameOfSport, String rulesOfSport){
        sport = new Sport(whichSport, nameOfSport);
        sport.setRulesOfSport(rulesOfSport);
        
        fileManager.Add(sport, "Sport.bin");
        numOfSports++;
        
        if(whichSport.equals("Group"))
            numOfGroup++;
        else
            numOfIndevidual++;
    }
    
    public void editSport(String sportName, Sport NS){
        ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Sport.bin");
        sport=null;
        for(int i=0; i< list.size(); i++){
            sport = (Sport) list.get(i);
            if(sport.getNameOfSport().equals(sportName)){
                list.remove(i);
            }            
        }
        list.add(NS);
        fileManager.Add(list, "Sport.bin");
    }
    
    public Sport getSport(String sportName){
         ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Sport.bin");
       sport=null;
       for(int i=0; i<list.size(); i++){
           sport = (Sport) list.get(i);
           if(sport.getNameOfSport().equals(sportName)) 
               return sport;
       }
       return sport;
    }
    
    public void removeSport(String sportName){
        ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Sport.bin");
        sport=null;
        for(int i=0; i< list.size(); i++){
            sport = (Sport) list.get(i);
            if(sport.getNameOfSport().equals(sportName))
                list.remove(i);
            numOfSports--;
            if(sport.getWhichSport().equals("Group"))
                numOfGroup--;
            else 
                numOfIndevidual--;
        }
        fileManager.Write(list, "Sport.bin");
    }
}

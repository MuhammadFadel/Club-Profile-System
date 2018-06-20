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
public class Schedule {
    private String teamName;
    private String Day;
    private Time time;
    
    public Schedule(String teamName, String Day, Time time){
        this.teamName = teamName;
        this.Day = checkDay(Day);
        this.time = time;
    }
    
    private String checkDay(String Day){
        String dayInLowerCase = Day.toLowerCase();
         boolean Case=false;
        if(dayInLowerCase!=null){
           
            switch(dayInLowerCase){
                case "saturday":
                    Case= true;
                    break;
                case "sunday":
                    Case= true;
                break;
                case "tuseday":
                    Case= true;
                break;
                case "wednesday":
                    Case= true;
                break;
                case "thursday":
                    Case= true;
                break;
                case "friday":
                    Case= true;
                break;
                    default:
                        Case= false;
                        break;
            }//end Switch
        }//end IF
        if(!Case){
            return null;
        }
        return  dayInLowerCase;
    }
    
    public String getTeamName(){
        return this.teamName;
    }
    public String Day(){
        return this.Day;
    }
    public Time getTime(){
        return this.time;
    }
    
}

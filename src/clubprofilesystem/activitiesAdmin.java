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
public class activitiesAdmin extends Staff{
    private int numOfReports;
    private int numOfActivities=0;
    private Activities activities;
    private Report report;

    public activitiesAdmin(String firstName, String lastName, String ID, double Salary,
            String Adress, String SSN, String mobileNumber, String EMail, int Age,
            Date dateOfBirth, Date dateOfStartWork, String Position, String Department) {
        super(firstName, lastName, ID, Salary, Adress, SSN, mobileNumber, EMail,
                Age, dateOfBirth, dateOfStartWork, Position, Department);
    }
    
    public int getNumOfReports(){
        return numOfReports;
    }
    
    public void addActivities(String nameOfActivities){
        activities = new Activities();
        activities.setNameOfActivities(nameOfActivities);
        
        fileManager.Add(activities, "activities.bin");
        numOfActivities++;
    }
    
    public Activities getActivities(String nameOfActivities){
        ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Activities.bin");
       activities=null;
       for(int i=0; i<list.size(); i++){
           activities = (Activities) list.get(i);
           if(activities.getNameOfActivities().equals(nameOfActivities)) 
               return activities;
       }
       return activities;
    }
   
    public void editActivities(String nameOfActivities, Activities NA){
        ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Activities.bin");
        activities=null;
        for(int i=0; i< list.size(); i++){
            activities = (Activities) list.get(i);
            if(activities.getNameOfActivities().equals(nameOfActivities)){
                list.remove(i);
            }            
        }
        list.add(NA);
        fileManager.Add(list, "Activities.bin");
    }
    
    public void removeActivities(String nameOfActivities){
        ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Activities.bin");
        activities=null;
        for(int i=0; i< list.size(); i++){
            activities = (Activities) list.get(i);
            if(activities.getNameOfActivities().equals(nameOfActivities))
                list.remove(i);
            numOfActivities--;
        }
        fileManager.Write(list, "Activities.bin");
    }
    
    public void addReportOfSport(String sportName, String Report){
        report = new Report(sportName);
        report.setReport(Report);
        
        fileManager.Add(report, "Report.bin");
        numOfReports++;
    }
    
    public Report getReport(String sportName){
        ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Report.bin");
       report=null;
       for(int i=0; i<list.size(); i++){
           report = (Report) list.get(i);
           if(report.getSportName().equals(sportName)) 
               return report;
       }
       return report;
    }
   
    public void editReport(String sportName, Report NR){
        ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Report.bin");
        report=null;
        for(int i=0; i< list.size(); i++){
            report = (Report) list.get(i);
            if(report.getSportName().equals(sportName)){
                list.remove(i);
            }            
        }
        list.add(NR);
        fileManager.Add(list, "Report.bin");
    }
   
    public void removeReport(String sportName){
        ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Report.bin");
        report=null;
        for(int i=0; i< list.size(); i++){
            report = (Report) list.get(i);
            if(report.getSportName().equals(sportName))
                list.remove(i);
            numOfReports--;
        }
        fileManager.Write(list, "Report.bin");
    }
}

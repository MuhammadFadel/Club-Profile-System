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
public class Report {
    private String sportName;
    private String Title;
    private String Report;    
    
    public Report(String sportName){
        this.sportName = sportName;
    }
    public String getSportName(){
        return sportName;
    }
    public void setReport(String Report){
        this.Report = Report;
    }
    public String getTitle(){
        return Title;
    }
    public String getReport(){
        return Report;
    }
    
}

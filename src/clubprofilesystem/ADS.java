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
public class ADS {
    private String Title;
    private String Content;
    private Date dueOfDate;
    
    public ADS(String Title, Date dueOfDate){
        this.Title=Title;
        this.dueOfDate = dueOfDate;
    }
    public String getTitle(){
        return this.Title;
    }
    public Date getDueOfDate(){
        return this.dueOfDate;
    }
    public void setContent(String Content){
        this.Content = Content;
    }
    public String getContent(){
        return this.Content;
    }
    
}

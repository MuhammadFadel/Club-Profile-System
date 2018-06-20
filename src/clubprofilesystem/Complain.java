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
public class Complain {
    
    private String From;
    private String Title;
    private String Complain;
    
    public Complain(String From, String Title){
        this.From = From;
        this.Title = Title;
    }
    
    public void setComplain(String Complain){
        this.Complain = Complain;
    }
    public String getComplain(){
        return Complain;
    }
    public String getFrom(){
        return From;
    }
    public String getTitle(){
        return Title;
    }
}

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
public class Require {
    
    private String requireFrom;
    private String requireAbout;
    
    public Require(String requireFrom){
        this.requireFrom = requireFrom;
    }
    
    
    public String getRequireFrom(){
        return requireFrom;
    }
    public void setRequireAbout(String requireAbout){
        this.requireAbout = requireAbout;
    }
    public String getRequireAbout(){
        return requireAbout;
    }
}

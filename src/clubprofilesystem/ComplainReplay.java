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
class ComplainReplay {
    private String From;
    private String Title;
    private String Replay;
    
    public ComplainReplay(String From, String Title, String Replay) {
        this.From = From;
        this.Title = Title;
        this.Replay = Replay;
    }
    
    public String getFrom(){
        return From;
    }
    public String getTitle(){
        return Title;
    }
    public String getReplay(){
        return Replay;
    }
}

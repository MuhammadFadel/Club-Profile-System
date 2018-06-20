/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubprofilesystem;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Muhammad M Fadel
 */
public class complainAdmin extends Staff {
    private Complain complain;
    private ComplainReplay complainReplay;
    
    public complainAdmin(String firstName, String lastName, String ID,
            double Salary, String Adress, String SSN, String mobileNumber,
            String EMail, int Age, Date dateOfBirth, Date dateOfStartWork,
            String Position, String Department) {
        super(firstName, lastName, ID, Salary, Adress, SSN, mobileNumber, EMail,
                Age, dateOfBirth, dateOfStartWork, Position, Department);        
    }
    
    public HashMap<String, Integer> showComplains(){
         ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Complain.bin");
         HashMap<String, Integer> keyList = new HashMap<>();
       complain=null;
       for(int i=0; i<list.size(); i++){
           complain = (Complain) list.get(i);
           keyList.put(complain.getFrom(), i);           
               return keyList;
       }
       return keyList;
    }
    
    public void setRepleyOfComplain(String From, String Title, String Replay){
        complainReplay = new ComplainReplay(From,Title, Replay);
        
        fileManager.Add(complainReplay, "ComplainReplay.bin");        
    }
    
    public ComplainReplay getRepleyOfComplain(String From){
         ArrayList<Object> list = (ArrayList<Object>) fileManager.read("ComplainReplay.bin");
       complainReplay=null;
       for(int i=0; i<list.size(); i++){
           complainReplay = (ComplainReplay) list.get(i);
           if(complainReplay.getFrom().equals(From)) 
               return complainReplay;
       }
       return complainReplay;
    }
    
    public void editRepleyOfComplain(String From, ComplainReplay NR){
        ArrayList<Object> list = (ArrayList<Object>) fileManager.read("ComplainReplay.bin");
        complainReplay=null;
        for(int i=0; i< list.size(); i++){
            complainReplay = (ComplainReplay) list.get(i);
            if(complainReplay.getFrom().equals(From)){
                list.remove(i);
            }            
        }
        list.add(NR);
        fileManager.Add(list, "ComplainReplay.bin");
    }
    
    public void removeRepleyOfComplain(String From){
        ArrayList<Object> list = (ArrayList<Object>) fileManager.read("ComplainReplay.bin");
        complainReplay=null;
        for(int i=0; i< list.size(); i++){
            complainReplay = (ComplainReplay) list.get(i);
            if(complainReplay.getTitle().equals(From))
                list.remove(i);            
        }
        fileManager.Write(list, "ComplainReplay.bin");
    }
    
    public void Logout(){
        
    }
    
}

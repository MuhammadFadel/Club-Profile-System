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
public class adsAdmin extends Staff {
    private ADS ads;
    private static int numOfAds;
    
    public adsAdmin(String firstName, String lastName, String ID, double Salary,
            String Adress, String SSN, String mobileNumber, String EMail, int Age,
            Date dateOfBirth, Date dateOfStartWork, String Position, String Department) {
        super(firstName, lastName, ID, Salary, Adress, SSN, mobileNumber, EMail, Age,
                dateOfBirth, dateOfStartWork, Position, Department);
    }
    
    public void addAds(String Title, Date dueOfDate, String Content){
        ads = new ADS(Title, dueOfDate);
        ads.setContent(Content);
        
        fileManager.Add(ads, "ADS.bin");
        numOfAds++;
    }
    public ADS getADS(String Title){
        ArrayList<Object> list = (ArrayList<Object>) fileManager.read("ADS.bin");
       ads=null;
       for(int i=0; i<list.size(); i++){
           ads = (ADS) list.get(i);
           if(ads.getTitle().equals(Title)) 
               return ads;
       }
       return ads;
    }
     public void editAds(String Title, ADS NA){
        ArrayList<Object> list = (ArrayList<Object>) fileManager.read("ADS.bin");
        ads=null;
        for(int i=0; i< list.size(); i++){
            ads = (ADS) list.get(i);
            if(ads.getTitle().equals(Title)){
                list.remove(i);
            }            
        }
        list.add(NA);
        fileManager.Add(list, "ADS.bin");
    }
    public void removeADS(String Title){
        ArrayList<Object> list = (ArrayList<Object>) fileManager.read("ADS.bin");
        ads=null;
        for(int i=0; i< list.size(); i++){
            ads = (ADS) list.get(i);
            if(ads.getTitle().equals(Title))
                list.remove(i);
            numOfAds--;
        }
        fileManager.Write(list, "ADS.bin");
    }
    
    public void Logout(){
        
    }
    
}

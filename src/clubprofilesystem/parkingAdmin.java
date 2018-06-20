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
public class parkingAdmin extends Staff {
    private Park park;
    private static int numOfPark;
    
    public parkingAdmin(String firstName, String lastName, String ID, 
            double Salary, String Adress, String SSN, String mobileNumber,
            String EMail, int Age, Date dateOfBirth, Date dateOfStartWork,
            String Position, String Department) {
        super(firstName, lastName, ID, Salary, Adress, SSN, mobileNumber,
                EMail, Age, dateOfBirth, dateOfStartWork, Position, Department);        
    }
    
    public void addCar(int gateNum, String carNum, String carModel){
        park = new Park(gateNum, carNum, carModel);     
        fileManager.Add(park, "Park.bin");
        numOfPark++;
    }
    
    public Park getCar(String carNum){
        ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Park.bin");
       park=null;
       for(int i=0; i<list.size(); i++){
           park = (Park) list.get(i);
           if(park.getCarNum().equals(carNum)) 
               return park;
       }
       return park;
    }
    
    public void editCar(String carNum, Park NP){
         ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Park.bin");
      park=null;
        for(int i=0; i< list.size(); i++){
            park = (Park) list.get(i);
            if(park.getCarNum().equals(carNum)){
                list.remove(i);
            }            
        }
        list.add(NP);
        fileManager.Add(list, "Park.bin");
    }
    
    public void removeCar(String carNum){
        ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Park.bin");
        park=null;
        for(int i=0; i< list.size(); i++){
            park = (Park) list.get(i);
            if(park.getCarNum().equals(carNum))
                list.remove(i);
            numOfPark--;
        }
        fileManager.Write(list, "Park.bin");
    }
    
    public int getNumOfParks(){
        return numOfPark;
    }
    
    public void Logout(){
        
    }
}

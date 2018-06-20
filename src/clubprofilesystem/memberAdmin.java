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
public class memberAdmin extends Staff {
    private Member member;
    
    public memberAdmin(String firstName, String lastName, String ID,
            double Salary, String Adress, String SSN, String mobileNumber,
            String EMail, int Age, Date dateOfBirth, Date dateOfStartWork,
            String Position, String Department) {
        super(firstName, lastName, ID, Salary, Adress, SSN, mobileNumber,
                EMail, Age, dateOfBirth, dateOfStartWork, Position, Department);
    }
    
    public void addMember(String firstName, String lastName, String ID, double Salary, String Adress,
                 String SSN, String mobileNumber, String EMail, int Age, Date dateOfBirth, 
                 Date startOfSubscribe, Date endOfSubscribe, boolean statusOfSubscribe){
        
        member = new Member (firstName, lastName, ID, Salary, Adress, SSN,
                        mobileNumber, EMail, Age, dateOfBirth, startOfSubscribe,endOfSubscribe, statusOfSubscribe);
         fileManager.Add(member, "Member.bin");
    
    }
    public Member getMember(String ID){
        ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Member.bin");
        member=null;
       for(int i=0; i<list.size(); i++){
           member = (Member) list.get(i);
           if(member.getID().equals(ID)) 
               return member;
       }
       return member;
       
    }
    public void removeMember(String ID){
         ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Member.bin");
        member=null;
        for(int i=0; i< list.size(); i++){
            member = (Member) list.get(i);
            if(member.getID().equals(ID))
                list.remove(i);
            
        }
        fileManager.Write(list, "Member.bin");
    }
    public void editMember(String ID, Member NM){
         ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Member.bin");
        member=null;
        for(int i=0; i< list.size(); i++){
            member = (Member) list.get(i);
            if(member.getID().equals(ID)){
                list.remove(i);
            }            
        }
        list.add(NM);
        fileManager.Add(list, "Member.bin");
    }    
    
    public void Logout(){
        
    }
}

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
public class financialAdmin extends Staff {
    private Payment payment;
    private Member member;
    
    
    public financialAdmin(String firstName, String lastName, String ID,
            double Salary, String Adress, String SSN, String mobileNumber,
            String EMail, int Age, Date dateOfBirth, Date dateOfStartWork,
            String Position, String Department) {
        super(firstName, lastName, ID, Salary, Adress, SSN, mobileNumber,
                EMail, Age, dateOfBirth, dateOfStartWork, Position, Department);
    }
    
    public void paymentByVisa(String memberName, Date dateOfPay, String methodOfPay, Double Price, String visaNum){
        payment = new Payment(memberName, dateOfPay, methodOfPay);
            payment.payByVisa(Price, visaNum);       
    }
    public void paymentByCash(String memberName, Date dateOfPay, String methodOfPay, Double Price){
        payment = new Payment(memberName, dateOfPay, methodOfPay);        
            payment.payByCash(Price);
            
            fileManager.Add(payment, "Payment.bin");            
    }
    public void changeStatus(String ID, boolean Status){
        ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Member.bin");
       member=null;
       for(int i=0; i<list.size(); i++){
           member = (Member) list.get(i);
           if(member.getID().equals(ID)) 
               list.remove(i);
              member.setStatusOfSubscribe(Status);
       }
       list.add((Object)member);
       fileManager.Write(list, "Member.bin");
       
    }
    public void Logout(){
        
    }
    
}

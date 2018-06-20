/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubprofilesystem;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Muhammad M Fadel
 */
public class Member extends Person implements Serializable{
    private Date startOfSubscribe;
    private Date endOfSubscribe;
    private boolean statusOfSubscribe;
    private Payment payment;
    private Require require;
    private Complain complain;
    private static int numOfComplains;
    private static int requireNum;
    private static int numOfPayByVisa;
    
    
    public Member(String firstName, String lastName, String ID, double Salary, String Adress,
                 String SSN, String mobileNumber, String EMail, int Age, Date dateOfBirth, 
                 Date startOfSubscribe, Date endOfSubscribe, boolean statusOfSubscribe){
        super(firstName,lastName, ID, Salary, Adress,SSN, mobileNumber, EMail, Age, dateOfBirth);
        
        this.startOfSubscribe = startOfSubscribe;
        this.endOfSubscribe = endOfSubscribe;
        this.statusOfSubscribe = statusOfSubscribe;
    }
    
    public Date getEndOfSubscribe(){
        return endOfSubscribe;
    }
    public Date getStartOfSubscribe(){
        return startOfSubscribe;
    }
    public boolean getStatusOfSubscribe(){
        return statusOfSubscribe;
    }
    
    public void addComplain(String From, String Title,String Complain){
        complain = new Complain(From, Title);
        complain.setComplain(Complain);
        
        fileManager.Add(complain, "Complain.bin");
        numOfComplains++;
    }
    
    public Complain getComplain(String From){
         ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Complain.bin");
       complain=null;
       for(int i=0; i<list.size(); i++){
           complain = (Complain) list.get(i);
           if(complain.getFrom().equals(From)) 
               return complain;
       }
       return complain;
    }
    
    public void editComplain(String From, Complain NC){
        ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Complain.bin");
      complain=null;
        for(int i=0; i< list.size(); i++){
            complain = (Complain) list.get(i);
            if(complain.getFrom().equals(From)){
                list.remove(i);
            }            
        }
        list.add(NC);
        fileManager.Add(list, "Complain.bin");
    }
    
    public void removeComplain(String From){
        ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Complain.bin");
        complain=null;
        for(int i=0; i< list.size(); i++){
            complain = (Complain) list.get(i);
            if(complain.getFrom().equals(From))
                list.remove(i);
            numOfComplains--;
        }
        fileManager.Write(list, "Complain.bin");
    }
    
    public void addRequireSubscribe(String From, String requireAbout){
        require = new Require(From);
        require.setRequireAbout(requireAbout);
        
        fileManager.Add(require, "Require.bin");
        requireNum++;
    }
    
    public Require getRequireSubScribe(String From){
       ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Require.bin");
       require=null;
       for(int i=0; i<list.size(); i++){
           require = (Require) list.get(i);
           if(require.getRequireFrom().equals(From)) 
               return require;
       }
       return require;
    }
    
    public void editRequireSubscribe(String From, Require NR){
      ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Require.bin");
      require=null;
        for(int i=0; i< list.size(); i++){
            require = (Require) list.get(i);
            if(require.getRequireFrom().equals(From)){
                list.remove(i);
            }            
        }
        list.add(NR);
        fileManager.Add(list, "Require.bin");
    }
    
    public void removeRequireSubscribe(String From){
        ArrayList<Object> list = (ArrayList<Object>) fileManager.read("Require.bin");
        require=null;
        for(int i=0; i< list.size(); i++){
            require = (Require) list.get(i);
            if(require.getRequireFrom().equals(From))
                list.remove(i);
            requireNum--;
        }
        fileManager.Write(list, "Require.bin");
    }
    
    public void Payment(String memberName, Date dateOfPay, String methodOfPay, double Price, String visaNum){
        payment = new Payment( memberName, dateOfPay, methodOfPay);
        payment.payByVisa(Price, visaNum);
        fileManager.Add(payment, "Payment.bin");
        numOfPayByVisa++;
    }
    
    public int getRequireNum(){
        return requireNum;        
    }
    
    public int getNumOfPayByVisa(){
        return numOfPayByVisa;
    }
    
    public void setStatusOfSubscribe(boolean Status){
        this.statusOfSubscribe= Status;
    }
}

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
public class Payment {
    
    private double Price;
    private Date dateOfPay;
    private String memberName;
    private String methodOfPay;
    private String visaNum=null;
    
    public Payment(String memberName, Date dateOfPay, String methodOfPay){
        this.memberName = memberName;
        this.dateOfPay = dateOfPay;
        this.methodOfPay = methodOfPay;
    }
    
    public String getMemberName(){
        return this.memberName;
    }
    public Date getDateOfPay(){
        return this.dateOfPay;
    }
    public void payByVisa(double Price, String visaNum){
        this.Price = Price;
        this.visaNum = visaNum;
    }
    public void payByCash(double Price){
        this.Price = Price;
    }
}

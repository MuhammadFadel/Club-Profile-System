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
public class Park {

    private int gateNum;
    private String carNum;
    private String carModel;
    
    
    public Park(int gateNum, String carNum, String carModel){
        this.gateNum = gateNum;
        this.carNum = carNum;
        this.carModel = carModel;
    }
   
    public int getGateNum(){
        return gateNum;
    }
    public String getCarNum(){
        return carNum;        
    }
    public String getCarModel(){
        return carModel;
    }
}

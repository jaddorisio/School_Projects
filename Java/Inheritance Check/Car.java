/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonpaul
 */
public class Car {
    private String Make;
    private String Model;
    private String Vin;
    private int Cyclinder;
    public void setMake(String Make){
        this.Make = Make;    
    }
    public void setModel(String Model){
        this.Model = Model;    
    }
    public void setVIN(String Vin){
        this.Vin = Vin;    
    }
    public void setCylinder(int Cyclinder){
        this.Cyclinder = Cyclinder;    
    }
    public String getMake(){
        return Make;
    }
     public String getModel(){
        return Model;
    }
      public String getVIN(){
        return Vin;
    }
       public int getCylinder(){
        return Cyclinder;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonpaul
 */
public class Inventory {
    private String partNum;
    private String partDesc;
    private int quantity;
    private double price;
    private double total;
    
    public Inventory(String partNum, String partDesc, int quantity, double price, double total){
        this.partNum = partNum;
        this.partDesc = partDesc;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
    }

    public Inventory(){
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setNum(String temp){
        this.partNum = temp;
    }
    public void setDesc(String temp){
        this.partDesc = temp;
    }
    public void setQuan(int temp){
        this.quantity = temp;
    }
    public void setPrice(double temp){
        this.price = temp;
    }
    public void setTotal(double temp){
        this.total = temp;
    }
    
    public String getNum(){
     
        return this.partNum;
    }
    public String getDesc(){
     
        return this.partDesc;
    }
    public int getQuan(){
     
        return this.quantity;
    }
    public double getPrice(){
     
        return this.price;
    }
    public double getTotal(){
     
        return this.total;
    }
    
    }
    

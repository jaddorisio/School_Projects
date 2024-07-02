/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonpaul
 */
public class Inventorytest {
    
    public void main(String [] args){
    Inventory inv1 = new Inventory();
    Inventory inv2 = new Inventory("2323", "meow", 43, 344, 3434);
    
    System.out.println(inv2.getNum() + ", " + inv2.getDesc() + ", " inv2.getQuan()+ ", " +
            inv2.getPrice()+ ", " + inv2.getTotal());
        
        
    }
}
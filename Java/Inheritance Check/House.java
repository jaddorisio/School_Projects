/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonpaul
 */
public class House {
    
    private String doorColor;
    
    public House(String doorColor){
        this.doorColor = doorColor;
    }
    public House(){
    
    }
    
    public void setColor(String newColor){
        doorColor = newColor;
    }
    public String getColor(){
        return doorColor;
    }
    @Override
    public String toString(){
        return doorColor;
    }
    
}

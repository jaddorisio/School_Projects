/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonpaul
 */
public class HouseTester {
    
    public static void main(String [] args) {
        House house1 = new House();
        House house2 = new House("Yello");
        System.out.println(house1.getColor());
        System.out.println(house2.toString());
    }
    
}

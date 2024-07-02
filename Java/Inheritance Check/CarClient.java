/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonpaul
 */
import java.util.Scanner;

public class CarClient{
    
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);    
    Car t = new Car();
    System.out.println("Welcome to the Massachusetts Registry of Motor Vehicles\n\n");
    System.out.println("Enter the car make:");
    String input = in.nextLine();
    
    t.setMake(input);
    System.out.println("Enter the car Model:");
    input = in.nextLine();
    t.setModel(input);
    System.out.println("Enter the VIN number:");
    input = in.nextLine();
    t.setVIN(input);
    System.out.println("Enter the number of cylinders:");
    int number = in.nextInt();
    t.setCylinder(number);

    System.out.printf("%s", "Vehicle Data\n\n");
    System.out.printf("%s\t%s\t%s\t%s\n", "Make", "Model", "VIN#", "#Cylinders");
    System.out.printf("%s\t%s\t%s\t%s", t.getMake(), t.getModel(),t.getVIN(),""+t.getCylinder());
  }/*end main method*/
 }/*end class CarClient*/


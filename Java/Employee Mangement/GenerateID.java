/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonpaul
 */
import java.security.SecureRandom;
public class GenerateID {
    // Declaring needed intance variables
    private String EmployeeID;
    private String dept;
    private String positionNumber;
    private BasicInfo info;
    
    // A construcer that will set instance variables
    public GenerateID(BasicInfo info){
        this.dept = info.getDept();
        this.EmployeeID = info.getID();
        this.info = info;
    }
    
    
    // Method Name: createRanID
    // Desc: A method that will
    //       return a number between 1000
    //       and 9999
    // Input: N/A
    // Output: Integer 
    public static String createRanID(){
        String id;
        int temp;
        SecureRandom ranNum = new SecureRandom();
        
        
        temp = 1000 + ranNum.nextInt(9000);
        
        id = Integer.toString(temp);
        return id;
    }
    
    // Method Name: play
    // Desc: A method that will
    //       take an abreviation
    //       and create a postion number
    // Input: String
    // Output: New Instance varible value
    public void createPostionNum(String Abv){
        this.positionNumber = Abv + EmployeeID;
        }
    
    public String getPostionNum(){
        return positionNumber;
    }
    
    // Method Name: toString
    // Desc: A method that will
    //       take instance variable
    //       and display as string
    // Input: N/A
    // Output: String Display 
    public String toString(){
    
    
    String str = "Postion Number Created!\n" +
          "Postion Number: " + positionNumber +
          "\n" + "\n" + info;
    
    return str;
    }
    }


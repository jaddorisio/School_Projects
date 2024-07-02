// File name: IllegalTriangleException.java

// Written by: Jonpaul Addorisio
 
// Description: A custom designed exception made for "catching" any 
//              illegal triangles
//              
// Challenges: N/A 
//             
//
// Time Spent: 10 min

// Revision History:
// Date:         		By:      Action:
// ---------------------------------------------------
/* 09/10/2017                  JA      Created                       
 * 
 * 
 *                        
*/   
public class IllegalTriangleException extends Exception{
    
    // contructer that gives message when illegal triangle is created
    public IllegalTriangleException(double side1, double side2, double side3){
        super("Illegal Triangle" + "\nSide 1: " + side1 + "\nSide 2: " +  side2
        + "\nSide 3: "+ side3);
    }
        
    
}

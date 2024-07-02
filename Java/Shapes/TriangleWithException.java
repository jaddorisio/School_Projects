// File name: TriangleWithException.java

// Written by: Jonpaul Addorisio
 
// Description: A class file inputs the sides of a triangle to determine 
//              whether or not the triangle happens to be illegal
//              
//              
// Challenges: Getting the custome made exception to work
//             
//
// Time Spent: 20 min

// Revision History:
// Date:         		By:      Action:
// ---------------------------------------------------
/* 09/10/2017                  JA      Created                       
 * 10/10/2017                  JA      Properly added the "throw"
                                       for exception 
 *                      
 * 
 *                        
*/   
public class TriangleWithException {
    
    //Variables for sides of a triangle 
    private double side1;
    private double side2;
    private double side3;
    
    // A contructer statemnet that inputs triagle sides and throws an
    // exception if the triangle is considered to be illegal
    public TriangleWithException(double side1, double side2, double side3)
     throws IllegalTriangleException{
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        
                if ((side1 + side2) <= side3 || (side1 + side3) <= side2 || (side3 + side2) <= side1){
                    throw new IllegalTriangleException(side1, side2, side3);
                }

           
    }
    
    // Methods for calc the are and permimeter of triangle
    public double getArea(){
        double s;
        s = (this.side1 + this.side2 + this.side3)/2;
    return (Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)));    
    }
    public double getPerimeter(){
        
        return (this.side1 + this.side2 + this.side3);
    }

}
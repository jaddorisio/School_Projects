// File name: Triangle.java

// Written by: Jonpaul Addorisio
 
// Description: A class file that contains the nessorcy methods for calculating
//              the area and perimeter of a triangle.
//              
//              
// Challenges: N/A 
//             
//
// Time Spent: 20 min

// Revision History:
// Date:         		By:      Action:
// ---------------------------------------------------
/* 09/10/2017                  JA      Created                       
 * 
 *                      
 * 
 *                        
*/   
public class Triangle extends GeometricObject{
    //Variables for side
    private double side1;
    private double side2;
    private double side3;
    
    
    // Contructer statements to set triangle side
    public Triangle(){
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    
    // Methods that return specific triangle side 
    public double getSide1(){
        return this.side1;
    }
    public double getSide2(){
        return this.side2;
    }
    public double getSide3(){
        return this.side3;
    }
    
    
    
    // Methods that calculate the area and permieter of a triangle
    public double getArea(){
        double s;
        s = (this.side1 + this.side2 + this.side3)/2;
        
        return (Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)));
    }
    public double getPerimeter(){
        
        return (this.side1 + this.side2 + this.side3);
    }
    
    // Retrieve the name of shape
    public String getName(){
        return "Triangle: side1  =" + this.side1 + "side2  = " + this.side2 + " side3  = " + this.side3;
    }
        

}

// File name: Circle.java

// Written by: Jonpaul Addorisio
 
// Description: A class file that is used for calculating the perimeter,
//              and area of a circle. Then return those said calculations
//              
//              
// Challenges: Returning the color and filled variables to
//             the instance variables in the GeometricObject 
//             class
//
// Time Spent: 20 min

// Revision History:
// Date:         		By:      Action:
// ---------------------------------------------------
/* 04/10/1997                   JA      Created                       
 * 
 *                      
 * 
 *                        
*/      

public class Circle extends GeometricObject {
    
    // Varaible to store dimensions of circle
    private double radius;
    private double diameter;
    
    
    // Different contructers to handle certian arguments
    public Circle(){
      this.radius = 0.0;  
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super (color, filled);
        this.radius = radius;
    }
    
    // A set of methods to retrive and set instance variables
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        this.radius = r;
    }
    public double getDiameter(){
        return diameter;
    }
    public void setDiameter(double d){
        this.diameter = d * Math.PI;
    }
    
    
    
    // Methods that calculate the area
    // and permiter of circles
    public double getArea(){
        return (this.radius * this.radius * Math.PI);
    }
    public double getPerimeter(){
        setDiameter(this.radius);
        return (this.diameter *Math.PI);
    }
    
    // Retrieve the name of shape
    public String getName(){
        return "[Circle] Radius = " + radius;
    }
    
    
    // A method that will compare the object and return
    // an integer that represents greater than, less than,
    // or equal too
     public int compareTo(GeometricObject o){
    if (this.getArea() > o.getArea()){
    return 1;
            }
    else if(this.getArea() < o.getArea()) {
        return -1;
    }
    else {
        return 0;
    }
     }
}
// File name: Shape.java

// Written by: Jonpaul Addorisio
 
// Description: A class file that contains 3 abstract methods that allow for
//              the correct return of data based on the type of shape that is 
//              being calculated. All other class derive off this main class
//              
//              
// Challenges: No challenges were met when creating this object
//
// Time Spent: 10 min

// Revision History:
// Date:         		By:      Action:
// ---------------------------------------------------
/* 04/10/1997                   JA      Created                       
 * 
 *                      
 * 
 *                        
*/   
public abstract class Shape {
    
    // A set of need instance variables
    private int X;
    private int Y;
    
    // Multiple contructers to handle different arguments
    public Shape(){
       this.X = 0;
       this.Y = 0;
        
    }
    public Shape(int x, int y){
        this.X = x;
        this.Y = y;
    }
    
    
    // Sets and retrieve instance variables
    public void setX(int x){
        this.X = x;
    }
    public void setY(int y){
        this.Y = y;
    }
    public int getX(){
        
        return this.X;
    }
    public int getY(){
        
        return this.Y;
    }

    // A set of absrtact method for use various
    // shape classes
    public abstract String getName();
    public abstract double getArea();
    public abstract double getPerimeter();
    
}

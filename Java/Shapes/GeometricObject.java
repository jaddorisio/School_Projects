// File name: GeometricObject.java

// Written by: Jonpaul Addorisio
 
// Description: A class file that contains a lot of the heavy lifting for this 
//              program. Contains the needs to return correct information for the
//              user to see based on whatever shape was used.
//              
//              
// Challenges: Correctly implementing the comparable interface and creating 
//             the "logic" statement for the compareTo statement
//
// Time Spent: 60 min

// Revision History:
// Date:         		By:      Action:
// ---------------------------------------------------
/* 04/10/1997                   JA      Created                       
 * 05/10/1997                   JA      Implementing the CompareTO method
 *                      
 * 
 *                        
*/   
import java.util.Date;
public abstract class GeometricObject extends Shape implements Comparable <GeometricObject> { 
    // Set of variable for shape features and to return a date
    private String color;
    private boolean filled;
    private Date dateCreated;
    


// Multiple contructers to handle different arguments    
public GeometricObject(){
    this.color = "white";
    this.filled = false;
    this.dateCreated = new java.util.Date();
}
public GeometricObject(String color, boolean filled){
    this.color = color;
    this.filled = filled;
    this.dateCreated = new java.util.Date();
}
public GeometricObject(int x, int y, String color, boolean filled) {
    super (x, y);
    this.filled = filled;
    this.color = color;
    this.dateCreated = new java.util.Date();
    
}

// Set variable color and returns color
public String getColor(){
    return color;
}
public void setColor(String color){
    this.color = color;
}

// A method to display date, color, and if shape is filled to the user
public String toString(){
    String string;
    String date;
    date = dateCreated.toString();
    
    string = "created on " + date + "\ncolor " + color + " and filled: " + filled +"\n";
            
    return string;
           
}

// A method that will compare the object and return
// an integer that represents greater than, less than,
// or equal too

    @Override
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
// Methods to check if shape is filled and set filled variable
public boolean isFilled(){
    if (filled == true){
        return true;
    }
    else{
        return false;
    }
}
public void setFilled(boolean filled){
    this.filled = filled;
}


// a method that returns the date
public Date getDateCreated(){
    return dateCreated;
}



// A method that will determine the greatest shape dimension 
// out of a 2 peice array
public static GeometricObject max(GeometricObject o1, GeometricObject o2){
       if (o1.compareTo(o2) > 0){
           return o1;
       } 
       else{ 
           return o2;
       }
}
}


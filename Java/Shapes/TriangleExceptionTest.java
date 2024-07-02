// File name: TriangleWithExceptionTest.java

// Written by: Jonpaul Addorisio
 
// Description: The main class file for demonstrating if a triangle
//              is illegal. If the Triangle is legal the area and
//              perimeter will be displayed
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
public class TriangleExceptionTest {
    public static void main( String args[] )
   {
       
       // A try block for catching to see if triangle objects
       // being created are illegal triangles
       try{
       TriangleWithException t1 = new TriangleWithException(1.5, 2, 3);
       System.out.println("Perimeter for t1: " + t1.getPerimeter());
       System.out.println("Area for t1: " + t1.getArea());
       TriangleWithException t2 = new TriangleWithException(1, 2, 3);
       System.out.println("Perimeter for t2: " + t2.getPerimeter());
       System.out.println("Area for t2: " + t2.getArea());
       }
       catch(IllegalTriangleException ex){
       System.out.println(ex.getMessage());
        }
       

   
}
}
    


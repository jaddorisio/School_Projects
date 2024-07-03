package A5PQueue;
// Program Description:  The program will implement a Priority Queue based on a Heap based on a linked Binary Tree
// File name: PromotionPointsSystemTester1.java
// File description: This is the tester that will be used to exercise the methods of the PromotionPointsSystem.

// Java Files in this program:  
// Provided by professor: Emp, BTNode, BinaryTree, BinaryTreeException,
//                        PromotionPointsSystem, 2 testers
// Written by student: Heap, PriorityQueue

// Revision History:
// Date:                   By:               Action:
// ---------------------------------------------------
// 12/03/2016              mb              Created
public class PromotionPointsSystemTester1
{
    static PromotionPointsSystem P = new PromotionPointsSystem();
    
    public static void main (String[] args){

            try{    System.out.println  ("PromotionPointsSystemTester1 output:");
                    System.out.println  ("\nHiring Alice");
                    P.hire( new Emp ("Alice","111","Finance", 20));
                    report();
                    
                    System.out.println  ("\nHiring Bill");
                    P.hire( new Emp ("Bill","222","HR" ,10));
                    report();
                                        
                    System.out.println("\nPROMOTED: " + P.promote());
                    report();                      

                    System.out.println  ("\nHiring Charlene");
                    P.hire( new Emp ("Charlene","333","IT",100));
                    report();  
                    
                    System.out.println  ("\nHiring David\n");
                    P.hire( new Emp ("David","444","Admin",50));
                    report();   
                    
                    System.out.println("\nPROMOTED: " + P.promote());
                    report();
                    
                    System.out.println  ("\nHiring Edith\n");
                    P.hire( new Emp ("Edith","555","IT",300));
                    report();   
                    
                    System.out.println  ("\nHiring Ferdinand\n");
                    P.hire( new Emp ("Ferdinand","555","HR",150));
                    report();      
                    
                    System.out.println("\nPROMOTED: " + P.promote());
                    report();

                    System.out.println("\nPROMOTED: " + P.promote());
                    report();                   
                    
                    System.out.println("\nPROMOTED: " + P.promote());
                    report();                       

                    System.out.println("\nPROMOTED: " + P.promote());
                    report();    
                                      
                    System.out.println("The next promote should cause an exception:");
                    System.out.println("\nPROMOTED: " + P.promote());
                   
            }
            catch (Exception ex)
            {  System.out.println ("Error: "+ ex.getMessage());}

            System.out.println ("Press Enter to end program.");
            try	
                    {System.in.read();}
                                catch(Exception ex)
                    {System.out.println (ex.getMessage());}
    }
    public static void report () {
        System.out.println("Are there any Employees to promote? " + !P.isEmpty());
        System.out.println ("Number of Employees to be promoted: "+ P.howMany());
        System.out.println  ("Next in line for promotion: "+ P.nextPromotion());
    }
          
}
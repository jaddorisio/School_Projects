package A5PQueue;

// Program: PromotionPointsSystem
// Written by: Margie Bleichman
// Program Description:  The program will implement a Priority Queue based on a Heap based on a linked Binary Tree
// File name: PromotionPointsSystem.java
// File description: This class implements the Promotion Queue.  Note that it "knows" about Employees and 
//      sets the generic to Emp when instantiating the Priority Queue.

// Java Files in this program:  
// Provided by professor: Emp, BTNode, BinaryTree, BinaryTreeException,
//                        PromotionPointsSystem, 2 testers
// Written by student: Heap, PriorityQueue

// Revision History:
// Date:                   By:               Action:
// ---------------------------------------------------
// 12/03/2016              mb              Created

public class PromotionPointsSystem {

    PriorityQueue <Emp> PQ = new PriorityQueue();

    public int howMany() {return PQ.PQSize;}
    
    public boolean isEmpty() {return (PQ.PQSize== 0);}
    
    public void hire(Emp newEmployee) {try {
        PQ.insertItem (newEmployee);
        } catch(Exception ex)
                    {System.out.println (ex.getMessage());
        }
  }
    
    public Emp promote()  {
        try {  return PQ.removeItem  ();
        }
        catch (Exception ex)
        {System.out.println ("Error: "+ ex.getMessage()); return null;}
    }
    
    public Emp nextPromotion()        {return PQ.nextItem();}

}


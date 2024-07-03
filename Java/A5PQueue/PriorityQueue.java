package A5PQueue;
// Written by: Margie Bleichman
// Program Description:  The program will implement a Priority Queue based 
//      on a Heap based on a node-based Binary Tree.
//      PriorityQueue is a Heap that stores objects in a certain order.
//      This one will always maintain the MAXIMUM key in the root.
// File name: PriorityQueue.java 
// File description: This is the Priority Queue class.  This Priority Queue is sorted with the MAX key in the root.
//      This means that when doing up heap or down heap bubbling, we must ensure that element in the parent is 
//      always greater than or equal to the element of each of its children.

// Java Files in this program:  
// Provided by professor: Emp, BTNode, BinaryTree, BinaryTreeException,
//                        PromotionPointsSystem, 2 testers
// Written by student: Heap, PriorityQueue

// Note the "extends Comparable".  This is so that two E's may be compared, using the compareTo() method.
// You can find the compareTo() method already written in the Emp class.
// Here is an example of code that uses this method appropriately (and it is an actual line from a solution.)
//            if (c.element().compareTo(p.element()) <= 0) break;  // if child is smaller, done

// Revision History:
// Date:                    By:             Action:
// ---------------------------------------------------
// 12/03/2016               mb              Created
// 04/18/2018               mb              added comments re: exceptions

public class PriorityQueue<E extends Comparable> extends Heap<E > {
    // This is the only instance variable for this class: (do not add any others!
    protected int PQSize = 0;  // counts only internal nodes!
    
// (25 points)   
// Insert an item into the Priority Queue. This method overrides the Heap's.
    // Pre-conditions:
    // Post-conditions:   
    @Override
    public void insertItem (E item) throws BinaryTreeException{
    // asserts/exception handling
    // Use priority queue heap insertion algorithm studied in class.  
    // Add the item to the Heap: use only Heap's insertItem() to do this part!
    // (Heap's insertItem() throws exception)
    // (Hint: after the insertItem the new item is in the Last Node.)   
    // Then use Up-Heap Bubbling.  Use swapElements() as it bubbles up!
   
    super.insertItem(item);
    
    
    BTNode<E> currentNode = lastNode;
        
        while(!isRoot(currentNode) && currentNode.element().compareTo(currentNode.parent().element()) > 0){ 
            swapElements(currentNode, currentNode.parent());
            currentNode = currentNode.parent();
            
        }
    
    this.PQSize +=1;
   
    
   
    
   
    }
    
// Peek at the next element that would be returned, but don't remove it.
   // This method is complete.
   public E nextItem() {return  root.element();} // don't change this method at all!
   
// (25 points)   
// Removes and returns the next item in the Priority Queue. This method overrides the Heap's.
// Use priority queue heap removal algorithm studied in class. 
// swaps the location of the root and the last element.  Removes the last element
// then bubbles the root element down to the correct location
    // Pre-conditions:
    // Post-conditions:  
    @Override
    public E removeItem() throws BinaryTreeException{
    // asserts/exception handling
    // Call Heap's removeItem().  It returns an important element...
    // (Heap's removeItem() throws exception)
    // Copy Last Node's element to the root. ( 
    // Then use Down-Heap Bubbling. Use swapElements() as it bubbles down!
    // Return the next item in the Priority Queue (which should have been stored earlier.) 
    
    super.swapElements(root,lastNode );
    E item = super.removeItem();
    
    
  
    BTNode<E> currentNode = root;
        
        while(isExternal(currentNode) && (currentNode.element().compareTo(currentNode.leftChild().element()) > 0) || (currentNode.element().compareTo(currentNode.rightChild().element()) > 0)){
            if((currentNode.leftChild().element().compareTo(currentNode.rightChild().element()) > 0) && (currentNode.element().compareTo(currentNode.leftChild().element()) > 0)){
                swapElements(currentNode, currentNode.leftChild());
                currentNode = currentNode.leftChild();
                
            }else{
                swapElements(currentNode, currentNode.rightChild());
                currentNode = currentNode.rightChild();
            }
            
        }
    
    this.PQSize -=1;
    
    return root.element();  //replace this!  it should return the item, not null. 
    }
}
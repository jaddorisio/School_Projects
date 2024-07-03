package A5PQueue;
// Written by: Margie Bleichman
// Program Description:  The program will implement a Priority Queue based on a Heap based on a linked Binary Tree
// File name: Heap.java
// File description: This builds the Heap based on the Linked Binary Tre

// Java Files in this program:  
// Provided by professor: Emp, BTNode, BinaryTree, BinaryTreeException,
//                        PromotionPointsSystem, 2 testers
// Written by student: Heap, PriorityQueue


// Revision History:
// Date:        By:     Action:
// ---------------------------------------------------
// 12/03/2016   mb      Created
// 04/18/2018   mb      removed throw exceptions from last two methods

public class Heap<E> extends BinaryTree<E> { 
    // These are the only instance variables for this class: (do not add any others!
    protected BTNode<E> insertionNode = root;
    protected BTNode<E> lastNode = null;
    
// (5 points)
// Adds an item to the heap at the insertion node. 
    // Pre-conditions:
    // Post-conditions:
    public void insertItem(E item) throws BinaryTreeException{  
    // asserts/exception handling
    // update lastNode (trivial -- don't call any method for this!)
    // put the new element in
    // call  expandExternal() on the appropriate node (this one throws exception)
    // call setInsertionNode() to find and set the new insertion node
    
    if(insertionNode == root)
    lastNode = insertionNode;
    else{
        setLastNode();
    }
   
    
    
    lastNode.setElement(item);
    
    
    
   
    expandExternal(insertionNode);
    setInsertionNode();
    }
    
// (5 points)   
// Removes two nodes (the last node and its right child).  Returns the element of the last node.
    // Pre-conditions:
    // Post-conditions:    
    public E removeItem() throws BinaryTreeException{ 
    // asserts/exception handling
    // update insertionNode (trivial:  don't call any method for this!)
    // (Hint: we know the insertionNode with respect to the Last Node -- catch it now before we remove the Last Node!)
    // call removeAboveExternal() (this one throws exception)
    // call setLastNode() 
    
    //Change
    insertionNode = lastNode.parent();
    
    
    E item = lastNode.element();
    removeAboveExternal(lastNode.rightChild());
    setLastNode();
    
    
    
    
    
        return item;  //replace this!  return the element removed
    }
    
// (20 points) 
// Finds the new Insertion node starting at the Last Node, and sets the insertionNode instance variable.
    // Pre-conditions:
    // Post-conditions:   
    private void setInsertionNode() {
    // asserts/exception handling 
    // Start at Last Node. 
    // Go up while not at a left child or at root.
    // Go to sibling or right child of the root.
    // Go down along left children until you reach an external node.  
    // That's the new Insertion Node.
    insertionNode = lastNode;
    while(super.isLeftChild(insertionNode) != true && super.isRoot(insertionNode) != true ){
        insertionNode = insertionNode.parent();
        
    
    }
    
       if(insertionNode == root){
           insertionNode.rightChild();
       }
       else{
       insertionNode = super.sibling(insertionNode);
       }
    

    
    while(super.isInternal(insertionNode)){
        insertionNode = insertionNode.leftChild();
    }
    
           
            }
    
         
// (20 points)
// Finds the new Last Node starting at the Insertion Node, and sets the lastNode instance variable.
    // Pre-conditions:
    // Post-conditions:   
    private  void setLastNode() { 
    // asserts/exception handling
    // Start at Insertion Node.  
    // Go up while not at a right child or at root.
    // Go to sibling or left child of the root.
    // Go down along right children until you reach an external node.  
    // Its parent is the new Last Node.
      lastNode = insertionNode;
    while(isRightChild(lastNode) != true && isRoot(lastNode) != true ){
        lastNode = lastNode.parent();
        
    
    }
       if(lastNode == root){
           lastNode = root.leftChild();
       }
       else{
       lastNode = sibling(lastNode);
       }

    
    while(isInternal(lastNode)){
        lastNode = lastNode.rightChild();
    }
           
            }
    
    }   

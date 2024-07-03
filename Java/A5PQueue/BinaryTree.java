package A5PQueue;

// Program: PromotionPointsSystem
// Written by: Margie Bleichman
// Program Description:  The program will implement a Priority Queue based on a Heap based on a linked Binary Tree
// File name: PriorityQueue.java 
// File description: This builds a linked Binary Tree (simplified -- needs exception handling.)

// Java Files in this program:  
// Provided by professor: Emp, BTNode, BinaryTree, BinaryTreeException,
//                        PromotionPointsSystem, 2 testers
// Written by student: Heap, PriorityQueue

// Revision History:
// Date:            By:     Action:
// ---------------------------------------------------
// 04/20/2012       mb      Created
// 04/17/2018       mb      Added pre-order toString, call nullify, 
//                          changed size to BTsize for clarity

// This set is a transparent layer of methods calling their counterparts in the BTNode layer
// protected BTNode <E> parent (BTNode <E> v) 	{return v.parent(); }
// protected BTNode <E> leftChild (BTNode <E> v)	{return v.leftChild(); }
// protected BTNode <E> rightChild (BTNode <E> v)	{return v.rightChild();}
// protected E element (BTNode <E> v)		{return v.element();}

public class BinaryTree <E>
{   protected BTNode <E> root = new BTNode<>();  // starts out with just a root, which is external and empty
    protected int BTsize = 1; // how many nodes are in the tree
    
    protected int size() {return BTsize;}
    
    protected void replaceElement(BTNode <E> v, E e)	{v.setElement(e);}
    
    protected boolean isRoot(BTNode <E> v){ // Node is root if parent is null
        return (v.parent() == null);    }

    protected boolean isInternal(BTNode<E>  v){ //Node is internal if it has at least one child
        return (v.leftChild() != null || v.rightChild() != null);    }

    protected boolean isExternal(BTNode<E>  v){//Node is external if both children are null
        return (v.leftChild() == null && v.rightChild() == null);    }

    protected boolean isRightChild(BTNode<E> v){//Node is right child if it equals its parent's right child
        if (isRoot(v)) return false;
        return (v == (v.parent()).rightChild());    }

    protected boolean isLeftChild(BTNode<E>  v){//Node is left child if it equals its parent's left child
        if (isRoot(v)) return false;
        return (v == (v.parent()).leftChild());    }

    protected void swapElements(BTNode<E>  v, BTNode<E>  x){
        E temp = v.element();
        v.setElement(x.element());
        x.setElement(temp);    }

    protected BTNode<E>  sibling(BTNode<E>  v) { 
        if (v.parent()==null) return null;  // root has no sibling
        if (v == v.parent().rightChild())
        	return (v.parent()).leftChild();
        else
        	return (v.parent()).rightChild();    }

    protected void expandExternal(BTNode<E>  v) throws BinaryTreeException {
        if (!isExternal(v)) throw new BinaryTreeException("expandExternal parameter must be external");
        BTNode<E>  newLeft  = new BTNode(v, null, null, null);
        v.setLeftChild(newLeft);
        BTNode<E>  newRight = new BTNode(v,null, null, null);
        v.setRightChild(newRight);
	BTsize +=2;       }

    protected void removeAboveExternal(BTNode<E>  v) throws BinaryTreeException {
        BTNode<E>  p = v.parent(); 	// going to be looking at parent a lot
        if (!isExternal(v)) throw new BinaryTreeException("removeAboveExternal parameter must be external");
        if (isRoot(v)) throw new BinaryTreeException("removeAboveExternal: can't remove root");	
        if (isRoot(p)) // if we are removing the root node, the left child becomes the new root!  No internal nodes.
        {   root = root.leftChild();
            root.setParent(null);        }
        else
        {
            // set the parent's parent to point to the sibling of the node that's being deleted
            if (isRightChild(p))
                    (p.parent()).setRightChild(this.sibling(v));
            else
                (p.parent()).setLeftChild(this.sibling(v));}
            this.sibling(v).setParent(p.parent());	// set the sibling's parent to the parent's parent
                          //set up for garbage collection
            v.nullify(); // really just need to null parent, everything else is already null
            p.nullify();
            BTsize -=2;    }
    
 public  String toString() { return toStringPreorder(root);}
 
 public  String toStringPreorder(BTNode<E>  v) {
    String s = "";
    s += v.element() ; // the main "visit" action
    if (isInternal(v))
    {  
        s += " {" + toStringPreorder(v.leftChild()); 
        s += " & " + toStringPreorder(v.rightChild()) + "} " ;
     }
    return s;  }

}
package A5PQueue;

// Program: PromotionPointsSystem
// Written by: Margie Bleichman
// Program Description:  The program will implement a Priority Queue based on a Heap based on a linked Binary Tree
// File name: BTNode.java 
// File description: This is the node that is used to build the linked Binary Tree.

// Java Files in this program:  
// Provided by professor: Emp, BTNode, BinaryTree, BinaryTreeException,
//                        PromotionPointsSystem, 2 testers
// Written by student: Heap, PriorityQueue

// Revision History:
// Date:                By:     Action:
// ---------------------------------------------------
// 04/20/2012           mb      Created
// 04/18/2018           mb      added nullify()     

public class BTNode <E>
{

    private BTNode <E> par;
    private BTNode <E> left;
    private BTNode <E> right;
    private E elem;

    BTNode ( )
    {
        this(null,null,null,null);
    }

    BTNode(BTNode <E> p, BTNode <E> l, BTNode <E> r, E e)
    {
        par 	= p;
        left	= l;
        right	= r;
        elem	= e;
    }


    public void setLeftChild(BTNode <E>  v) {left = v;}

    public void setRightChild(BTNode <E>  v){right = v;}

    public void setParent(BTNode <E>  v) 	{par = v;}

    public void setElement(E e)             {elem = e;}

    public BTNode <E>  leftChild()       {return left;}

    public BTNode <E>  rightChild()    {return right;}

    public BTNode <E>  parent()          {return par;}

    public  E element()    	{return elem;}
    
    public void nullify() { par = left = right = null; elem = null;}    
}
package A5PQueue;

public class BinaryTreeException extends Exception{
    
    public BinaryTreeException(){
        this("Binary Tree Exception");
    }
    
    public BinaryTreeException(String message){
        super(message);
    }
}

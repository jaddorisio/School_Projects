
public class BasicInfo {
    // Declaring needed instance
    // variables
    private String firstName;
    private String lastName;
    public String iD;
    public String dept;
    private String address;
    private String emailAddress;
    private String postionTitle;
    
    
    // A constructer that will declare instance variables
    // as empty
    public BasicInfo(){
        this.firstName = "Empty";
        this.lastName = "Empty";
        this.iD = "Empty";
        this.dept = "Empty";
        this.address = "Empty";
        this.emailAddress = "Empty";
        this.postionTitle = "Empty";
    }
    
    // A set of methods that will
    // set said instance variables
    public void setFirstName(String temp){
        this.firstName = temp;
    }
    public void setLastName(String temp){
        this.lastName = temp;
    }
    public void setID(String temp){
        this.iD = temp;
    }
    public void setDept(String temp){
        this.dept = temp;
    }
    public void setAddress(String temp){
        this.address = temp;
    }
    public void setEmailAddress(String temp){
        this.emailAddress = temp;
    }
    public void setPostionTitle(String temp){
        this.postionTitle = temp;
    }
    
    //A set of methods that will return
    //said instance variables
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getID(){
        return this.iD;
    }
    public String getDept(){
        return this.dept;
    }
    public String getAddress(){
        return this.address;
    }
    public String getEmailAddress(){
        return this.emailAddress;
    }
    public String getPostionTitle(){
        return this.postionTitle;
    }
 

// Method Name: toString
// Desc: A method that will
//       take instance variable
//       and display as string
// Input: N/A
// Output: String Display 
     public String toString()
   {
      // Create a string representing the object.
     
       String str = "First Name:\n" + firstName
                   + "\nLast Name:\n"
                   + lastName
                   + "\nID:\n"
                   + iD
                   + "\nDepartment:\n"
                   + dept
                   + "\nAddress:\n"
                   + address
                   + "\nEmail Address:\n"
                   + emailAddress
                   + "\nPostion Title:\n"
                   + postionTitle;


      // Return the string.
      return str;
   }
    
}

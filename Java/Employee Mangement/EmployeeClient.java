// Program: Employee Information System
// Written by: Jonpaul Addorisio
// Description:
//             An Employee Information system, intended for the use of the 
//             manager or other administrative personal to store, edit, and 
//             re-access their Employees’ information. The ability to calculate 
//             bussiness budget and salary.
// Challenges:: 
//             Storing objects to a list and properly using compostion
//          
// Time Spent: 7 hours
// Given Input:               Expected Output:
// --------------------          -------------------------
//  User Clicks Add Employee      User Will face input message about 
//                                adding employee info
//
//  User Clicks Search            A prompt asking for the users
//  Employee                      first name will displayed
//                                then a search loop will commence
//
//  User Click Salary Calc        User will be asked for monetary infomation
//                                then will have info calculated and displayed
//
//
//                   Revision History
// Date:                   By:               Action:
// ---------------------------------------------------
// 05/03/2017              JA                 2 New Class Created
// 05/07/2017              JA                 1 New Class Created
// 05/09/2017              JA                 2 New Class Created
// 05/10/2017              JA                 Final Touches

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EmployeeClient {
    public static void main(String args[]){
        
        // Declaring needed arrays
        ArrayList<BasicInfo> infoList = new ArrayList<BasicInfo>();
        ArrayList<String> posNum = new ArrayList<String>();
        
        
        
        // Setting the first GUI input box
        Object[] options = {"Add Employee",
                    "Search Employee",
                    "Salary Calculator"};
        
        int Run = JOptionPane.showOptionDialog(null,
                "Welcome, to Employee Information System \nPlease select an option!" ,
                "Employee Information System",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]);
        
        // A loop for selecting options in the applications
        while(Run != JOptionPane.CLOSED_OPTION){
            if (Run == JOptionPane.YES_OPTION){
                //Declaring a new object for employee
                BasicInfo infoCollection = new BasicInfo();
                
                // Sets information to the new object for employee and appends
                // to the array
                infoCollection.setID(GenerateID.createRanID());
                infoCollection.setFirstName(JOptionPane.showInputDialog("Please Enter First Name"));
                infoCollection.setLastName(JOptionPane.showInputDialog("Please Enter Last Name"));
                infoCollection.setDept(JOptionPane.showInputDialog("Please Enter Deparment"));
                infoCollection.setAddress(JOptionPane.showInputDialog("Please Enter Address"));
                infoCollection.setEmailAddress(JOptionPane.showInputDialog("Please Enter Email Address"));
                infoCollection.setPostionTitle(JOptionPane.showInputDialog("Please Enter Postion Title"));
                infoList.add(infoCollection);
                
                GenerateID PosNumCreator = new GenerateID(infoCollection);
                
                //Creates the postion number then displays all info to the user
                PosNumCreator.createPostionNum(JOptionPane.showInputDialog("Enter Dept Abreviation"));
                posNum.add(PosNumCreator.getPostionNum());
                JOptionPane.showMessageDialog(null, PosNumCreator);
                
            }
            
            else if(Run == JOptionPane.NO_OPTION){
                // New Gui input box for search options
                Object[] options2 = {"Search First Name",
                    "Search Last Name",
                    "Search Postion Number"};
                int Search = JOptionPane.showOptionDialog(null,
                "Welcome, to Employee Information System \nPlease select an option!" ,
                "Employee Information System",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options2,
                options2[2]);
                
                while (Search != JOptionPane.CLOSED_OPTION){
                    
                    if (Search == JOptionPane.YES_OPTION){
                        
                        // User inputs first name to be searched
                        String searchName;
                        searchName = JOptionPane.showInputDialog("Enter the first name of the employee you would like to search");
                        searchName = searchName.toLowerCase();
                        boolean EmployeeFound = false;
                
                
                
                        // A for loop for searching the array for info that was typed
                        for(int i=0; i<infoList.size(); i++){
                            if(searchName.equals(infoList.get(i).getFirstName().toLowerCase())){
                                JOptionPane.showMessageDialog(null, infoList.get(i), "Employee Found", 1);
                                EmployeeFound = true;
                         }
                    
                     }
                        // Error message if info is not found
                        if (EmployeeFound == false)
                            JOptionPane.showMessageDialog(null, "This employee does not exist in the data base", "Employee Found", 0);
                    }
                    else if(Search == JOptionPane.NO_OPTION){
                        
                        // USer inputs the last name to be searched
                        String searchName;
                        searchName = JOptionPane.showInputDialog("Enter the last name of the employee you would like to search");
                        searchName = searchName.toLowerCase();
                        boolean EmployeeFound = false;
                
                
                
                        // A for loop for searching the array for info that was typed
                        for(int i=0; i<infoList.size(); i++){
                            if(searchName.equals(infoList.get(i).getLastName().toLowerCase())){
                                JOptionPane.showMessageDialog(null, infoList.get(i), "Employee Found", 1);
                                EmployeeFound = true;
                         }
                    
                     }
                        // Error Mesage if info is not found
                        if (EmployeeFound == false)
                            JOptionPane.showMessageDialog(null, "This employee does not exist in the data base", "Employee Found", 0);
                    }
                    else if(Search == JOptionPane.CANCEL_OPTION){
                        // USer inputs exact postion number to be found
                        String searchName;
                        searchName = JOptionPane.showInputDialog("Enter the postion nubmer of the employee you would like to search" +
                                "\nCase Sensitive!");
                        boolean EmployeeFound = false;
                
                
                
                        // search for that postion number
                        for(int i=0; i<posNum.size(); i++){
                            if(searchName.equals(posNum.get(i))){
                                JOptionPane.showMessageDialog(null, infoList.get(i), "Employee Found", 1);
                                EmployeeFound = true;
                                break;
                         }
                    
                     }
                
                        if (EmployeeFound == false)
                            JOptionPane.showMessageDialog(null, "This employee does not exist in the data base", "Employee Found", 0);
                    }
                    
                    //Ask the user if he or she wants to search another name
                    Search = JOptionPane.showOptionDialog(null,
                            "Welcome, to Employee Information System \nPlease select an option!" ,
                            "Employee Information System",
                            JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            options2,
                            options2[2]);
                
                    
                }
            }
            
            else if(Run == JOptionPane.CANCEL_OPTION){
                SalaryCalc salcalc = new SalaryCalc();
               
                //A loop that will run until the user hits a surplus budget
                while (salcalc.getWorkableBudget() == false){
                    
                    // Ask the user to enter some numeric data
                    salcalc.setBudget(Double.parseDouble(JOptionPane.showInputDialog("Please Enter The Company Budget\nNumeric Entry Only!")));
                    
                    salcalc.setSalary(Double.parseDouble(JOptionPane.showInputDialog("Please Enter The Employee Salary\nNumeric Entry Only!")));
                    salcalc.checkMinWage();
                    salcalc.setBonus(Double.parseDouble(JOptionPane.showInputDialog("Please Enter Any Employee Bonus\nNumeric Entry Only!")));
                
                    salcalc.setHoursWorked(Double.parseDouble(JOptionPane.showInputDialog("Please Enter The Total Hours Worked By Employees"+
                            "\nNumeric Entry Only!")));
                
                    salcalc.calcTotalSal(infoList.size());
                if (salcalc.checkBudget() == true){
                    // Displays results
                    JOptionPane.showMessageDialog(null,"Here are the results\n" +
                            "Budget Surplus: $" + String.format("%.2f", salcalc.CalcBudget()) + "\n" +
                            salcalc.ToString());
                            
                }
                else {
                    //Displays results
                    JOptionPane.showMessageDialog(null, "Insuffcient Budget\n" + 
                            "Budget Defict: $" + String.format("%.2f", salcalc.CalcBudget()) + "\n" +
                             salcalc.ToString());
                }
                }
                
                
            }
            
            else {
                System.exit(0);
            }

            
            Run = JOptionPane.showOptionDialog(null,
                "Please Select an Option",
                "Employement Information System",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]);
        }
        
        
    }
    
}

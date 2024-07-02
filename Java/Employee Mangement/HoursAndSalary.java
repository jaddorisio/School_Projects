
import javax.swing.JOptionPane;


public class HoursAndSalary {
    // declaring needed instance variables
    private double salary;
    private double budget;
    private double hoursWorked;
    
    // A constructer setting intial values
    public HoursAndSalary() {
        this.salary = 0;
        this.budget = 0;
        this.hoursWorked = 0;
    }
    // Method Name: checkMinWage
    // Desc: A method that will
    //       make sure entered salary
    //       is above MA Min Wage
    // Input: N/A
    // Output: New salary
    public void checkMinWage() {
        String salInput;
        double newSal;
        while (this.salary < 11) {
            
            salInput = JOptionPane.showInputDialog("Please Enter a new salary that is above min wage");
            newSal = Double.parseDouble(salInput);
            
            this.salary = newSal;
        }
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public void setBudget(double newBudget){
        this.budget = newBudget;
    }
    
    public void setHoursWorked(double newHours){
        this.hoursWorked = newHours;
    }
    public double getBudget(){
        return budget;
    }
    public double getSalary (){
        return salary;
        
    }
    public double getHoursWorked(){
        return hoursWorked;
    }
}

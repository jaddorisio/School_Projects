
public class SalaryCalc extends HoursAndSalary {
    
    // Declaring needed instance variables
    private double totalSalary;
    private boolean workAbleBudget;
    private double bonus;
    private double budget;
    private double salary;
    
    
    // Constructer setting intial values
    public SalaryCalc() {
        this.budget = 0;
        this.salary = 0;
        this.bonus = 0;
        this.totalSalary = 0;
        this.workAbleBudget = false;
    }
    
    
    // Method Name: checkBudget
    // Desc: A method that will
    //       check to see if budget
    //       is less than total salary
    //       and return a true or false
    //       value based on calculations
    // Input: N/A
    // Output: A boolean value 
    public boolean checkBudget(){
        this.budget = super.getBudget();
        
        if (this.budget < this.totalSalary){
            this.workAbleBudget = false;
        }
        else {
            this.workAbleBudget = true;
        }
        return this.workAbleBudget;
    }
    
    
    // Method Name: calcTotalSal
    // Desc: A method that will
    //       calculate the total salary
    //       of employees
    // Input: Number of employees
    // Output: The total salary
    public void calcTotalSal (int totalEmployees) {
        this.salary = super.getSalary();
        this.totalSalary = (super.getHoursWorked() * salary) + (totalEmployees * bonus);
    }
    
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    
    public double getTotalSalary(){
        return this.totalSalary;
    }
     
    // Method Name: toString
    // Desc: A method that will
    //       take instance variable
    //       and display as string
    // Input: N/A
    // Output: String Display 
    public String ToString(){
        String str = "\nSalary: $" +  String.format("%.2f", this.salary) +
                     "\nBudget: $" + String.format("%.2f", this.budget) +
                     "\nTotal Hours Worked: " + super.getHoursWorked()
                      + "\nPayroll: $" + String.format("%.2f", this.totalSalary);
        return str;
    }
   public boolean getWorkableBudget(){
       return this.workAbleBudget;
   }
   
   // Method Name: CalcBudget
    // Desc: A method that will
    //       take instance variable
    //       and caluclate a new number
    // Input: N/A
    // Output: New instance variable value 
   public double CalcBudget(){
       double total;
       total = this.budget - this.totalSalary;
       return total;
   }
}

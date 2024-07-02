/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonpaul
 */
public class SSclient {
    public static void main (String [] args) {
    
    School school1 = new School();
    school1.setname("MCC");
    System.out.println ("School Name: " + school1.getname());
    
    Student student1 = new Student();
    student1.setname("George Boole");     
    student1.setgpa(3.53);
    System.out.println("Name: " + student1.getname()); 
    System.out.println("Your GPA: " + student1.getgpa());
    
    
    
}
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonpaul
 */
public class Student {
    private String name;
    private double gpa;
    public void setname(String newName){
        name = newName;
    }
    public void setgpa(double newGpa){
        gpa = newGpa;
    }
    
    public String getname(){
        return name;
    }
    public double getgpa(){
        return gpa;
}
}

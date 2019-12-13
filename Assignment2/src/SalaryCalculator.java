//Assignment2 -- this file serves as Davis Dean's submission for Assignment 2
//CSIS 212-D02
//Citations:
//Next double and next int : Random « Development Class « Java, http://www.java2s.com/Code/Java/Development-Class/Nextdoubleandnextint.htm
//Formatting with printf() in Java, https://www.baeldung.com/java-printstream-printf

import java.util.Scanner;


public class SalaryCalculator {
    
    public static void main(String[] args) {
    
        System.out.println("Davis Dean - Assignment 2\n");

        //scanner input method
        Scanner input = new Scanner(System.in);
        
        //collecing hourly rates / hours worked
        
        //hourly rate for employee 1
        System.out.print("Enter Hourly Rate for Employee 1: ");
        double employee1rate = input.nextDouble();
        //hours worked for employee 1
        System.out.print("Enter Hours Worked for Employee 1: ");
        double employee1hours = input.nextDouble();
        
        //hourly rate for employee 2
        System.out.print("Enter Hourly Rate for Employee 2: ");
        double employee2rate = input.nextDouble();
        //hours worked for employee 2
        System.out.print("Enter Hours Worked for Employee 2: ");
        double employee2hours = input.nextDouble();
        
        //hourly rate for employee 3
        System.out.print("Enter Hourly Rate for Employee 3: ");
        double employee3rate = input.nextDouble();
        //hours worked for employee 3
        System.out.print("Enter Hours Worked for Employee 3: ");
        double employee3hours = input.nextDouble();
        
        //print results based on rate * hours
        //using if statements to account for overtime using rate * 1.5 * hours
        
        //employee1
        double employee1 = employee1rate * employee1hours;
        double employee1overtime = employee1rate * 1.5 * employee1hours;
        
        if(employee1hours<=40) {            
            System.out.printf("Pay for Employee 1 is: %s%n", employee1);
        }
        
        else{
            System.out.printf("Pay for Employee 1 is: %s%n", employee1overtime);
        }
        
        //employee2
        double employee2 = employee2rate * employee2hours;
        double employee2overtime = employee2rate * 1.5 * employee2hours;
        
        if(employee2hours<=40) {
            System.out.printf("Pay for Employee 2 is: %s%n", employee2);
        }
        
        else{
            System.out.printf("Pay for Employee 2 is: %s%n", employee2overtime);
        }
        
        //employee3
        double employee3 = employee3rate * employee3hours;
        double employee3overtime = employee3rate * 1.5 * employee3hours;

        if(employee3hours<=40) {
            System.out.printf("Pay for Employee 3 is: %s%n", employee3);
        }

        else{
            System.out.printf("Pay for Employee 3 is: %s%n", employee3overtime);
        }
    }
}

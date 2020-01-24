//Assignment1 -- this file serves as Davis Dean's submission for Assignment 1
//CSIS 212-D02
//Citations:
//Java If ... Else, https://www.w3schools.com/java/java_conditions.asp
//The Modulo Operator in Java, https://www.baeldung.com/modulo-java
//Difference between print() and println() in Java, https://www.geeksforgeeks.org/difference-between-print-and-println-in-java/

import java.util.Scanner;


public class Program2 {
    
    public static void main(String[] args) { 
        
        System.out.println("Davis Dean - Assignment 1\n");
        
        Scanner input = new Scanner(System.in);
        
        
        String name;
        System.out.print("Please Enter Name: ");
        name = input.next();
        
        System.out.printf("Welcome, %s%s", name,", To The Liberty University Website!\nThe Scripture for the day is: Matthew 6:11\n");
        
    }
}

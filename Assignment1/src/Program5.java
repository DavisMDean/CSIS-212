//Assignment1 -- this file serves as Davis Dean's submission for Assignment 1
//CSIS 212-D02
//Citations:
//Java If ... Else, https://www.w3schools.com/java/java_conditions.asp
//The Modulo Operator in Java, https://www.baeldung.com/modulo-java
//Difference between print() and println() in Java, https://www.geeksforgeeks.org/difference-between-print-and-println-in-java/

import java.util.Scanner;

public class Program5 {
    
    public static void main(String[] args) {
        
        System.out.println("Davis Dean - Assignment 1\n");
        
        //scanner input method
        Scanner input = new Scanner(System.in);
        
        //collecting first integer
        System.out.print("Enter first Integer: ");
        int integer1 = input.nextInt();
        
        //collecting second integer
        System.out.print("Enter second Integer: ");
        int integer2 = input.nextInt();
        
        int remainder = integer1 % integer2;
        
        if(remainder==0) {
        
        System.out.printf("%s%s%s%n", integer1, " is a multiple of ", integer2);
        
        }
        
        else{
        System.out.printf("%s%s%s%n", integer1, " is not a multiple of ", integer2);
        }
                       
    }
    
    
    
}

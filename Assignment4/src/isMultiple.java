//Assignment4 -- this file serves as Davis Dean's submission for Assignment 4
//CSIS 212-D02
//Citations:
//Oracle, Summary of Operators, https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
//Dot Net Pearls, Java Return Examples: Expressions and Void, https://www.dotnetperls.com/return-java
//Programmer Friend, Random Number Generation with Java, https://programmerfriend.com/java-random-numbers/
//Home and Learn, Boolean Data Values in Java, https://www.homeandlearn.co.uk/java/boolean_values.html
//Tutorials Point, Java – Methods, https://www.tutorialspoint.com/java/java_methods.htm
//Stack Overflow, Write a method isMultiple that determines…, https://stackoverflow.com/questions/26151700/write-a-method-ismultiple-that-determines
//Stack Overflow, java boolean method…, https://stackoverflow.com/questions/14474267/java-boolean-method
//Stack Overflow, How do I check if a method returns true or false in an IF statement in Java?, https://stackoverflow.com/questions/13578520/how-do-i-check-if-a-method-returns-true-or-false-in-an-if-statement-in-java
//Stack Overflow, Random number in a loop…, https://stackoverflow.com/questions/3053807/random-number-in-a-loop

import java.util.Scanner;

public class isMultiple {
    public static void main(String[] args) {
        
        System.out.println("Davis Dean - Assignment 4\n");
        
        //scanner input method
        Scanner input = new Scanner(System.in);
        
        //collecting first integer
        System.out.print("Enter first Integer: ");
        int integer1 = input.nextInt();
        
        
        do {
           //collecting second integer
            System.out.print("Enter second Integer: ");
            int integer2 = input.nextInt();
        
            
        
            if(isMultiple(integer1, integer2)) {
        
            System.out.printf("%s%s%s%n", integer1, " is a multiple of ", integer2);
        
            }
        
            else{
            System.out.printf("%s%s%s%n", integer1, " is not a multiple of ", integer2);
            } 
        } while (integer1 != 0); 
        
    }

    public static boolean isMultiple(int integer1, int integer2){
        
        
        if(integer1 % integer2 == 0)
            return true;
        else
            return false;
        
    }

}

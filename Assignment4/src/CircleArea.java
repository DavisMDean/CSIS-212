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

public class CircleArea {
    
    public static void main(String[] args){
        
        System.out.println("Davis Dean - Assignment 4\n");  
        
        //scanner
        Scanner input = new Scanner(System.in);        
        //collecting radius
        System.out.print("Enter radius: ");
        int radius = input.nextInt();
        //calling CircleArea method to calculate and set value of area
        double area = CircleArea(radius);        
        //print result
        System.out.printf("Area = %s%n", area);
    }
    
    //method to calculate area of circle given user requested radius
    public static double CircleArea(int x){
        return 3.14159 * x * x;
    }  
}

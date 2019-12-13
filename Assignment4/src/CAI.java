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
import java.util.Random;

public class CAI {
    
    public static void main(String[] args){    
        
        System.out.println("Davis Dean - Assignment 4\n");
        
        //used counter to continually loop code
        int counter = 1;
        do {
            //declarations including scanner and random number generator
            Scanner input = new Scanner(System.in);
            Random rand = new Random();            
            int integer1 = rand.nextInt(9) + 1;
            int integer2 = rand.nextInt(9) + 1;
            //first output using random 1-digit integers, asking for user input 
            System.out.printf("How much is %s%s%s%s", integer1, " times ", integer2, "?: ");
            //user input stored as answer
            int answer = input.nextInt();  
            //calling checkAnswer method to verify answer
            //If true prints "very good" and loops above statement issuing new question
            if(checkAnswer(integer1, integer2, answer) == true){
                System.out.print("Very Good! \nTry another one.\n\n");
            }
            //otherwise prints "no please try again" followed by repeating same question 
            else{
                System.out.print("No. Please Try again.\n\n");                
                int subcounter = 1;
                do{                
                    System.out.printf("How much is %s%s%s%s", integer1, " times ", integer2, "?: ");
                    int newanswer = input.nextInt();
                    if(checkAnswer(integer1, integer2, newanswer) == true){
                        System.out.print("Very Good! \nTry another one.\n\n");  
                        break;
                    }
                    else{
                        System.out.print("No. Please Try again.\n\n");                    
                    }            
                } while (subcounter !=0);
            }
        } while (counter != 0);
    }    
    //boolean method to check if random numbers multiplied eaqual user entered answer
    public static boolean checkAnswer(int x, int y, int z){
                
        return x * y == z;  
    }
    
}

//Assignment5 -- this file serves as Davis Dean's submission for Assignment 5
//CSIS 212-D02
//Citations:
//GeeksforGeeks, Variable Arguments (Varargs) in Java, https://www.geeksforgeeks.org/variable-arguments-varargs-in-java/
//JavaTutoring, One Dimensional Array In Java – Tutorial & Example, https://javatutoring.com/java-one-dimensional-array/
//YouTube, Java Programming Tutorial - 35 - Variable Length Arguments, https://www.youtube.com/watch?v=BFL1oWnEO2k

import java.util.Random;

public class DiceRolling {    
    public static void main(String[] args){            
        System.out.println("Davis Dean - Assignment 5\n");
        Random rand = new Random(); 
        // creating frequency array
        int[] frequency = new int[13];
        // for loop 36,000 rolls
        for (int roll = 1; roll <= 36_000; roll++) { 
            // declaring firstroll & second roll using random number generator
            int firstroll = rand.nextInt(6) + 1;
            int secondroll = rand.nextInt(6) + 1;
            // filling frequency array with method roll
            ++frequency[roll(firstroll, secondroll)]; 
        }        
        // prints column headings
        System.out.printf("%s%12s%n", "Sum of Roll", "Frequency");
        // for loop prints sum column and frequencyy of each sum
        for (int sum = 2; sum < frequency.length; sum++) {
            System.out.printf("%6d%15d%n", sum, frequency[sum]); 
        }        
    }    
    // method "roll" returns sum of passed integers
    public static int roll(int x, int y){
        
        return x + y ;
        
    }
     
    
    
    
}

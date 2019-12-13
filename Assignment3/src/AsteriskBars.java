//Assignment3 -- this file serves as Davis Dean's submission for Assignment 3
//CSIS 212-D02
//Citations:
//stackoverflow, Multiplying odd numbers of 1-15, https://stackoverflow.com/questions/26445706/multiplying-odd-numbers-of-1-15
//stackoverflow, Generating a Random Number between 1 and 10 Java [duplicate], https://stackoverflow.com/questions/20389890/generating-a-random-number-between-1-and-10-java

import java.util.Random;

public class AsteriskBars {
    public static void main(String[] args){
        
        System.out.println("Davis Dean - Assignment 3\n");
        
        //using maincounter to loop random number 5 times
        int maincounter = 1;
        do {
            //Using random number generator to choose a number between 1 and 30
            Random rand = new Random();
            int randomNumber = rand.nextInt(30) + 1;
        
            //Displaying random number between 1 and 30
            System.out.printf("The random number is %s%n", randomNumber);
        
            //using do while & counter to read the random number 
            //then displaying that many asterisks 
            int subcounter = 1;
        
            do {            
                System.out.printf("%s","*");
                ++subcounter;            
            } while (subcounter <= randomNumber);
            
        
            System.out.println();
            System.out.println();
            
            ++maincounter;
            
        } while (maincounter <= 5);
    }   
}

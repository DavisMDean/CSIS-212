//Assignment3 -- this file serves as Davis Dean's submission for Assignment 3
//CSIS 212-D02
//Citations:
//stackoverflow, Multiplying odd numbers of 1-15, https://stackoverflow.com/questions/26445706/multiplying-odd-numbers-of-1-15
//stackoverflow, Generating a Random Number between 1 and 10 Java [duplicate], https://stackoverflow.com/questions/20389890/generating-a-random-number-between-1-and-10-java


public class OddProduct {
    public static void main(String[] args) {
        
        System.out.println("Davis Dean - Assignment 3\n");
        
        int product = 1; 
        
        //multiply odd integers from 1 to 15
        for (int odd = 1; odd <= 15; odd += 2) {
            
            product *= odd;
        
        }
        
        System.out.printf("The product of the odd integers from 1 to 15 is: %n%d%n", product);     
    
    }   
}

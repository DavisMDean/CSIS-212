//Assignment5 -- this file serves as Davis Dean's submission for Assignment 5
//CSIS 212-D02
//Citations:
//GeeksforGeeks, Variable Arguments (Varargs) in Java, https://www.geeksforgeeks.org/variable-arguments-varargs-in-java/
//JavaTutoring, One Dimensional Array In Java – Tutorial & Example, https://javatutoring.com/java-one-dimensional-array/
//YouTube, Java Programming Tutorial - 35 - Variable Length Arguments, https://www.youtube.com/watch?v=BFL1oWnEO2k

public class ArgumentList {
    public static void main(String[] args) {         
        System.out.println("Davis Dean - Assignment 5\n");
        // inserting values to d1-d4 in array d   
        double d1 = 10;
        double d2 = 20;
        double d3 = 30;
        double d4 = 40;
        // printing columns and values of d1-d4
        System.out.printf("d1 = %.1f%nd2 = %.1f%nd3 = %.1f%nd4 = %.1f%n%n",
            d1, d2, d3, d4);
        // printing product values from method "product"
        System.out.printf("Product of d1 and d2 is %.1f%n",
            product(d1, d2));
        System.out.printf("Product of d1, d2 and d3 is %.1f%n",
            product(d1, d2, d3));
        System.out.printf("Product of d1, d2, d3 and d4 is %.1f%n",
            product(d1, d2, d3, d4));
    }
    // method "product" using variable length argument ...
    public static double product(double... numbers) {
        double total = 1; 
        // calculate total using the enhanced for statement
        for (double x : numbers) {
            total *= x;
        }
        return total;
      }    
}

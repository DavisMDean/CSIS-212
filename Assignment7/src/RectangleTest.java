//Assignment7 -- this file serves as Davis Dean's submission for Assignment 7
//CSIS 212-D02
//Citations:
//HomeAndLearn, IF ... ELSE, https://www.homeandlearn.co.uk/java/java_if_else_statements.html
//StackOverflow, Catching IllegalArgumentException?, https://stackoverflow.com/questions/26960941/catching-illegalargumentexception
//YouTube, Illegal Argument Exception, https://www.youtube.com/watch?v=33MDvC-PuSI
//StackOverflow, && (AND) and || (OR) in IF statements, https://stackoverflow.com/questions/1795808/and-and-or-in-if-statements

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args){            
        System.out.println("Davis Dean - Assignment 7\n");
        Scanner input = new Scanner(System.in);
        // input choice for menu prompt
        System.out.print("1. Set Length\n2. Set Width\n3. Exit\nChoice: ");
        int choice = input.nextInt();
        // arguments nested in try catch
        try{    
            if(choice == 1){
                System.out.print("set length to: ");
                int length = input.nextInt();
                if (length < 0.0 || length > 20.0){
                    throw new IllegalArgumentException();
                } // checks for boundaries of length
                // using new length pass to method perimeter & area for calculation
                Rectangle rectangle = new Rectangle(length,1);
                System.out.printf("%nThe perimeter is :%s%n", rectangle.perimeter());
                System.out.printf("The area is :%s%n", rectangle.area());
            }
            else if(choice == 2){
                System.out.print("set width to: ");
                int width = input.nextInt();
                if (width < 0.0 || width > 20.0){
                    throw new IllegalArgumentException();
                } // checks for boundaries of width
                // using new width pass to method perimeter & area for calculation
                Rectangle rectangle = new Rectangle(1,width);            
                System.out.printf("%nThe perimeter is :%s%n", rectangle.perimeter());
                System.out.printf("The area is :%s%n", rectangle.area());
            }
            else{            
                //on third choice prints perimeter and area from methods with default values
                Rectangle rectangle = new Rectangle(1,1);            
                System.out.printf("%nThe perimeter is :%s%n", rectangle.perimeter());
                System.out.printf("The area is :%s%n", rectangle.area());
            }
        }
        catch(IllegalArgumentException i){
            System.out.print("\nInput cannot be greater than 20 or less than 0\nPlease Try Again\n");       
        }
    } 
}

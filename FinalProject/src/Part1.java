//FinalProject -- this file serves as Davis Dean's submission for the Final Project
//CSIS 212-D02
//Citations:
// stackoverflow, How to put a Scanner input into an array… for example a couple of numbers, https://stackoverflow.com/questions/2795350/how-to-put-a-scanner-input-into-an-array-for-example-a-couple-of-numbers
// GeeksforGeeks, Parallel Array, https://www.geeksforgeeks.org/parallel-array/
// Java2s, Create a Message Dialog Box : JOptionPane Dialog, http://www.java2s.com/Tutorial/Java/0240__Swing/CreateaMessageDialogBox.htm
// Java2s, Instant Input Dialogs : JOptionPane Dialog, http://www.java2s.com/Tutorial/Java/0240__Swing/InstantInputDialogs.htm
// stackoverflow, How to find the index of an element in an int array?, https://stackoverflow.com/questions/6171663/how-to-find-the-index-of-an-element-in-an-int-array/6171675
// guava, Class Ints, https://guava.dev/releases/23.0/api/docs/com/google/common/primitives/Ints.html
// Techie Delight, Find the index of an element in an array in Java, https://www.techiedelight.com/find-index-element-array-java/
// stackoverflow, How to find index of STRING array in Java from a given value?, https://stackoverflow.com/questions/23160832/how-to-find-index-of-string-array-in-java-from-a-given-value
// w3resource, Java Array Exercises: Find the index of an array element, https://www.w3resource.com/java-exercises/array/java-array-exercise-6.php

import javax.swing.JOptionPane;

public class Part1 
{    
    public static void main(String[] args) 
    {
        System.out.println("Davis Dean - Final Project\n");        
        // create ten-element arrays
        String[] studentID = { "0123", "1234", "2345", "3456", "4567", "5678", 
            "6789", "7890", "8900", "9000" }; 
        String[] firstName = { "Davis", "Joe", "Mary", "Taylor", "Jennifer", 
            "Tom", "Gary", "Joseph", "Larry", "Bob" };
        double[] GPA = { 4.0, 3.9, 3.8, 3.7, 3.6, 3.5, 2.5, 2.2, 3.0, 1.5};        
        //loop to ensure valid student ID and request again if not valid 
        int loop = 1;        
        do 
        {
            String input = JOptionPane.showInputDialog("Enter Student ID:");
            try
            {
                int index = -1;
                //for loop to verify array position of user-requested studentID
                for (int i = 0; i < studentID.length; i++)
                {
                    if (studentID[i].equals(input))
                    {
                        index = i;
                        break;
                    }
                }
                //print ID, Name, and GPA using array position from input
                System.out.printf("Student ID: %s%n", studentID[index]);
                System.out.printf("Name: %s%n", firstName[index]);
                System.out.printf("GPA: %s%n", GPA[index]);
                break;
            }
            catch(ArrayIndexOutOfBoundsException i)
            {
                System.out.printf("%s is not a Valid Student ID %n"
                        + "Please Try Again %n%n", input);
                loop = 1;
            }
        } while (loop == 1);        
    }    
}

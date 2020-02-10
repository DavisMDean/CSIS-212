//FinalProject -- this file serves as Davis Dean's submission for the Final Project
//CSIS 212-D02
//Citations:
// GeeksforGeeks, enum in Java, https://www.geeksforgeeks.org/enum-in-java/
// w3schools.com, Java Enums, https://www.w3schools.com/java/java_enums.asp
// ORACLE, Enum Types, https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
// GeeksforGeeks, Java toUpperCase() with examples, https://www.geeksforgeeks.org/java-touppercase-examples/
// stackoverflow, Multiple choices from a JOptionPane, https://stackoverflow.com/questions/8899605/multiple-choices-from-a-joptionpane
// Mkyong.com, Java Swing – JOptionPane showOptionDialog example, https://www.mkyong.com/swing/java-swing-joptionpane-showoptiondialog-example/
// Java2s, To displays a dialog with a list of choices in a drop-down list box : JOptionPane Dialog, http://www.java2s.com/Tutorial/Java/0240__Swing/Todisplaysadialogwithalistofchoicesinadropdownlistbox.htm

import javax.swing.*;

public class Part2_selectDay
{
    Week week;    
    //constructor
    public Part2_selectDay(Week week)
    {
        this.week = week;
    }
    //daySelection Method
    public void daySelection()
    {
        // store hours array declaration
        String[] storeHours = { "Closed", "9:00am - 12:00pm", 
        "9:00am - 8:00pm", "10:00am - 12:00pm", "10:00am - 8:00pm", 
        "9:00am - 6:00pm", "12:00pm - 3:00pm" }; 
        //enum switch prints hours based on user input    
        switch (week)
        {
            case SUNDAY:
                System.out.printf("On Sundays the Store Hours are: %s%n", 
                        storeHours[0]);
                break;
            case MONDAY:
                System.out.printf("On Mondays the Store Hours are: %s%n", 
                        storeHours[1]);
                break;
            case TUESDAY:
                System.out.printf("On Tuesdays the Store Hours are: %s%n", 
                        storeHours[2]);
                break;
            case WEDNESDAY:
                System.out.printf("On Wednesdays the Store Hours are: %s%n", 
                        storeHours[3]);
                break;
            case THURSDAY:
                System.out.printf("On Thursdays the Store Hours are: %s%n", 
                        storeHours[4]);
                break;
            case FRIDAY:
                System.out.printf("On Fridays the Store Hours are: %s%n", 
                        storeHours[5]);
                break;
            case SATURDAY:
                System.out.printf("On Saturdays the Store Hours are: %s%n", 
                        storeHours[6]);
                break;
        }
    }    
    public static void main(String[] args)
    {
        System.out.println("Davis Dean - Final Project\n");
        // declare dayselection array and fill
        String[] daySelection = { "Saturday", "Friday", "Thursday", 
            "Wednesday","Tuesday", "Monday", "Sunday" };
        // JOption for user input day selection
        int x = JOptionPane.showOptionDialog(null, 
                "For Store Hours Please Enter Desired Day:", "Store Hours", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, 
                null, daySelection, daySelection[0]); 
        //convert selection to string from array
        String userInput = daySelection[x];
        //capitalize
        String casedUp = userInput.toUpperCase();
        //send input to enum argument
        Part2_selectDay p1 = new Part2_selectDay(Week.valueOf(casedUp));
        p1.daySelection();
    }
}
//enum class
enum Week_alt
{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
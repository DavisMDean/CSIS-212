//Assignment7 -- this file serves as Davis Dean's submission for Assignment 7
//CSIS 212-D02
//Citations:
//HomeAndLearn, IF ... ELSE, https://www.homeandlearn.co.uk/java/java_if_else_statements.html
//StackOverflow, Catching IllegalArgumentException?, https://stackoverflow.com/questions/26960941/catching-illegalargumentexception
//YouTube, Illegal Argument Exception, https://www.youtube.com/watch?v=33MDvC-PuSI
//StackOverflow, && (AND) and || (OR) in IF statements, https://stackoverflow.com/questions/1795808/and-and-or-in-if-statements

public class Rectangle {
    // variables
    private double length = 1;
    private double width = 1;
    // constructor to initialize length and width
    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;       
    } 
    //length
    // method to set length      
    public void setLength(double length) {
          
        if (length > 0.0 || length < 20.0){
            this.length = length; // store the length  
        }
        else{
            throw new IllegalArgumentException();
        }
    }                                                
    // method to retrieve the length  
    public double getLength() {
        return length; // return value of length to caller
    }
    // width
    // method to set the width      
    public void setWidth(double width) {              
        if (width > 0.0 || width < 20.0){
            this.width = width; // store the width 
        }
        else{
            throw new IllegalArgumentException();
        }           
    }                                                
    // method to retrieve the width  
    public double getWidth() {
        return width; // return value of width to caller
    }        
    // method "perimeter" returns perimeter of the rectangle
    public double perimeter(){        
        return 2 * (getLength() + getWidth());       
    }
    // method "area" returns area of the rectangle
    public double area(){
        return getLength() * getWidth();
    }    
}

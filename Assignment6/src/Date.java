//Assignment6 -- this file serves as Davis Dean's submission for Assignment 6
//CSIS 212-D02

public class Date {
    // variables
    private int month;
    private int day;        
    private int year;    
    // constructor to initialize month, day, & year
    public Date (int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;        
    }    
    // month
    // method to set the month      
    public void setMonth(int month) {
        this.month = month; // store the month       
    }                                                
    // method to retrieve the month  
    public int getMonth() {
        return month; // return value of month to caller
    }
    //day
    // method to set the day      
    public void setDay(int day) {
        this.day = day; // store the day       
    }                                                
    // method to retrieve the day  
    public int getDay() {
        return day; // return value of day to caller
    }
    // year
    // method to set the year      
    public void setYear(int year) {
        this.year = year; // store the year       
    }                                                
    // method to retrieve the year  
    public int getYear() {
        return year; // return value of year to caller
    }
    // method to display full date named displayDate
    public void displayDate () {
        System.out.printf("%s/%s/%s%n", getMonth(), getDay(), getYear());
    }
}

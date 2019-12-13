//Assignment8 -- this file serves as Davis Dean's submission for Assignment 8
//CSIS 212-D02

public class Date { 
    private int month; // 1-12 
    private int day; // 1-31 based on month 
    private int year; // any year 
    
    private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; 

    // constructor: confirm proper value for month and day given the year 
    public Date(int month, int day, int year) { 
        // check if month in range 
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("month (" + month + ") must be 1-12"); 
        } 
        // check if day in range for month 
        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year"); 
        } 
        // check for leap year if month is 2 and day is 29 
        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year"); 
        } 
        
        this.month = month; 
        this.day = day; 
        this.year = year; 
        
        System.out.printf("Date object constructor for date %s%n", this); 
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
    
    // return a String of the form month/day/year 
    public String toString() { 
        return String.format("%d/%d/%d", month, day, year); 
    } 
}

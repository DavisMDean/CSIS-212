//Assignment8 -- this file serves as Davis Dean's submission for Assignment 8
//CSIS 212-D02

public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final Date birthday;

    // constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber, int month, int day, int year) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.socialSecurityNumber = socialSecurityNumber;
       this.birthday = new Date(month, day, year);
    }

    // return first name
    public String getFirstName() {
        return firstName;
    }

    // return last name
    public String getLastName() {
        return lastName;
    }

    // return social security number
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // return birthday
    public Date getBirthday() {
        return birthday;
    }

    // return birth month
    public int getBirthMonth() {
        return birthday.getMonth();
    }


    // return String representation of Employee object
    @Override
    public String toString() {
       return String.format("%s %s%nsocial security number: %s%nbirthday: %s",
          getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthday());
    }

    // abstract method must be overridden by concrete subclasses
    public abstract double earnings(); // no implementation here

}

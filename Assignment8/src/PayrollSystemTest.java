//Assignment8 -- this file serves as Davis Dean's submission for Assignment 8
//CSIS 212-D02

public class PayrollSystemTest {
    public static void main(String[] args) {
    System.out.println("Davis Dean - Assignment 8\n");
    // create subclass objects                                          
    SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 9, 14, 95, 800.00);    
    HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 4, 18, 97, 16.75, 40);  
    CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 12, 28, 85, 10000, .06);                      
    BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 3, 4, 91, 5000, .04, 300);                  
    Date date = new Date(12,9,2019);
    
    System.out.println("Employees processed individually:");
    System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
    System.out.printf("%s%n%s: $%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());
    System.out.printf("%s%n%s: $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());
    System.out.printf("%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());

    // create four-element Employee array
    Employee[] employees = new Employee[4];  

    // initialize array with Employees          
    employees[0] = salariedEmployee;            
    employees[1] = hourlyEmployee;              
    employees[2] = commissionEmployee;          
    employees[3] = basePlusCommissionEmployee;  

    System.out.printf("Employees processed polymorphically:%n%n");

    // generically process each element in array employees
    for (Employee currentEmployee : employees) {
        System.out.println(currentEmployee); // invokes toString

        // determine whether element is a BasePlusCommissionEmployee
        if (currentEmployee instanceof BasePlusCommissionEmployee) {
            // downcast Employee reference to
            // BasePlusCommissionEmployee reference
            BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
            employee.setBaseSalary(1.10 * employee.getBaseSalary());

            System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
        }

        // determine whether it is the persons birthday and add $100
        if (currentEmployee.getBirthMonth() == date.getMonth()) {
            // downcast Employee reference to
            // BasePlusCommissionEmployee reference
            System.out.printf("Happy Birthday!  You get a $%d bonus!%n", 100);
            System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings() + 100);            
        }
        
        else {
            System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
        }
        
    }

    // get type name of each object in employees array
    for (int j = 0; j < employees.length; j++) {      
       System.out.printf("Employee %d is a %s%n", j,  
          employees[j].getClass().getName());         
    }                                                 
  }
}


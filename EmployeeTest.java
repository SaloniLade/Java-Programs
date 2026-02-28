class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {

        this.firstName = firstName;
        this.lastName = lastName;

        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
        else
            this.monthlySalary = 0.0;
    }

    // Getter Methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Setter Methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
        else
            this.monthlySalary = 0.0;
    }
}

public class EmployeeTest {

    public static void main(String[] args) {

        // Create two Employee objects
        Employee emp1 = new Employee("Saloni", "Lade", 20000);
        Employee emp2 = new Employee("Riya", "Sharma", 25000);

        // Display yearly salary
        System.out.println("Yearly Salary of Employee 1: " +
                (emp1.getMonthlySalary() * 12));

        System.out.println("Yearly Salary of Employee 2: " +
                (emp2.getMonthlySalary() * 12));

        // Give 10% raise
        emp1.setMonthlySalary(emp1.getMonthlySalary() * 1.10);
        emp2.setMonthlySalary(emp2.getMonthlySalary() * 1.10);

        System.out.println("\nAfter 10% Raise:");

        System.out.println("Yearly Salary of Employee 1: " +
                (emp1.getMonthlySalary() * 12));

        System.out.println("Yearly Salary of Employee 2: " +
                (emp2.getMonthlySalary() * 12));
    }
}
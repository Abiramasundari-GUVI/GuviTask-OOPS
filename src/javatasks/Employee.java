package javatasks;

import java.util.Scanner;

public class Employee {
    // Attributes
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getters
    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Get annual salary
    public int getAnnualSalary() {
        return salary * 12;
    }

    // Raise salary
    public int raiseSalary(int percent) {
        salary += (salary * percent) / 100;
        return salary;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]";
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input employee details
        System.out.println("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter Salary: ");
        int salary = scanner.nextInt();

        // Create Employee object
        Employee employee = new Employee(id, firstName, lastName, salary);

        // Display employee details
        System.out.println("\nEmployee Details:");
        System.out.println(employee);

        // Raise salary
        System.out.println("\nEnter percentage to raise salary: ");
        int percent = scanner.nextInt();
        int newSalary = employee.raiseSalary(percent);

        // Display updated salary
        System.out.println("New Salary after " + percent + "% raise: " + newSalary);
        System.out.println("Updated Employee Details:");
        System.out.println(employee);

        scanner.close();
    }
}

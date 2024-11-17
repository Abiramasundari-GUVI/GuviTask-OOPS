package javatasks;
import java.util.Scanner;
public class PersonJava {
    // Attributes
    private String name;
    private int age;

    // Constructor
    public PersonJava(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Getter for name
    public String getName() {
        return name;
    }
    // Getter for age
    public int getAge() {
        return age;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input name and age
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        // Create Person object
        PersonJava person = new PersonJava(name, age);

        // Display details using getters
        System.out.println("\nPerson Details:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        scanner.close();
    }
}

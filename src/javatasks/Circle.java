package javatasks;
public class Circle {
    // Data member for the radius
    private double radius;

    // No-argument constructor
    public Circle() {
        this.radius = 1.0; // Default radius
    }

    // Constructor with one argument
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Main method to test the class
    public static void main(String[] args) {
        Circle circle1 = new Circle(); // Using no-argument constructor
        Circle circle2 = new Circle(5.0); // Using one-argument constructor

        System.out.println("Circumference of circle1: " + circle1.calculateCircumference());
        System.out.println("Circumference of circle2: " + circle2.calculateCircumference());
    }
}

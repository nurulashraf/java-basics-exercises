import java.util.Scanner;

public class UserInputCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double x = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double y = scanner.nextDouble();
        
        // Addition
        System.out.println("Addition: " + (x + y));
        
        // Subtraction
        System.out.println("Subtraction: " + (x - y));
        
        // Multiplication
        System.out.println("Multiplication: " + (x * y));
        
        // Division
        System.out.println("Division: " + (x / y));
        
        scanner.close();
    }
}
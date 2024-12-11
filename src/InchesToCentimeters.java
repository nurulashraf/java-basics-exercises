import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter length in inches: ");
        double inches = scanner.nextDouble();
        
        // Convert to centimeters
        double centimeters = inches * 2.54;
        
        System.out.println(inches + " inches = " + centimeters + " cm");
        
        scanner.close();
    }
}
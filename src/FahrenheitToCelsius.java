import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        
        // Convert to Celsius
        double celsius = (fahrenheit - 32) * 5/9;
        
        System.out.println(fahrenheit + "°F = " + celsius + "°C");
        
        scanner.close();
    }
}
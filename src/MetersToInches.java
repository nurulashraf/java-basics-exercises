import java.util.Scanner;

public class MetersToInches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter length in meters: ");
        double meters = scanner.nextDouble();
        
        // Convert to inches
        double inches = meters * 39.3701;
        
        System.out.println(meters + " meters = " + inches + " inches");
        
        scanner.close();
    }
}
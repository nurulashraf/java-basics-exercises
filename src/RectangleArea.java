import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        
        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();
        
        // Calculate area
        double area = length * width;
        
        System.out.println("Rectangle Area: " + area);
        
        scanner.close();
    }
}
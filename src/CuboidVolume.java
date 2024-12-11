import java.util.Scanner;

public class CuboidVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter length of cuboid: ");
        double length = scanner.nextDouble();
        
        System.out.print("Enter width of cuboid: ");
        double width = scanner.nextDouble();
        
        System.out.print("Enter height of cuboid: ");
        double height = scanner.nextDouble();
        
        // Calculate volume
        double volume = length * width * height;
        
        System.out.println("Cuboid Volume: " + volume);
        
        scanner.close();
    }
}
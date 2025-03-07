import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = null;
        Volume volumeShape = null;

        while (true) {
            System.out.println("\n=== Shape Menu ===");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid");
            System.out.println("7. Exit");
            System.out.print("Choose a shape: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    shape = new Circle(scanner.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter length and width: ");
                    shape = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter side length: ");
                    shape = new Square(scanner.nextDouble());
                    break;
                case 4:
                    System.out.print("Enter radius: ");
                    volumeShape = new Sphere(scanner.nextDouble());
                    break;
                case 5:
                    System.out.print("Enter radius and height: ");
                    volumeShape = new Cylinder(scanner.nextDouble(), scanner.nextDouble());
                    break;
                case 6:
                    System.out.print("Enter base side and height: ");
                    volumeShape = new EquilateralPyramid(scanner.nextDouble(), scanner.nextDouble());
                    break;
                case 7:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
                    continue;
            }

            if (shape != null) {
                System.out.println("Area: " + shape.calculateArea());
                System.out.println("Perimeter: " + shape.calculatePerimeter());
            }

            if (volumeShape != null) {
                System.out.println("Surface Area: " + ((Shape) volumeShape).calculateArea()); // Fix
                System.out.println("Volume: " + volumeShape.calculateVolume());
            }
        }
    }
}

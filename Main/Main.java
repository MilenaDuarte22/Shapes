import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Polymorphism
        Shapes myShapes;

        while (true) {
            try {
                System.out.println("Which geometry form do you choose?");
                System.out.println("1-circle  2-triangle  3-square  4-trapezium");
                int choice = scanner.nextInt();

                switch (choice) 
                {
                    case 1:
                        System.out.println("Please inform a Radius");
                        float radius = scanner.nextFloat();
                        myShapes = new Circle(radius);
                        myShapes.carac();
                        System.out.printf("Area: %.2f cm\n", myShapes.areaCalc());
                        break;

                    case 2:
                        System.out.println("Insert a height: ");
                        float height = scanner.nextFloat();

                        System.out.println("Insert a base: ");
                        float base = scanner.nextFloat();

                        myShapes = new Triangle(base, height);
                        myShapes.carac();
                        System.out.printf("Area: %.2f cm\n", myShapes.areaCalc());
                        break;

                    case 3:
                        System.out.println("Insert the side length: ");
                        float side = scanner.nextFloat();

                        myShapes = new Square(side);
                        myShapes.carac();
                        System.out.printf("Area: %.2f cm\n", myShapes.areaCalc());
                        break;

                    case 4:
                        System.out.println("Insert the smaller base: ");
                        float baseS = scanner.nextFloat();

                        System.out.println("Insert the bigger base: ");
                        float baseB = scanner.nextFloat();

                        System.out.println("Insert the height: ");
                        float heightTrap = scanner.nextFloat();

                        myShapes = new Trapezium(baseS, baseB, heightTrap);
                        myShapes.carac();
                        System.out.printf("Area: %.2f cm\n", myShapes.areaCalc());
                        break;

                    default:
                        System.out.println("Invalid choice. Please choose: \"1-circle  2-triangle  3-square  4-trapezium");
                        continue;
                }
                break; 
            } catch (InputMismatchException e) {
                System.out.println("Invalid choice. Please choose: \"1-circle  2-triangle  3-square  4-trapezium");
                scanner.next(); 
            }
        }

        scanner.close();
    }
}
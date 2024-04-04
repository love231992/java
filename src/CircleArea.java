import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {
        while (true) {
        try {
        System.out.print("Enter the radius of the circle : ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        if (radius < 0) {
            System.out.println("Enter positive value only");
            continue;
        }
        double area = Math.PI * Math.pow(radius,2);
        System.out.println(Math.round(area * 100.0) / 100.0);
        break;
    } catch (InputMismatchException e) {
            System.out.println("Enter numeric value only");
        }
    }
} }

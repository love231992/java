import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareArea {
        public static void main(String[] args) {
            while (true) {
                try {
                    System.out.print("Enter the side of the square : ");
                    Scanner scanner = new Scanner(System.in);
                    double side = scanner.nextDouble();
                    if (side < 0) {
                        System.out.println("Enter positive value only");
                        continue;
                    }
                    double area = Math.pow(side,2);
                    System.out.println(Math.round(area * 100.0) / 100.0);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Enter numeric value only");
                }
            }
        }
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.print("Enter the age : ");
                Scanner scanner = new Scanner(System.in);
                int age = scanner.nextInt();
                if (age < 0) {
                    System.out.println("Enter positive value only");
                    continue;
                } else if(age > 18) {
                    System.out.println("Congratulations, you are eligible to vote.");
                }else {
                    System.out.println("Unfortunately, you are not eligible to vote.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Enter numeric value only");
            }
        }
    }
}

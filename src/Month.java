import java.util.InputMismatchException;
import java.util.Scanner;

public class Month {
    public static void month(int month) {
        switch (month) {
            case 1 -> System.out.println("First month is January");
            case 2 -> System.out.println("Second month is February");
            case 3 -> System.out.println("Third month is March");
            case 4 -> System.out.println("Fourth month is April");
            case 5 -> System.out.println("Fifth month is May");
            case 6 -> System.out.println("Sixth month is June");
            case 7 -> System.out.println("Seventh month is July");
            case 8 -> System.out.println("Eight month is August");
            case 9 -> System.out.println("Ninth month is September");
            case 10 -> System.out.println("Tenth month is October");
            case 11 -> System.out.println("Eleventh month is November");
            case 12 -> System.out.println("Twelve month is December");
            default -> {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Please choose from 1 to 12 only : ");
                int month1 = scanner.nextInt();
                month(month1);
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Please choose any month from 1 to 12 : ");
                int day = scanner.nextInt();
                Month.month(day);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Enter numeric value only");
            }
        }
    }
}

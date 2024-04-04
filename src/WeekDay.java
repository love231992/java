import java.util.InputMismatchException;
import java.util.Scanner;

public class WeekDay {
    public static void weekday(int day) {
        switch (day) {
            case 1 -> System.out.println("Monday is a weekday");
            case 2 -> System.out.println("Tuesday is a weekday");
            case 3 -> System.out.println("Wednesday is a weekday");
            case 4 -> System.out.println("Thursday is a weekday");
            case 5 -> System.out.println("Friday is a weekday");
            case 6 -> System.out.println("Saturday is a weekend");
            case 7 -> System.out.println("Sunday is a weekend");
            default -> {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Please choose from 1 to 7 only : ");
                int day1 = scanner.nextInt();
                weekday(day1);
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("1.Monday");
                System.out.println("2.Tuesday");
                System.out.println("3.Wednesday");
                System.out.println("4.Thursday");
                System.out.println("5.Friday");
                System.out.println("6.Saturday");
                System.out.println("7.Sunday");
                System.out.print("Please choose any day from the menu : ");
                int day = scanner.nextInt();
                WeekDay.weekday(day);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Enter numeric value only");
            }
        }
    }
}

import java.util.Scanner;
public class Assignment {
    // Program to print 1 to 100
    public static void PrintNum(){
        int i;
        for (i =1; i<=100; i++) {
            System.out.println(i);
    }
    }
    // program to find the sum of first 10 natural numbers
    public static void SumNatural(){
        int i, sum = 0;
        for (i =1; i<=10; i++){
            sum +=i ;
        }
        System.out.println(sum);
    }

    // program to find the sum of first n natural numbers
    public static void NaturalSum(){
        int i, sum = 0;
        System.out.print("Enter any num to find sum upto : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (i =1; i<= num; i++){
            sum +=i ;
        }
        System.out.println(sum);
    }

    // program to find the factorial of a given number using a while loop.
    public static void Factorial(){
        int i, sum =1 ;
        System.out.print("Enter any num to find factorial : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (i =1; i<= num; i++){
            sum *=i ;
        }
        System.out.println(sum);
    }
    // program that uses a do-while loop to continuously prompt the user for input until they enter 'q' to quit.
    public static void UserInput(){
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print("Enter a value (or 'q' to quit): ");
            input = scanner.nextLine();
           } while (!input.equalsIgnoreCase("q"));
        System.out.println("Exiting program.");
    }
    // table of a give number in specific format e.g. 5 * 1 = 5
    public static void Table(){
        int i;
        System.out.print("Enter any num to print its table : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (i =1; i<= 10; i++){
            System.out.println(num +" * "+ i + " = " + num * i );
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
        System.out.println("1.Print num for 1 to 100");
        System.out.println("2.Sum of first 10 natural numbers");
        System.out.println("3.Sum of first n natural numbers");
        System.out.println("4.Factorial of a number");
        System.out.println("5.do-while loop exercise");
        System.out.println("6.Table of a number");
        System.out.print("Select any num from 1 to 6 to run specific program : ");
        int selection = scanner.nextInt();
        switch (selection) {
            case 1 -> PrintNum();
            case 2 -> SumNatural();
            case 3 -> NaturalSum();
            case 4 -> Factorial();
            case 5 -> UserInput();
            case 6 -> Table();
            default -> System.out.println("Invalid selection");
        }
            System.out.print("Do you want to continue with another program ? (Enter 'y' to continue, or any other key to quit): ");
        } while ( scanner.next().equalsIgnoreCase("y"));
        System.out.println("Exiting ...");
        scanner.close();
    }
}
package ExceptionHandling;

import java.util.Scanner;

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class Age {
    Scanner scanner = new Scanner(System.in);
    public void checkAge() {
        System.out.print("Please enter your age in numbers only : ");
        int age = scanner.nextInt();
        try {
            if (age > 16 && age < 100) {
                System.out.print("You are eligible to take driving test.....!!!");
            } else
                throw new AgeException("You are not eligible for the driving test...!!!");
        } catch (AgeException e) {
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
        Age age = new Age();
        age.checkAge();
    }
}

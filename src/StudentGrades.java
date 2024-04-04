// You are tasked with developing a Java program that checks a student's grade based on their score.
// A: 90-100 B: 80-89 C: 70-79 D: 60-69 E: 0-59 (Fail)

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double marks;
        while (true) {
            try {
                System.out.print("Please enter the marks obtained: ");
                marks = scanner.nextDouble();
                if (marks < 0 || marks > 100) {
                    System.out.println("Please enter a number between 0 and 100.");
                    continue;
                }
                if (marks >= 90) {
                    System.out.println("Excellent: Grade A");
                } else if (marks >= 80) {
                    System.out.println("Very Good: Grade B");
                } else if (marks >= 70) {
                    System.out.println("Good: Grade C");
                } else if (marks >= 60) {
                    System.out.println("Average: Grade D");
                } else {
                    System.out.println("Failed: Grade E");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid numeric percentage.");
                scanner.nextLine();
            }
        }
    }
}



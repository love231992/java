package ArrayAssignment;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String rev = "";
        for (int i = 0; i < word.length(); i++) {
            rev += word.charAt(word.length()-i-1);
        }
        if (word.equals(rev)){
            System.out.println(word+" is a palindrome");
        } else
        System.out.println(word+" is not a palindrome");
    }
}

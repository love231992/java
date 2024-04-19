package ArrayAssignment;

import java.util.Scanner;

public class LongestSubstring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int maxLength = 0;
        int[] arr = new int[256];

        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            start = Math.max(start, arr[currentChar]);
            maxLength = Math.max(maxLength, i - start + 1);
            arr[currentChar] = i + 1;
        }

        System.out.println(maxLength);

    }
}

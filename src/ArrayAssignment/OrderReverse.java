package ArrayAssignment;

import java.util.Scanner;

public class OrderReverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] arr = s.split(" ");
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            line.append(arr[arr.length-i-1]);
            line.append(" ");
        }
        System.out.println(line);
    }
}

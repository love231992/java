package ArrayAssignment;

import java.util.Scanner;

public class VowelsConstants {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int vsum = 0;
        int csum = 0;
        String vowels = "aeiou";
        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));
            if (ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ) {
                vsum++;
            } else if (Character.isLetter(ch)) {
                csum++;
            }
        }
        System.out.println("Number of vowels in "+ word +" are "+vsum);
        System.out.println("Number of constants in "+ word +" are "+csum);
    }
}

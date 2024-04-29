import java.util.Scanner;
// Create a program that takes a character as input and determines if it's a vowel or a consonant.
public class Vowels {
    public static void main(String[] args)
    {
        System.out.print("Please enter a character : ");
        Scanner scanner = new Scanner(System.in);
        char word = scanner.next().toLowerCase().charAt(0);
        while (Character.isDigit(word)){
            System.out.print("Please enter alpha character instead of numeric digits : ");
            word = scanner.next().toLowerCase().charAt(0);
        }
         if ( word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u'){
            System.out.println("The first character " + word + " is a vowel.");
        } else
        System.out.println("The first character " + word + " is a consonant.");
    }
}



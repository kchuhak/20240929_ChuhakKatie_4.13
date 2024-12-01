import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt the user to enter a letter
        System.out.print("Enter a letter: ");
        char letter = input.next().toLowerCase().charAt(0); 
        // convert input to lowercase 

        // check if the input is a valid alphabet letter
        if (letter >= 'a' && letter <= 'z') {
            // check if the letter is a vowel or consonant
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println(letter + " is a vowel");
            } else {
                System.out.println(letter + " is a consonant");
            }
        } else {
            System.out.println(letter + " is an invalid input");
        }
    }
}
import java.util.Scanner;

class Vowel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Priyal Singhal 24csu161");
        System.out.println("Enter letter: ");
        char input = scan.next().toLowerCase().charAt(0);
        
        if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') {
            System.out.println("Entered character is a vowel");
        } else {
            System.out.println("A consonant");
        }

    }
}

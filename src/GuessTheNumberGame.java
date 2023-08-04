import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {

    public static void main(String[] args) {
        int secretNumber;
        int guessedNumber;
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        secretNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100

        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("Try to guess the secret number between 1 and 100.");

        do {
            System.out.print("Enter your guess: ");
            guessedNumber = scanner.nextInt();
            attempts++;
            if (guessedNumber < secretNumber) {
                System.out.println("Try a higher number!");
            } else if (guessedNumber > secretNumber) {
                System.out.println("Try a lower number!");
            } else {
                System.out.println("Congratulations! You guessed the number " + secretNumber + " in " + attempts + " attempts!");
            }
        } while (guessedNumber != secretNumber);

        scanner.close();
    }
}

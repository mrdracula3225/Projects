import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int targetNumber = rand.nextInt(100) + 1; // Random number between 1 and 100
        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I've picked a number between 1 and 100. Can you guess it?");

        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");
            try {
                guess = scanner.nextInt();
                attempts++;

                if (guess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid number!");
                scanner.next(); // Clear invalid input
            }
        }

        scanner.close();
    }
}

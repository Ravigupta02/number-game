import java.util.Random;
import java.util.Scanner;

public class guessingnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int numberOfAttempts = 10;
        int roundsWon = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int userGuess;
            int attempts = 0;

            System.out.println("\nI have generated a number between " + lowerBound + " and " + upperBound +
                    ". Can you guess what it is?");

            do {
                System.out.print("Enter your guess: ");
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number in " +
                            attempts + " attempts.");
                    roundsWon++;
                }

            } while (userGuess != targetNumber && attempts < numberOfAttempts);

            if (userGuess != targetNumber) {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + targetNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                break;
            }

        } while (true);

        System.out.println("Thank you for playing! Your total rounds won: " + roundsWon);
        scanner.close();
    }
}


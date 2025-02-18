import java.util.Scanner;
import java.util.Random;

public class HighOrLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int target = random.nextInt(10) + 1;
        int guess = 0;
        boolean done = false;

        do {
            System.out.print("Guess the number (1-10): ");
            if (in.hasNextDouble()) {
                guess = in.nextInt();
                if (guess < 1 || guess > 10) {
                    System.out.println("Please guess a number between 1 & 10");
                } else {
                    done = true;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                in.nextLine();
            }
        } while (!done);

        System.out.println("The random number was: " + target);
        if (guess < target) {
            System.out.println("Your guess was too low.");
        } else if (guess > target) {
            System.out.println("Your guess was too high.");
        } else {
            System.out.println("You guessed it right!!!");
            }
        }
    }
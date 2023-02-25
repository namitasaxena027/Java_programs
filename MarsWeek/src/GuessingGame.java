import java.util.Random;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessingGame {
    GuessingGame() {
        System.out.println("Hi, what's your name?");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();

        Random rand = new Random();
        int number = rand.nextInt(100);

        System.out.println(name + " I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess what the number is?");
        int tries = 0;

        while (true) {
            int guess;
            try {
                guess = s.nextInt();
            } catch (InputMismatchException e) {
                String bad_input = s.next(); 
                System.out.println("That's not an integer, try again");
                continue;
            }

            if (guess < 1 || guess > 100) {
                System.out.println(guess + " is not a valid number, try again");
                continue;
            }

            tries++;

            if (guess < number) {
                System.out.println("Your guess is too low, try again.");
            } else if (guess > number) {
                System.out.println("Your guess is too high, try again.");
            } else {
                System.out.println("Well done " + name);
                System.out.println("You found my number in " + tries + " tries!");
                break;
            }
        }
    }
}
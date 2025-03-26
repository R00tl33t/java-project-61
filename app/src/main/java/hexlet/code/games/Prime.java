package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;

public class Prime {
    public static void playPrime(Scanner mainScanner) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        boolean winGame = true;
        for (int stageGame = 1; stageGame <= 3; stageGame++) {
            int number = Engine.getRandomNumber();
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = mainScanner.next();
            if (Engine.isPrime(number) && answer.equalsIgnoreCase("yes")) {
                System.out.println("Correct!");
            } else if (!Engine.isPrime(number) && answer.equalsIgnoreCase("no")) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(.");
                System.out.println("Let's try again, " + hexlet.code.Cli.getName() + "!");
                winGame = false;
                break;
            }
        }
        if (winGame) {
            System.out.println("Congratulations, " + hexlet.code.Cli.getName() + "!");
        }
    }
}

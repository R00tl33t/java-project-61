package hexlet.code;
import java.util.Scanner;
import java.util.Random;

public class EvenGame {
    public static void play(Scanner mainScanner) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");
        boolean winGame = true;
        for (int stageGame = 1; stageGame <= 3; stageGame++) {
            int number = randomNumber();
            System.out.println("Question: " + number);
            System.out.println("Your answer: ");
            String answer = mainScanner.next();
            if (number % 2 == 0 && answer.equalsIgnoreCase("yes")) {
                System.out.println("Correct!");
            } else if (number % 2 != 0 && answer.equalsIgnoreCase("no")) {
                System.out.println("Correct!");
            } else if (number % 2 == 0 && answer.equalsIgnoreCase("no")) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again " + Cli.getName()  + "!");
                winGame = false;
                break;
            } else if (number % 2 != 0 && answer.equalsIgnoreCase("yes")) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again " + Cli.getName()  + "!");
                winGame = false;
                break;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(.");
                System.out.println("Let's try again " + Cli.getName() + "!");
                winGame = false;
                break;
            }
        }
        if (winGame) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }

    private static int randomNumber() {
        Random random = new Random();
        int minNumber = 1;
        int maxNumber = 100;
        return random.nextInt(maxNumber - minNumber + 1) + minNumber;
    }
}

package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;

public class GCD {
    public static void playGCD(Scanner mainScanner) {
        System.out.println("Find the greatest common divisor of given numbers.");
        boolean winGame = true;
        for (int stageGame = 1; stageGame <= 3; stageGame++) {
            int number1 = Engine.getRandomNumber();
            int number2 = Engine.getRandomNumber();
            int result = Engine.findGCD(number1, number2);
            System.out.println("Question: " + number1 + " " + number2);
            System.out.print("Your answer: ");
            String answer = mainScanner.next();
            if (answer.equalsIgnoreCase(String.valueOf(result))) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
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

package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;

public class EvenGame {
    // Вводим механизм игры
    public static void playEven(Scanner mainScanner) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");
        // Вводим условие победы
        boolean winGame = true;
        // Вводим 3 раунда игры
        for (int stageGame = 1; stageGame <= 3; stageGame++) {
            int number = Engine.getRandomNumber();
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = mainScanner.next();
            if (number % 2 == 0 && answer.equalsIgnoreCase("yes")) {
                System.out.println("Correct!");
            } else if (number % 2 != 0 && answer.equalsIgnoreCase("no")) {
                System.out.println("Correct!");
            } else if (number % 2 == 0 && answer.equalsIgnoreCase("no")) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again " + hexlet.code.Cli.getName()  + "!");
                winGame = false;
                break;
            } else if (number % 2 != 0 && answer.equalsIgnoreCase("yes")) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again " + hexlet.code.Cli.getName()  + "!");
                winGame = false;
                break;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(.");
                System.out.println("Let's try again " + hexlet.code.Cli.getName() + "!");
                winGame = false;
                break;
            }
        }
        if (winGame) {
            System.out.println("Congratulations, " + hexlet.code.Cli.getName() + "!");
        }
    }
}

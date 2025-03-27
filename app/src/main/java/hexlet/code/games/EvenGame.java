package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Cli;

public class EvenGame {
    private static final String GAME_RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void playEven(Scanner scanner) {
        System.out.println(GAME_RULE);
        for (int currentRound = 1; currentRound <= Engine.ROUNDS_COUNT; currentRound++) {
            int number = getRandomNumber();
            String correctAnswer = number % 2 == 0 ? "yes" : "no";

            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.next().trim().toLowerCase();

            if (correctAnswer.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(.");
                System.out.println("Let's try again " + Cli.getName() + "!");
                return;
            }
        }
            System.out.println(Engine.CONGRATULATIONS);
    }
    // Механизм генерации случайного числа
    public static int getRandomNumber() {
        Random randomNumber = new Random();
        int minNumber = 1;
        int maxNumber = 100;
        return randomNumber.nextInt(maxNumber - minNumber + 1) + minNumber;
    }
}

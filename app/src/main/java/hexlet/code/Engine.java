package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;
    private static String userName;
    // Геттер имени
    public static String getName() {
        return userName;
    }

    public static void playGame(String gameRule, String[] questions, String[] correctAnswers, Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameRule);

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            String answer = scanner.next().trim().toLowerCase();

            if (correctAnswers[i].equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + answer + "' is wrong answer ;(. Correct answer was '");
                System.out.println(correctAnswers[i] + "'.");
                System.out.println("Let's try again, " + getName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + getName() + "!");
    }
}

package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Cli;

public class Calculator {
    private static final String GAME_RULE = "What is the result of the expression?";

    public static void playCalculator(Scanner scanner) {
        System.out.println(GAME_RULE);
        for (int currentRound = 1; currentRound <= Engine.ROUNDS_COUNT; currentRound++) {
            int number1 = getRandomNumber();
            int number2 = getRandomNumber();
            String operator = getRandomOperator();
            int result = 0;
            switch (operator) {
                case "+":
                    result = number1 + number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "*":
                    result = number1 * number2;
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected operator: " + operator);
            }
            System.out.println("Question: " + number1 + " " + operator + " " + number2);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase(String.valueOf(result))) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                return;
            }
        }
            System.out.println(Engine.CONGRATULATIONS);
    }
    // Механизм генерации случайного оператора
    public static String getRandomOperator() {
        String[] operators = {"+", "-", "*"};
        Random randomOperator = new Random();
        return operators[randomOperator.nextInt(operators.length)];
    }
    // Механизм генерации случайного числа
    public static int getRandomNumber() {
        Random randomNumber = new Random();
        int minNumber = 1;
        int maxNumber = 100;
        return randomNumber.nextInt(maxNumber - minNumber + 1) + minNumber;
    }
}

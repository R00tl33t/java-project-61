package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;

public class Calculator {
    public static void playCalculator(Scanner mainScanner) {
        System.out.println("What is the result of the expression?");
        boolean winGame = true;
        for (int stageGame = 1; stageGame <= 3; stageGame++) {
            int number1 = Engine.getRandomNumber();
            int number2 = Engine.getRandomNumber();
            String operator = Engine.getRandomOperator();
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

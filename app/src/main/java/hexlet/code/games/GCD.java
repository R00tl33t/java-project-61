package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Cli;

public class GCD {
    public static void playGCD(Scanner scanner) {
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int currentRound = 1; currentRound <= Engine.ROUNDS_COUNT; currentRound++) {
            int number1 = getRandomNumber();
            int number2 = getRandomNumber();
            int result = findGCD(number1, number2);
            System.out.println("Question: " + number1 + " " + number2);
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
    // Генерация случайного числа
    public static int getRandomNumber() {
        Random randomNumber = new Random();
        int minNumber = 1;
        int maxNumber = 100;
        return randomNumber.nextInt(maxNumber - minNumber + 1) + minNumber;
    }
    // Механизм генерации наибольшего общего делителя
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

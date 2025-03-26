package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Cli;

public class Prime {
    public static void playPrime(Scanner scanner) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        boolean winGame = true;
        for (int currentRound = 1; currentRound <= Engine.ROUNDS_COUNT; currentRound++) {
            int number = getRandomNumber();
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (isPrime(number) && answer.equalsIgnoreCase("yes")) {
                System.out.println("Correct!");
            } else if (!isPrime(number) && answer.equalsIgnoreCase("no")) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                winGame = false;
                break;
            }
        }
        if (winGame) {
            System.out.println(Engine.CONGRATULATIONS);
        }
    }
    // Механизм проверки простого числа
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    // Механизм генерации случайного числа
    public static int getRandomNumber() {
        Random randomNumber = new Random();
        int minNumber = 1;
        int maxNumber = 100;
        return randomNumber.nextInt(maxNumber - minNumber + 1) + minNumber;
    }
}

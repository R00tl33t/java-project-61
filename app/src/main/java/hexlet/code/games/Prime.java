package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Prime {
    private static final String GAME_RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;  // Увеличил диапазон для большего разнообразия

    public static void playPrime(Scanner scanner) {
        // Подготавливаем массивы для вопросов и ответов
        String[] questions = new String[Engine.ROUNDS_COUNT];
        String[] answers = new String[Engine.ROUNDS_COUNT];

        // Генерируем данные для каждого раунда
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = getRandomNumber();
            questions[i] = String.valueOf(number);
            answers[i] = isPrime(number) ? "yes" : "no";
        }

        // Передаем управление в движок
        Engine.playGame(GAME_RULE, questions, answers, scanner);
    }

    // Проверка, является ли число простым
    private static boolean isPrime(int number) {
        // Константы для улучшения читаемости
        final int smallestPrime = 2;
        final int firstOddPrime = 3;
        final int stepForOdds = 2;

        if (number <= 1) {
            return false;
        }
        if (number == smallestPrime) {
            return true;
        }
        if (number % smallestPrime == 0) {
            return false;
        }

        int sqrtNumber = (int) Math.sqrt(number);
        for (int i = firstOddPrime; i <= sqrtNumber; i += stepForOdds) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Генерация случайного числа
    private static int getRandomNumber() {
        return new Random().nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
    }
}

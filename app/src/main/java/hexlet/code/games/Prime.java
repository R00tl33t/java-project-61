package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;
import java.math.BigInteger;

public class Prime {
    private static final String GAME_RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 10;
    private static final int CERTAINTY = 100;

    public static void play(Scanner scanner) {
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
        BigInteger bigInt = BigInteger.valueOf(number);
        return bigInt.isProbablePrime(CERTAINTY);
    }

    // Генерация случайного числа
    private static int getRandomNumber() {
        return new Random().nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
    }
}

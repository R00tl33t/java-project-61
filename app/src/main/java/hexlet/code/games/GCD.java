package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;
import java.math.BigInteger;

public class GCD {
    private static final String GAME_RULE = "Find the greatest common divisor of given numbers.";
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 10;

    public static void play(Scanner scanner) {
        String[] questions = new String[Engine.ROUNDS_COUNT];
        String[] answers = new String[Engine.ROUNDS_COUNT];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number1 = getRandomNumber();
            int number2 = getRandomNumber();
            BigInteger gcd = BigInteger.valueOf(number1).gcd(BigInteger.valueOf(number2));
            questions[i] = number1 + " " + number2;
            answers[i] = gcd.toString();
        }

        Engine.playGame(GAME_RULE, questions, answers, scanner);
    }

    private static int getRandomNumber() {
        return new Random().nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
    }
}

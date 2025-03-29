package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Calculator {
    private static final String GAME_RULE = "What is the result of the expression?";
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 10;
    private static final String[] OPERATORS = {"+", "-", "*"};

    public static void play(Scanner scanner) {
        // Подготавливаем массивы для вопросов и ответов
        String[] questions = new String[Engine.ROUNDS_COUNT];
        String[] answers = new String[Engine.ROUNDS_COUNT];

        // Генерируем данные для каждого раунда
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number1 = getRandomNumber();
            int number2 = getRandomNumber();
            String operator = getRandomOperator();

            questions[i] = number1 + " " + operator + " " + number2;
            answers[i] = String.valueOf(calculate(number1, number2, operator));
        }

        // Передаем управление в движок
        Engine.playGame(GAME_RULE, questions, answers, scanner);
    }

    // Вычисление результата операции
    private static int calculate(int num1, int num2, String operator) {
        return switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            default -> throw new IllegalArgumentException("Unknown operator: " + operator);
        };
    }

    // Генерация случайного оператора
    private static String getRandomOperator() {
        return OPERATORS[new Random().nextInt(OPERATORS.length)];
    }

    // Генерация случайного числа
    private static int getRandomNumber() {
        return new Random().nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
    }
}

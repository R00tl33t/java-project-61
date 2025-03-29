package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    private static final String GAME_RULE = "What number is missing in the progression?";
    private static final int MIN_PROGRESSION_LENGTH = 5;
    private static final int MAX_PROGRESSION_LENGTH = 10;
    private static final int MIN_START_NUMBER = 1;
    private static final int MAX_START_NUMBER = 20;
    private static final int MIN_STEP = 1;
    private static final int MAX_STEP = 10;

    public static void play(Scanner scanner) {
        // Подготавливаем массивы для вопросов и ответов
        String[] questions = new String[Engine.ROUNDS_COUNT];
        String[] answers = new String[Engine.ROUNDS_COUNT];

        // Генерируем данные для каждого раунда
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            // Генерируем параметры прогрессии
            int length = getRandomNumber(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);
            int start = getRandomNumber(MIN_START_NUMBER, MAX_START_NUMBER);
            int step = getRandomNumber(MIN_STEP, MAX_STEP);

            // Создаем прогрессию и скрываем один элемент
            int[] progression = generateProgression(start, step, length);
            int hiddenIndex = new Random().nextInt(length);

            // Сохраняем вопрос и правильный ответ
            questions[i] = buildQuestion(progression, hiddenIndex);
            answers[i] = String.valueOf(progression[hiddenIndex]);
        }

        // Передаем управление в движок
        Engine.playGame(GAME_RULE, questions, answers, scanner);
    }

    private static int[] generateProgression(int start, int step, int length) {
        int[] progression = new int[length];
        for (int i = 0; i < length; i++) {
            progression[i] = start + i * step;
        }
        return progression;
    }

    private static String buildQuestion(int[] progression, int hiddenIndex) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < progression.length; i++) {
            if (i == hiddenIndex) {
                sb.append(".. ");
            } else {
                sb.append(progression[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }

    private static int getRandomNumber(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }
}

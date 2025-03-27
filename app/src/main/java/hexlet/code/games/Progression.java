package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Cli;

public class Progression {
    public static void playProgression(Scanner scanner) {
        System.out.println("What number is missing in the progression?");
        // Первая партия игры
        int n1 = getRandomNumber();
        int increment = getRandomIncrement();
        int n2 = n1 + increment;
        int n3 = n2 + increment;
        int n4 = n3 + increment;
        int n5 = n4 + increment;
        System.out.println("Question: " + n1 + " " + n2 + " " + ".." + " " + n4 + " " + n5);
        System.out.print("Your answer: ");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase(String.valueOf(n3))) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + n3 + "'.");
            System.out.println("Let's try again, " + Cli.getName() + "!");
            return;
        }
        // Вторая партия игры
        int n12 = getRandomNumber();
        int increment2 = getRandomIncrement();
        int n22 = n12 + increment2;
        int n32 = n22 + increment2;
        int n42 = n32 + increment2;
        int n52 = n42 + increment2;
        System.out.println("Question: " + n12 + " " + n22 + " " + n32 + " " + n42 + " " + "..");
        System.out.print("Your answer: ");
        String answer2 = scanner.next();
        if (answer2.equalsIgnoreCase(String.valueOf(n52))) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer2 + "' is wrong answer ;(. Correct answer was '" + n52 + "'.");
            System.out.println("Let's try again, " + Cli.getName() + "!");
            return;
        }
        // Третья партия игры
        int n13 = getRandomNumber();
        int increment3 = getRandomIncrement();
        int n23 = n13 + increment3;
        int n33 = n23 + increment3;
        int n43 = n33 + increment3;
        int n53 = n43 + increment3;
        System.out.println("Question: " + n13 + " " + ".." + " " + n33 + " " + n43 + " " + n53);
        System.out.print("Your answer: ");
        String answer3 = scanner.next();
        if (answer3.equalsIgnoreCase(String.valueOf(n23))) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer3 + "' is wrong answer ;(. Correct answer was '" + n23 + "'.");
            System.out.println("Let's try again, " + Cli.getName() + "!");
            return;
        }
        System.out.println(Engine.CONGRATULATIONS);
    }
    // Механизм генерации случайного числа
    public static int getRandomNumber() {
        Random randomNumber = new Random();
        int minNumber = 1;
        int maxNumber = 100;
        return randomNumber.nextInt(maxNumber - minNumber + 1) + minNumber;
    }
    // Механизм генерации случайного инкремента
    public static int getRandomIncrement() {
        Random randomIncrement = new Random();
        int minNumber = 1;
        int maxNumber = 5;
        return randomIncrement.nextInt(maxNumber - minNumber + 1) + minNumber;
    }
}

package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;

public class Progression {
    public static void playProgression(Scanner mainScanner) {
        System.out.println("What number is missing in the progression?");
        boolean winGame = true;
        // Первая партия игры
        int n1 = Engine.getRandomNumber();
        int increment = Engine.getRandomIncrement();
        int n2 = n1 + increment;
        int n3 = n2 + increment;
        int n4 = n3 + increment;
        int n5 = n4 + increment;
        System.out.println("Question: " + n1 + " " + n2 + " " + ".." + " " + n4 + " " + n5);
        System.out.print("Your answer: ");
        String answer = mainScanner.next();
        if (answer.equalsIgnoreCase(String.valueOf(n3))) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + n3 + "'.");
            System.out.println("Let's try again, " + hexlet.code.Cli.getName() + "!");
            winGame = false;
            return;
        }
        // Вторая партия игры
        int n12 = Engine.getRandomNumber();
        int increment2 = Engine.getRandomIncrement();
        int n22 = n12 + increment2;
        int n32 = n22 + increment2;
        int n42 = n32 + increment2;
        int n52 = n42 + increment2;
        System.out.println("Question: " + n12 + " " + n22 + " " + n32 + " " + n42 + " " + "..");
        System.out.print("Your answer: ");
        String answer2 = mainScanner.next();
        if (answer2.equalsIgnoreCase(String.valueOf(n52))) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer2 + "' is wrong answer ;(. Correct answer was '" + n52 + "'.");
            System.out.println("Let's try again, " + hexlet.code.Cli.getName() + "!");
            winGame = false;
            return;
        }
        // Третья партия игры
        int n13 = Engine.getRandomNumber();
        int increment3 = Engine.getRandomIncrement();
        int n23 = n13 + increment3;
        int n33 = n23 + increment3;
        int n43 = n33 + increment3;
        int n53 = n43 + increment3;
        System.out.println("Question: " + n13 + " " + ".." + " " + n33 + " " + n43 + " " + n53);
        System.out.print("Your answer: ");
        String answer3 = mainScanner.next();
        if (answer3.equalsIgnoreCase(String.valueOf(n23))) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer3 + "' is wrong answer ;(. Correct answer was '" + n23 + "'.");
            System.out.println("Let's try again, " + hexlet.code.Cli.getName() + "!");
            winGame = false;
            return;
        }
        if (winGame) {
            System.out.println("Congratulations, " + hexlet.code.Cli.getName() + "!");
        }
    }
}

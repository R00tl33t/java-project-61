package hexlet.code;
import java.util.Random;

public class Engine {
    // Механизм генерации случайного числа
    public static int getRandomNumber() {
        Random randomNumber = new Random();
        int minNumber = 1;
        int maxNumber = 100;
        return randomNumber.nextInt(maxNumber - minNumber + 1) + minNumber;
    }
    public static String getRandomOperator() {
        String[] operators = {"+", "-", "*"};
        Random randomOperator = new Random();
        return operators[randomOperator.nextInt(operators.length)];
    }
}

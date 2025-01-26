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

    // Механизм генерации случайного оператора
    public static String getRandomOperator() {
        String[] operators = {"+", "-", "*"};
        Random randomOperator = new Random();
        return operators[randomOperator.nextInt(operators.length)];
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

    // Механизм генерации случайного инкремента
    public static int getRandomIncrement() {
        Random randomIncrement = new Random();
        int minNumber = 1;
        int maxNumber = 5;
        return randomIncrement.nextInt(maxNumber - minNumber + 1) + minNumber;
    }
}

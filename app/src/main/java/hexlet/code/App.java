package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Устанавливаем общий для программы сканер
        Scanner mainScanner = new Scanner(System.in);
        // Устанавливаем текст для выбора игры
        System.out.println("""
            Please, enter the game number and press Enter
            1 - Greet
            2 - Even
            3 - Calculator
            4 - GCD
            5 - Progression
            6 - Prime
            0 - Exit""");
        String choosenGame = mainScanner.next();
        System.out.println("Your choice " + choosenGame);
        // Выбираем игру

        switch (choosenGame) {
            // Запускается функция указания имени игрока
            case "1" -> Cli.setName(mainScanner);
            // Запускается игра "Чёт - нечет"
            case "2" -> {
                Cli.setName(mainScanner);
                hexlet.code.games.EvenGame.playEven(mainScanner);
            }
            // Запускается игра "Калькулятор"
            case "3" -> {
                Cli.setName(mainScanner);
                hexlet.code.games.Calculator.playCalculator(mainScanner);
            }
            // Запускается игра "Найди наибольший общий делитель"
            case "4" -> {
                Cli.setName(mainScanner);
                hexlet.code.games.GCD.playGCD(mainScanner);
            }
            // Запускается игра "Арифметическая прогрессия"
            case "5" -> {
                Cli.setName(mainScanner);
                hexlet.code.games.Progression.playProgression(mainScanner);
            }
            // Запускается игра "Простое число"
            case "6" -> {
                Cli.setName(mainScanner);
                hexlet.code.games.Prime.playPrime(mainScanner);
            }
            default -> throw new IllegalArgumentException("Можно выбрать только число от 1 до 6!");
        }
        // Выключаем общий для программы сканер
        mainScanner.close();
    }
}

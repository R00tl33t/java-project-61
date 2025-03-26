package hexlet.code;
import java.util.Scanner;
import hexlet.code.games.EvenGame;
import hexlet.code.games.Calculator;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    public static void main(String[] args) {
        // Устанавливаем общий для программы сканер
        Scanner scanner = new Scanner(System.in);
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
        String choosenGame = scanner.next();
        System.out.println("Your choice " + choosenGame);
        // Выбираем игру

        switch (choosenGame) {
            // Запускается функция указания имени игрока
            case "1" -> Cli.setName(scanner);
            // Запускается игра "Чёт - нечет"
            case "2" -> {
                Cli.setName(scanner);
                EvenGame.playEven(scanner);
            }
            // Запускается игра "Калькулятор"
            case "3" -> {
                Cli.setName(scanner);
                Calculator.playCalculator(scanner);
            }
            // Запускается игра "Найди наибольший общий делитель"
            case "4" -> {
                Cli.setName(scanner);
                GCD.playGCD(scanner);
            }
            // Запускается игра "Арифметическая прогрессия"
            case "5" -> {
                Cli.setName(scanner);
                Progression.playProgression(scanner);
            }
            // Запускается игра "Простое число"
            case "6" -> {
                Cli.setName(scanner);
                Prime.playPrime(scanner);
            }
            default -> throw new IllegalArgumentException("Можно выбрать только число от 1 до 6!");
        }
        // Выключаем общий для программы сканер
        scanner.close();
    }
}

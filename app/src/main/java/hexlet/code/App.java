package hexlet.code;
import java.util.Scanner;
import hexlet.code.games.EvenGame;
import hexlet.code.games.Calculator;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
            // Выход из игры
            case "0" -> System.exit(0);
            // Запускается функция указания имени игрока
            case "1" -> Cli.setName(scanner);
            // Запускается игра "Чёт - нечет"
            case "2" -> EvenGame.play(scanner);
            // Запускается игра "Калькулятор"
            case "3" -> Calculator.play(scanner);
            // Запускается игра "Найди наибольший общий делитель"
            case "4" -> GCD.play(scanner);
            // Запускается игра "Арифметическая прогрессия"
            case "5" -> Progression.play(scanner);
            // Запускается игра "Простое число"
            case "6" -> Prime.play(scanner);
            // Сообщение об ошибке, если выбирается другое число
            default -> throw new IllegalArgumentException("Можно выбрать только число от 0 до 6!");
        }
        // Выключаем общий для программы сканер
        scanner.close();
    }
}

package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Устанавливаем общий для программы сканер
        Scanner mainScanner = new Scanner(System.in);
        // Устанавливаем текст для выбора игры
        System.out.println("Please, enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        String choosenGame = mainScanner.next();
        System.out.println("Your choice " + choosenGame);
        // Выбираем игру
        if (choosenGame.equals("1")) {
            // Запускается функция указания имени игрока
            Cli.setName(mainScanner);
        } else if (choosenGame.equals("2")) {
            Cli.setName(mainScanner);
            EvenGame.play(mainScanner);
        } else {
            return;
        }
        // Выключаем общий для программы сканер
        mainScanner.close();
    }
}

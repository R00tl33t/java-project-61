package hexlet.code;
import java.util.Scanner;

public class Cli {
    private static String userName;

    public static void setName(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }
    public static String getName() {
        return userName;
    }
}

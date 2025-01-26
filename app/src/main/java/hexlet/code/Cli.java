package hexlet.code;
import java.util.Scanner;

public class Cli {
    private static String userName;

    public static void setName(Scanner mainScanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = mainScanner.next();
        System.out.println("Hello, " + userName);
    }
    public static String getName() {
        return userName;
    }
}

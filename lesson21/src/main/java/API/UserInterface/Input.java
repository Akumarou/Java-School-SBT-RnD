package API.UserInterface;

import java.util.Scanner;

public class Input {
    public static String string() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    public static int integer() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}

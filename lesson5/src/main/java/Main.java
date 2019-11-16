import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //URLSpecifierExample();
        TerminalImpl myTerminalImpl = new TerminalImpl();
        while(true){
            System.out.println("Hello pardner! What do you want to do?\n1)Check account\n2)Withdraw money\n3)Put money on your card\n[Any key] Leave.");
            switch (new Scanner(System.in).next()){
                case ("1"):
                    makeSpace();
                    myTerminalImpl.checkAccount();
                    break;
                case ("2"):
                    makeSpace();
                    myTerminalImpl.getMoney();
                    break;
                case ("3"):
                    makeSpace();
                    myTerminalImpl.putMoney();
                    break;
                default:
                    makeSpace();
                    System.out.println("Bye!");
                    System.exit(0);
            }

        }
    }

    private static void makeSpace() {
        System.out.println();
        System.out.println();
        System.out.println();
    }


    private static void URLSpecifierExample() throws IOException {
        Scanner scanner = new Scanner(System.in); // System.in закрывать не нужно

        do {
            System.out.println("Type url");
            String url = scanner.next();

            try {
                URLSpecifier.readContent(url);

                break;
            } catch (MalformedURLException e) {
                System.out.println("Malformed URL specified!");
            } catch (UnknownHostException e) {
                System.out.println("Unknown host!");
            } catch (IOException e) {
                System.out.println("Unable to get site content. " + e.getMessage());
                throw e;
            }

            System.out.println("Try again");
        } while (true);
    }
}

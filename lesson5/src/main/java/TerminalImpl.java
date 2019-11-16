import java.math.BigDecimal;
import java.util.Scanner;

public class TerminalImpl implements Terminal {
    private PinValidator pinValidator = new PinValidator();
    private TerminalServer terminalServer = new TerminalServer();


    @Override
    public void checkAccount() {
        authorize();
        System.out.println("It is " + terminalServer.checkAccount() + " $ on your account");
        pinValidator.endOfOperation();
    }

    @Override
    public void getMoney() {
        authorize();
        while (true){
            System.out.println("How much do you want to withdraw(must be a number multiplied by 100)?");

            long money = Long.parseLong(new Scanner(System.in).nextLine().replaceAll("\\D", ""));
            try {
                if(terminalServer.get(money)) {
                    System.out.println("Success!!!");
                    pinValidator.endOfOperation();
                    return;
                }
                else {
                    System.out.println("Something is wrong. Try again later");
                    pinValidator.endOfOperation();
                    return;
                }
            } catch (NotEnoughMoneyException | IncorrectMoneyInputException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    @Override
    public void putMoney() {
        authorize();
        while (true) {
            System.out.println("How much do you want to put?");
            long money = Long.parseLong(new Scanner(System.in).nextLine().replaceAll("\\D", ""));
            try {
                if(terminalServer.put(money)) {
                    System.out.println("Success!!!");
                    pinValidator.endOfOperation();
                    return;
                }
                else {
                    System.out.println("Something is wrong. Try again later");
                    pinValidator.endOfOperation();
                    return;
                }
            } catch (IncorrectMoneyInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    private void authorize(){
        while(pinValidator.isInValid()){
            System.out.println("Your pin:");


            try {
                pinValidator.validate(new Scanner(System.in).nextLine().replaceAll("\\D", ""));


            } catch (IncorrectPinException e) {
                System.out.println(e.getMessage());


            } catch (LockException e) {

                try {
                    System.out.println("Wrong input. You will need to wait for 5 sec");
                    for (int i=5;i>=1;i--){
                        System.out.println("It is left - " + i + " sec");
                        Thread.sleep(1000);
                    }
                    System.out.println("You may try now");
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }


            }
        }
    }
}

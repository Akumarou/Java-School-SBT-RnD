public class AccountExample implements Runnable {
    private Account acct = new Account();

    private void makeWithdrawal(int amt) {
        if (acct.getBalance() >= amt) {
            acct.withdraw(amt);
        }
    }

    public void run() {
        for (int x = 0; x < 5; x++) {
            makeWithdrawal(10);
            if (acct.getBalance() < 0) {
                System.out.println("account is overdrawn!");
            }
        }
    }
}
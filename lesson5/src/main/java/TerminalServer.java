import java.math.BigDecimal;

class TerminalServer {
    private BigDecimal currentMoney = new BigDecimal(2000.2);


    long checkAccount() {
        return currentMoney.longValue();
    }

    boolean put(long money) throws IncorrectMoneyInputException {
        if(money%100 != 0) throw new IncorrectMoneyInputException("Incorrect money input(Must not be zero)");
        currentMoney = currentMoney.add(new BigDecimal(money));
        return true;
    }

    boolean get(long money) throws NotEnoughMoneyException, IncorrectMoneyInputException {
        if(money%100 != 0 || money<=0) throw new IncorrectMoneyInputException("You may get anything that is multiplied by 100 and is not a zero");
        if(currentMoney.compareTo(new BigDecimal(money))<0) throw new NotEnoughMoneyException("Not enough money on the account");
        currentMoney = currentMoney.subtract(new BigDecimal(money));
        return true;
    }
}

import java.math.BigDecimal;

public interface Terminal {
    //Операция вернет информацию о деньгах на счету
    public void checkAccount();
    //операция попробует снять деньги со счета
    public void getMoney();
    //операция попробует положить деньги на счет
    public void putMoney();

}

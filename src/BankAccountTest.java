import static org.junit.Assert.*;

public class BankAccountTest {

    @org.junit.Test
    public void getAccountNumber() {
        BankAccount b = new BankAccount("10", 100.0);
        String actuals = b.AccountNumber();
        Assets.assertsEqual("10", actuals);
    }

    @org.junit.Test
    public void getBalance() {
    }

    @org.junit.Test
    public void deposit() {
    }

    @org.junit.Test
    public void withdraw() {
    }
}
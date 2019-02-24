/**
 * This is BankAccount Class
 */
public class BankAccount {
    private String accountNumber;
    private double balance;

    /**
     * @param accountNumber
     * @param balance
     */
    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    /**
     * @return
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @return
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param amount
     */
    public void deposit(double amount){
        this.balance += amount;
    }

    /**
     * @param amount
     */
    public void withdraw(double amount){
        this.balance -= amount;
    }


    /**
     * Print account details
     */
    public void printAccount(){
        System.out.println("Account number is this: "+this.accountNumber+", Balance is $"+this.balance);
    }


}

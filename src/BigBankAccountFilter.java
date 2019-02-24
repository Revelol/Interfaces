public class BigBankAccountFilter implements Filter {
    public boolean accept(Object x){
        boolean result = false;
        if (x instanceof BankAccount) {
            BankAccount b = (BankAccount)x;
            if (b.getBalance() > 10000){
                result = true;
            }else{
                return result;
            }

        }
        return result;

    }
}

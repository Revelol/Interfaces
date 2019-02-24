import java.util.ArrayList;

public class BankAccountLister {
    public static void main (String[] args){
        ArrayList<Object> bankList = new ArrayList<Object>();
        BigBankAccountFilter bankA = new BigBankAccountFilter();
        bankList.add(BankAccountLister.makeAccount("3",100000));
        bankList.add(BankAccountLister.makeAccount("9",56748));
        bankList.add(BankAccountLister.makeAccount("35",10000.01));
        bankList.add(BankAccountLister.makeAccount("8",900));
        bankList.add(BankAccountLister.makeAccount("34",3.40));
        bankList.add(BankAccountLister.makeAccount("78",540000));
        bankList.add(BankAccountLister.makeAccount("64",780000));
        bankList.add(BankAccountLister.makeAccount("987",560000));
        bankList.add(BankAccountLister.makeAccount("10",100));
        bankList.add(BankAccountLister.makeAccount("33",300000));
        ArrayList<Object> filteredList = HelperUtils.collectAll(bankList,bankA);
        for(Object o : filteredList){
            BankAccount b = (BankAccount) o;
            b.printAccount();
        }

    }
    public static BankAccount makeAccount(String accountNum, double account){
        BankAccount b = new BankAccount(accountNum, account);
        return b;

    }


}

import java.util.ArrayList;

public class AccountsTester {
    public static void main(String[] args) {
       Account a1 = new Account("owner1", 45566, 5000);
       Account a2 = new Account("owner1", "owner2", 45567, 10000);
        //System.out.println(a1.toString());
       // System.out.println(a2.toString());
        //System.out.println(a1.equals(a2));
        Account checking1 = new CheckingAccount("owner4", 45568, 50);
        Account checking2 = new CheckingAccount("owner5", 45569, 100);

        CheckingAccount myChecking = (CheckingAccount) checking1;
//        myChecking.withdraw(50);
//        myChecking.deposit(100);

        Account savings1 = new SavingsAccount("owner6", 45570, 200);
        Account savings2 = new SavingsAccount("owner7", "owner8", 45570, 400);

        SavingsAccount mySavings = (SavingsAccount) savings2;
//        mySavings.withdraw(50);
//        mySavings.deposit(100);

        Account moneyMarket1 = new MoneyMarketAccount("owner8", 45571, 50000);
        Account moneyMarket2 = new MoneyMarketAccount("owner9", "owner10", 45572, 30000);

        Account cd1 = new CertificateOfDeposit("owner10", 45572, 40000, "July 19, 2022");
        Account cd2 = new CertificateOfDeposit("owner11", "owner12", 45573, 500000, "December 25, 2025");

        CertificateOfDeposit myCert = (CertificateOfDeposit) cd1;
        myCert.extendTermOfCd("January 1, 2030");
        System.out.println(myCert.getEndDate());


       // System.out.println(cd1.toString());

        ArrayList<Account> accountList = new ArrayList<>();

        accountList.add(a1);
        accountList.add(a2);
        accountList.add(checking1);
        accountList.add(checking2);
        accountList.add(savings1);
        accountList.add(savings2);
        accountList.add(moneyMarket1);
        accountList.add(moneyMarket2);
        accountList.add(cd1);
        accountList.add(cd2);

        for (Account act : accountList) {
            System.out.println(act + "\n");
        }



    }
}

public class Accounts {
    private String name1;
    private String name2;
    private int accountNumber;
    private int initialDeposit;

    // constructor for single owner account
    public Accounts(String firstName, int anAccountNumber, int anInitialDeposit) {
        this.name1 = firstName;
        this.accountNumber = anAccountNumber;
        this.initialDeposit = anInitialDeposit;
    }

    // constructor for joint-owner account
    public Accounts(String firstName, String secondName, int anAccountNumber, int anInitialDeposit) {
        this.name1 = firstName;
        this.name2 = secondName;
        this.accountNumber = anAccountNumber;
        this.initialDeposit = anInitialDeposit;
    }

    // Getters
    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getInitialDeposit() {
        return initialDeposit;
    }



}

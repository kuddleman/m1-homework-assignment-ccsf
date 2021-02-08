public class DemandDeposit extends Account {
    // constructor for single owner account
    public DemandDeposit(String firstName, int anAccountNumber, int anInitialDeposit) {
        super(firstName, anAccountNumber, anInitialDeposit);
    }

    // constructor for joint-owner account
    public DemandDeposit(String firstName, String secondName, int anAccountNumber, int anInitialDeposit) {
        super(firstName,secondName,anAccountNumber,anInitialDeposit);
    }

}

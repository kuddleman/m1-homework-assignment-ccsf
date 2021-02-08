public class CertificateOfDeposit extends Account {

    // constructor for single owner account
    public CertificateOfDeposit (String firstName, int anAccountNumber, int anInitialDeposit) {
        super(firstName, anAccountNumber, anInitialDeposit);
    }

    // constructor for joint-owner account
    public CertificateOfDeposit (String firstName, String secondName, int anAccountNumber, int anInitialDeposit) {
        super(firstName,secondName,anAccountNumber,anInitialDeposit);
    }
}

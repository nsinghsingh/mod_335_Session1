public class PrivateAccount extends BankAccount{

    public PrivateAccount(String firstName, String lastName, int accountStatus) {
        super(firstName, lastName, accountStatus);
    }
    public PrivateAccount(String lastName, int accountStatus) {
        this("", lastName, accountStatus);
    }

    @Override
    void withdraw() {

    }
}

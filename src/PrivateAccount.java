public class PrivateAccount extends BankAccount{

    public PrivateAccount(String firstName, String lastName, boolean accountStatus) {
        super(firstName, lastName, accountStatus);
    }
    public PrivateAccount(String lastName, boolean accountStatus) {
        this("", lastName, accountStatus);
    }
}

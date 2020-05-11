public class BusinessAccount extends BankAccount{

    public String companyName;

    public BusinessAccount(String firstName, String lastName, String companyName, boolean accountStatus) {
        super(firstName, lastName, accountStatus);
        this.companyName = companyName;
    }
    public BusinessAccount(String lastName, String companyName, boolean accountStatus) {
        this("", lastName, companyName, accountStatus);
    }
}

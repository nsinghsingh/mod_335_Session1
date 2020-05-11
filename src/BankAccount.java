abstract public class BankAccount {

    public String firstName;
    public String lastName;
    public boolean accountStatus;

    private BankAccount(){

    }
    public BankAccount(String firstName, String lastName, boolean accountStatus){
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountStatus = accountStatus;
    }
    public BankAccount(String lastName, boolean accountStatus){
        this("", lastName, accountStatus);
    }
}

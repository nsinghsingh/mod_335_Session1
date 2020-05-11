abstract public class BankAccount {

    public String firstName;
    public String lastName;
    public int accountStatus;

    private BankAccount(){

    }
    public BankAccount(String firstName, String lastName, int accountStatus){
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountStatus = accountStatus;
    }
    public BankAccount(String lastName, int accountStatus){
        this("", lastName, accountStatus);
    }
    abstract void withdraw();
}

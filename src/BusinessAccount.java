public class BusinessAccount extends BankAccount{

    public String companyName;

    public BusinessAccount(String firstName, String lastName, String companyName, int accountStatus) {
        super(firstName, lastName, accountStatus);
        this.companyName = companyName;
    }
    public BusinessAccount(String lastName, String companyName, int accountStatus) {
        this("", lastName, companyName, accountStatus);
    }

    @Override
    void withdraw(int amount) {
        if(accountStatus - amount < -20000){
            throw new OutOfMoneyException("Your account balance can't go under -20000");
        }
        else{
            accountStatus -= amount;
        }
    }
}

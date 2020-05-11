public class PrivateAccount extends BankAccount{

    public PrivateAccount(String firstName, String lastName, int accountStatus) {
        super(firstName, lastName, accountStatus);
    }
    public PrivateAccount(String lastName, int accountStatus) {
        this("", lastName, accountStatus);
    }

    @Override
    void withdraw(int amount) {
        if(accountStatus - amount < -2000){
            throw new OutOfMoneyException("Your account balance can't go under -2000");
        }
        else{
            accountStatus -= amount;
        }
    }
}

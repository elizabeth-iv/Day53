public class BankAccount {
    private String accountName;
    private double accountBalance;
    private int accountNumber;
    public BankAccount ( String accountName,int accountNumber, double accountBalance) {
        this.accountName= accountName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }
    public BankAccount() {

    }
    public String getName() {
        return this.accountName;
    }
    public void setName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return this.accountBalance;
    }
    public void setBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getAcctNumber() {
        return this.accountNumber;
    }

    public void deposit(double depositAmount) {
        this.accountBalance += depositAmount;
    }

    public void withdrawal(double withdrawalAmount) {
        this.accountBalance -= withdrawalAmount;
    }

    public void transfer(BankAccount targetAcct, double transferAmount) {
        withdrawal(transferAmount);
        targetAcct.deposit(transferAmount);
    }

    public String accountTotal () {
        return "Account: " + accountName +" | " + accountNumber + " | " + "Balance: " + accountBalance;
    }
}

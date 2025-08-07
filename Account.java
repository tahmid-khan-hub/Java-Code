public class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // constructor
    public Account(String accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
               "\nAccount Holder: " + accountHolder +
               "\nBalance: $" + balance;
    }
}

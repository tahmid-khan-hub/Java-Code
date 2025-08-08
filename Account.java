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

    // getter and setter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    // getter and setter for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }

    // getter and setter for balance
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    // Method to print account holder name and account number
    public void accountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
    }

    // Method to print current balance
    public void currentBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    // current balance with date
    public void currentBalance(String Date){
        System.out.println("Current Balance is: " + balance + " on " + Date);
    }
}

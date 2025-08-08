public class SavingAccount extends Account {
    private double InterestRate;
        
    // constructor
    public SavingAccount(double InterestRate, String AccountNumber, String AccountHolder, double balance){
        super(AccountNumber, AccountHolder, balance);
        this.InterestRate = InterestRate;
    }
    // getter and setter
    public double getInterestRate(){
        return InterestRate;
    }
    public void setInterestRate(double InterestRate){
        this.InterestRate = InterestRate;
    } 
}

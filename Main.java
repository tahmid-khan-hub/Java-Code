public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account("cdsv543r", "Tahmid", 3333.00);

        myAccount.accountInfo();
        myAccount.currentBalance();

        myAccount.currentBalance("09-08-2025");

        SavingAccount sa = new SavingAccount(4.5, "cdsv543r", "Tahmid", 3333.00);

        sa.accountInfo();
        sa.currentBalance();

        System.out.println("Interest Rate: " + sa.getInterestRate() + "%");

        sa.currentBalance();

        myAccount.sendMoney(100);
        myAccount.receiveMoney(500);
    }
}

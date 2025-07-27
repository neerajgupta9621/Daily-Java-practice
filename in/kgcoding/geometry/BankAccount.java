package in.kgcoding.geometry;

public class BankAccount {

    private String accountnumber;
    private String accountHolderName;
    private double balance;


    

    public BankAccount(String accountnumber, String accountHolderName) {
        this.accountnumber = accountnumber;
        this.accountHolderName = accountHolderName;
    }

    public void depositMoney(double money) {
        if (money <= 0) {
            System.out.println("Invalid Deposit");
        } else {
            balance += money;
            
        }

    }

    public double withdrawMoney(double money) {
        if (money<=0) {
           System.out.println("Invalid Withdraw");
        } else if (balance>= money) {
           balance-=money;
        } else {
            money = balance;
            balance = 0;
        }

        return money;
    }
}

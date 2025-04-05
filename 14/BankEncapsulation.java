
class BankAccount {

    private long accountNumber;
    private String customerName;
    private double balance;
    private boolean isActive;
    

    public BankAccount(long accNo, String name, double initialBalance) {
        this.accountNumber = accNo;
        this.customerName = name;
        this.balance = initialBalance;
        this.isActive = true;
    }
    

    public long getAccountNumber() { return accountNumber; }
    
    public String getCustomerName() { return customerName; }
    
    public double getBalance() { return balance; }
    
    public boolean isActive() { return isActive; }
    

    public void deposit(double amount) {
        if (amount > 0 && isActive) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount or account inactive");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance && isActive) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal: insufficient funds or account inactive");
        }
    }
    

    public void closeAccount() {
        isActive = false;
        System.out.println("Account closed successfully");
    }
}

public class BankEncapsulation {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(98765432, "Santhosh A", 5000.0);
        
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Customer Name: " + myAccount.getCustomerName());
        System.out.println("Initial Balance: " + myAccount.getBalance());
        
        myAccount.deposit(2500.0);
        myAccount.withdraw(1000.0);
        myAccount.withdraw(10000.0); 
        
        myAccount.closeAccount();
        myAccount.deposit(1000.0); 
    }
}
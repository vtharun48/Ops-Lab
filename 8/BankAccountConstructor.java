

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    
    public BankAccount() {
        accountNumber = "Not assigned";
        accountHolderName = "Not assigned";
        balance = 0.0;
        System.out.println("Default constructor called");
    }
    

    public BankAccount(String accNumber, String accName, double initialBalance) {
        accountNumber = accNumber;
        accountHolderName = accName;
        balance = initialBalance;
        System.out.println("Parameterized constructor called");
    }
    

    public void displayAccount() {
        System.out.println("Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }
}

public class BankAccountConstructor {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.displayAccount();
        
        System.out.println();
        
        BankAccount account2 = new BankAccount("AC1001", "John Doe", 1000.0);
        account2.displayAccount();
    }
}
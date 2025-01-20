public class BankAccount {
    private static String bankName = "Example Bank";
    private static int totalAccounts = 0; 

    private String accountHolderName; 
    private final String accountNumber; 

    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName; 
        this.accountNumber = accountNumber; 
        totalAccounts++; 
    }

    public static int getTotalAccounts() {
        return totalAccounts; 
    }

    public void displayDetails() {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + this.accountHolderName);
            System.out.println("Account Number: " + this.accountNumber);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Rishika Bisht", "45671254");
        if(account1 instanceof BankAccount){
            System.out.println("account1 is an instance of the BankAccount class");
        }else{
            System.out.println("account1 is an instance of the BankAccount class");
        }
        account1.displayDetails();
        System.out.println("Total accounts: " + BankAccount.getTotalAccounts());
        
        BankAccount account2 = new BankAccount("Vansh Bisht", "987654321");
        if(account2 instanceof BankAccount){
            System.out.println("account2 is an instance of the BankAccount class");
        }else{
            System.out.println("account2 is an instance of the BankAccount class");
        }
        account2.displayDetails();
        System.out.println("Total accounts: " + BankAccount.getTotalAccounts());
    }
}

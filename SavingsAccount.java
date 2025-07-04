class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.025;
    private static final double MIN_BALANCE = 1000;

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    
    public void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from Savings Account.");
        } else {
            System.out.println("Cannot withdraw. Minimum balance of 1000 required.");
        }
    }

    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Savings Account.");
    }

    public void transfer(Account toAccount, double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            toAccount.deposit(amount);
            System.out.println("Transferred " + amount + " to " + toAccount.getAccountHolder());
        } else {
            System.out.println("Cannot transfer. Minimum balance of 1000 required.");
        }
    }

    
    public void addInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Interest added to Savings Account: " + interest);
    }
}

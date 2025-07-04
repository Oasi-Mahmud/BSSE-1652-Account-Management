class DepositPremiumAccount extends Account {
    private static final double INTEREST_RATE = 0.07;
    private static final int REQUIRED_INSTALLMENTS = 5;
    private int installmentCount = 0;

    public DepositPremiumAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    
    public void withdraw(double amount) {
        if (installmentCount >= REQUIRED_INSTALLMENTS) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn " + amount + " from Deposit Premium Account.");
            } else {
                System.out.println("Insufficient balance in Deposit Premium Account.");
            }
        } else {
            System.out.println("Cannot withdraw before completing all 5 installments.");
        }
    }

    
    public void deposit(double amount) {
        balance += amount;
        installmentCount++;
        System.out.println("Installment " + installmentCount + " deposited: " + amount);
    }

    
    public void transfer(Account toAccount, double amount) {
        System.out.println("Transfer not allowed from Deposit Premium Account.");
    }

    
    public void addInterest() {
        if (installmentCount >= REQUIRED_INSTALLMENTS) {
            double interest = balance * INTEREST_RATE;
            balance += interest;
            System.out.println("Interest added to Deposit Premium Account: " + interest);
        } else {
            System.out.println("Interest not added. All installments not completed.");
        }
    }
}

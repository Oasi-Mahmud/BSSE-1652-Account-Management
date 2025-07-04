class CurrentAccount extends Account {
    public CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from Current Account.");
        } else {
            System.out.println("Insufficient balance in Current Account.");
        }
    }

    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Current Account.");
    }

    
    public void transfer(Account toAccount, double amount) {
        if (amount <= balance) {
            balance -= amount;
            toAccount.deposit(amount);
            System.out.println("Transferred " + amount + " to " + toAccount.getAccountHolder());
        } else {
            System.out.println("Insufficient balance for transfer.");
        }
    }

    
    public void addInterest() {
    }
}

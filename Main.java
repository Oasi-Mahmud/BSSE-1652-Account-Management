public class Main {
    public static void main(String[] args) {
        CurrentAccount ca = new CurrentAccount("Alice", 5000);
        SavingsAccount sa = new SavingsAccount("Bob", 2000);
        DepositPremiumAccount dpa = new DepositPremiumAccount("Charlie", 0);

        ca.transfer(sa, 1000);        
        sa.transfer(ca, 500);         
        sa.withdraw(600);             
        sa.withdraw(500);             

        dpa.deposit(1000);            
        dpa.deposit(1000);            
        dpa.withdraw(500);            
        dpa.deposit(1000);            
        dpa.deposit(1000);            
        dpa.deposit(1000);            

        dpa.withdraw(500);            
        dpa.addInterest();            
    }
}

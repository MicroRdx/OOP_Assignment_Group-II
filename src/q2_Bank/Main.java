package q2_Bank;
public class Main {
    public static void main(String[] args) {
        //Declaring objects each class
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();
        
        // Depositing amount in each object(Bank)
        bankA.deposit(100);
        bankB.deposit(150);
        bankC.deposit(200);
        
        //Printing the balances.
        System.out.println("Bank A - Balance : $" + bankA.getBalance());
        System.out.println("Bank B - Balance : $" + bankB.getBalance());
        System.out.println("Bank C - Balance : $" + bankC.getBalance());
    }

}
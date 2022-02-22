package q2_Bank;
class BankB extends Bank {
    private int balance;
    void deposit(int amount) {
        balance += amount;
    }
    @Override
    int getBalance() {
        return balance;
    }
}
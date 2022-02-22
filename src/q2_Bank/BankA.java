package q2_Bank;
class BankA extends Bank {
    private int balance;
    void deposit(int amount) {
        balance += amount;
    }
    @Override
    int getBalance() {
        return balance;
    }
}
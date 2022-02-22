package q2_Bank;
class BankC extends Bank {
    private int balance;
    void deposit(int amount) {
        balance += amount;
    }
    @Override
    int getBalance() {
        return balance;
    }

}
class BankAccount {
    String accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit: " + amount);
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdraw: " + amount);
    }
}

class SavingsAccount extends BankAccount {
}

class CreditAccount extends BankAccount {
}
package bank;
import java.util.*;

class Bank {
    List<Account> accounts = new ArrayList<>();

    void createAccount(int accNo, String name, double balance) {
        accounts.add(new Account(accNo, name, balance));
        System.out.println("Account Created Successfully!");
    }

    void deposit(int accNo, double amount) {
        for (Account acc : accounts) {
            if (acc.accNo == accNo) {
                acc.balance += amount;
                System.out.println("Money Deposited!");
                return;
            }
        }
        System.out.println("Account not found!");
    }

    void withdraw(int accNo, double amount) {
        for (Account acc : accounts) {
            if (acc.accNo == accNo) {
                if (acc.balance >= amount) {
                    acc.balance -= amount;
                    System.out.println("Withdrawal Successful!");
                } else {
                    System.out.println("Insufficient Balance!");
                }
                return;
            }
        }
        System.out.println("Account not found!");
    }

    void checkBalance(int accNo) {
        for (Account acc : accounts) {
            if (acc.accNo == accNo) {
                System.out.println("Balance: " + acc.balance);
                return;
            }
        }
        System.out.println("Account not found!");
    }
}
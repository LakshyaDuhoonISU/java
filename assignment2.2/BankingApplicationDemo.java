// Q9
// WAP for BankingApplicationDemo.
// Create a class Account which has following:
// • Instance variables:
// • int accountNo,
// • double balance
// • Methods:
// • void deposit(double amt)
// • void withdraw(double amt)
// Create your own custom exception named as
// “InsufficientFundsException” If amt to be withdrawn is greater than
// balance, then throw “InsufficientFundsException” and display appropriate message.

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

class Account {
    int accountNo;
    double balance;

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) throws InsufficientFundsException {
        if (amt > balance) {
            throw new InsufficientFundsException("Insufficient funds");
        }
        balance -= amt;
    }
}

public class BankingApplicationDemo {
    public static void main(String[] args) {
        Account account = new Account();
        account.accountNo = 123;
        account.balance = 1000;

        try {
            account.withdraw(2000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}

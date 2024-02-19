import java.util.Scanner;

class Account {
    String customerName;
    int accountNumber;
    String accountType;
    double balance;

    Account(String name, int accNo, String accType, double initialBalance) {
        customerName = name;
        accountNumber = accNo;
        accountType = accType;
        balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful.");
    }

    void displayBalance() {
        System.out.println("Balance: $" + balance);
    }
}

class CurAcct extends Account {
    double minBalance;
    double serviceCharge;

    CurAcct(String name, int accNo, String accType, double initialBalance, double minBal, double charge) {
        super(name, accNo, accType, initialBalance);
        minBalance = minBal;
        serviceCharge = charge;
    }

    void withdraw(double amount) {
        if (balance - amount >= minBalance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    void deductServiceCharge() {
        if (balance < minBalance) {
            balance -= serviceCharge;
            System.out.println("Service charge of $" + serviceCharge + " applied due to balance below minimum.");
        }
    }
}

class SavAcct extends Account {
    double interestRate;

    SavAcct(String name, int accNo, String accType, double initialBalance, double interest) {
        super(name, accNo, accType, initialBalance);
        interestRate = interest;
    }

    void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest of $" + interest + " added.");
    }

    void withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}

class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Creating savings account
        SavAcct savings = new SavAcct("John Doe", 123456, "Savings", 1000, 5); // 5% interest rate
        
        // Creating current account
        CurAcct current = new CurAcct("Jane Doe", 654321, "Current", 2000, 500, 10); // $500 minimum balance, $10 service charge
        
        System.out.println("Welcome to our bank!");
        
        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Display Balance\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    System.out.print("Select account (1 for Savings, 2 for Current): ");
                    int accountChoice = scanner.nextInt();
                    if (accountChoice == 1)
                        savings.deposit(depositAmount);
                    else if (accountChoice == 2)
                        current.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    System.out.print("Select account (1 for Savings, 2 for Current): ");
                    accountChoice = scanner.nextInt();
                    if (accountChoice == 1)
                        savings.withdraw(withdrawAmount);
                    else if (accountChoice == 2) {
                        current.withdraw(withdrawAmount);
                        current.deductServiceCharge(); // Check if service charge is applicable
                    }
                    break;
                case 3:
                    System.out.print("Select account (1 for Savings, 2 for Current): ");
                    accountChoice = scanner.nextInt();
                    if (accountChoice == 1)
                        savings.displayBalance();
                    else if (accountChoice == 2)
                        current.displayBalance();
                    break;
                case 4:
                    System.out.println("Thank you for banking with us!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

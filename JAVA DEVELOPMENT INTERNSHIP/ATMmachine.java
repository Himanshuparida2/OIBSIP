import java.util.*;

interface ATM {
    double withdraw(double amount);
    double deposit(double amount);
    void checkBalance();
    void checkTransaction();
}

public class ATMmachine implements ATM {
    private double balance;
    private ArrayList<Integer> transactions; 
    private int accountNumber;

    public ATMmachine(int initialBalance) {
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
    }

    @Override
    public double withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            System.out.println("\nRs." + amount + " has been withdrawn from Your Bank Account " + accountNumber + "\n");
            balance -= amount;
            transactions.add(-((int) amount));
        } else {
            System.out.println("Insufficient Balance or invalid amount");
        }
        return balance;
    }

    @Override
    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("\nRs." + amount + " has Successfully Deposited in Your Bank Account " + accountNumber + "\n");
            transactions.add((int) amount); 
        } else {
            System.out.println("Invalid amount");
        }
        return balance;
    }

    @Override
    public void checkBalance() {
        System.out.println("Your Bank Account " + accountNumber + " has a balance of Rs. " + balance);
    }

    @Override
    public void checkTransaction() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions yet.");
            return;
        }
        for (int transaction : transactions) {
            if (transaction < 0) {
                System.out.println((-transaction) + " has been withdrawn from account " + accountNumber);
            } else {
                System.out.println(transaction + " has been deposited in your bank account " + accountNumber);
            }
        }
    }

    public void setAccountNumber(int accountNumber2) {
        accountNumber=accountNumber2;
    }
}

class UserBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        sc.nextLine();
        Random random = new Random();
        int accountNumber = random.nextInt(900000) + 100000;
        ATMmachine userAccount = new ATMmachine(1000);
        userAccount.setAccountNumber(accountNumber);
        int choice = 0;
        while (choice != 5) {
            System.out.println("---------------------------------------------");
            System.out.println("Choose Your Option");
            System.out.println("Press 1 : Withdraw");
            System.out.println("Press 2 : Deposit");
            System.out.println("Press 3 : Check Balance");
            System.out.println("Press 4 : Check Transaction History");
            System.out.println("Press 5 : Exit");
            System.out.println("---------------------------------------------");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Amount: ");
                    double amountToWithdraw = sc.nextDouble();
                    userAccount.withdraw(amountToWithdraw);
                    break;
                case 2:
                    System.out.println("Enter Amount: ");
                    double amountToDeposit = sc.nextDouble();
                    userAccount.deposit(amountToDeposit);
                    break;
                case 3:
                    System.out.println();
                    userAccount.checkBalance();
                    break;
                case 4:
                    System.out.println();
                    userAccount.checkTransaction();
                    break;
                default:
                    System.out.println("\nThank you!!!");
            }
        }
        System.out.println("---------------------------------------------");
        sc.close();
    }
}


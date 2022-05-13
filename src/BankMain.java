import java.util.ArrayList;
import java.util.Scanner;

public class BankMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BankAccount> list = new ArrayList<>();

        BankAccount accountOne = new BankAccount("Winry", 500336, 5000);
        BankAccount accountTwo = new BankAccount("Alphonse", 5000369, 5600);
        BankAccount accountThree = new BankAccount("Edward", 300369, 56900);
        list.add(accountOne);
        list.add(accountTwo);
        list.add(accountThree);

        System.out.println("Welcome to the Bank of Elizabeth");

        while (true) {
            System.out.println("Are you an existing customer? (-1 to exit)");
            System.out.println("1. Yes");
            System.out.println("2. No");

            int input =  Integer.valueOf(scanner.nextLine());

            if (input == 1) {
                System.out.println("What account number would you like to access?");
                int accountNumber = Integer.valueOf(scanner.nextLine());


                boolean found = false;
                int index = -1;
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getAcctNumber() == accountNumber) {
                        found = true;
                        index = i;
                    }
                }

                if (!found) {
                    System.out.println("Account not found");
                } else if (found && index >= 0) {
                    mainMenu(list.get(index));
                } else {
                    System.out.println("Error");
                }

            } else if (input == 2) {
                System.out.println("Let's make a new account!");
                BankAccount newAcct = new BankAccount();

                System.out.println("What is the name for the account?");
                String accountName = scanner.nextLine();
                newAcct.setName(accountName);

                System.out.println("What is the beginning balance for the account?");
                double accountBalance = Double.valueOf(scanner.nextLine());
                newAcct.setBalance(accountBalance);

                list.add(newAcct);
                mainMenu(list.get((list.size()) - 1));
            } else if (input == -1) {
                System.out.println("Goodbye");
                break;
            }
        }
    }

    public static void mainMenu(BankAccount acct) {

        ArrayList<BankAccount> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello " + acct.getName() + ", welcome to the main menu.");

        while (true) {
            System.out.println("1.To check account balance" + "\n"
                    + "2.To make a withdraw" + "\n"
                    + "3.To make a deposit" + "\n"
                    + "4.To make a transfer to another account" + "\n"
                    + "0.To exit");

            int choice = Integer.valueOf(scanner.nextLine());

            if (choice == 1) {
                System.out.println(acct.getBalance());
            } else if (choice == 2) {
                System.out.println("Enter an amount to withdraw:");
                double withdrawalAmount =  Double.valueOf(scanner.nextLine());
                acct.withdrawal(withdrawalAmount);
                System.out.println("New balance: " + acct.getBalance());
            } else if (choice == 3) {
                System.out.println("Enter an amount to deposit:");
                double depositAmount = Integer.valueOf(scanner.nextLine());
                acct.deposit(depositAmount);
                System.out.println("New balance: " + acct.getBalance());
            } else if (choice == 4) {
                System.out.println("Enter the account number you would like to transfer to:");
                int targetAcct = Integer.parseInt(scanner.nextLine());

                boolean found = false;
                int index = -1;
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getAcctNumber() == targetAcct) {
                        found = true;
                        index = i;
                    }
                }

                if (!found) {
                    System.out.println("Account not found");
                } else if (found && index >= 0) {
                    System.out.println("Account located. What amount would you like to transfer?");
                    double transferAmount = Double.valueOf(scanner.nextLine());
                    acct.transfer(list.get(index), transferAmount);
                    System.out.println("Transfer of $" + transferAmount
                            + " from " + acct.getName()
                            + " to " + list.get(index).getName()
                            + " complete.");
                } else {
                    System.out.println("Error");
                }
            } else if (choice == 0) {
                break;
            }
        }
    }
}
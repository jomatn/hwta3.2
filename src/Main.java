import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws LimitException {
        BankAccount bankAccount = new BankAccount(15000);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Initial balance: " + bankAccount.getAmount());
        try {
            while (true) {
                System.out.println("Attempting to withdraw 6000 som...");
                bankAccount.withDraw(6000);
                System.out.println("Withdrawal successful. Updated balance: " + bankAccount.getAmount());
            }

        } catch (LimitException e) {
            System.out.println("LimitException: " + e.getMessage());
            System.out.println("Remaining amount on the account: " + e.getRemainingAmount());
            bankAccount.withDraw(bankAccount.getAmount());
            System.out.println("Remaining amount after withdrawal: " + bankAccount.getAmount());
        }
    }
}
//
//        try {
//            while (true) {
//                System.out.println("Do you want to withdraw money? (yes/no): ");
//                String userInput = scanner.nextLine().toLowerCase();
//
//                if (userInput.equals("yes")) {
//                    System.out.println("Enter the withdrawal amount: ");
//                    if (scanner.hasNextDouble()) {
//                        double withdrawAmount = scanner.nextDouble();
//                        scanner.nextLine();
//                        bankAccount.withDraw(withdrawAmount);
//                        System.out.println("Withdrawal successful. Updated balance: " + bankAccount.getAmount());
//                    } else {
//                        System.out.println("Invalid input. Please enter a valid number.");
//                        scanner.nextLine();
//                    }
//                } else if (userInput.equals("no")) {
//                    System.out.println("Do you want to input money? (yes/no): ");
//                    String userInput2 = scanner.nextLine().toLowerCase();
//
//                    if (userInput2.equals("yes")) {
//                        System.out.println("Enter the deposit amount: ");
//                        if (scanner.hasNextDouble()) {
//                            double depositAmount = scanner.nextDouble();
//                            scanner.nextLine();
//                            bankAccount.deposit(depositAmount);
//                            System.out.println("Deposit successful. Updated balance: " + bankAccount.getAmount());
//                        } else {
//                            System.out.println("Invalid input. Please enter a valid number.");
//                            scanner.nextLine();
//                        }
//                    }
//                } else {
//                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
//                }
//            }
//        } catch (LimitException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//        }

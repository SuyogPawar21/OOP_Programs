package OOP_Programs.Strategy;

import java.util.Scanner;

public class Bitcoin implements PaymentSystem {

    private int balance;
    private int walletId;

    public Bitcoin() {
        walletId = Integer.parseInt(takeInput("Enter Wallet Id: ", "Invalid Input", "[0-9]{0,8}"));
        balance = Integer.parseInt(takeInput("Enter Starting Balance: ", "Invalid Input", "[1-9]+[0-9]{0,9}"));
    }

    public boolean makePayment(int amount) {
        if (amount > balance) {
            return false;
        }
        else {
            balance -= amount;
            return true;
        }
    }

    public void printReceipt(int amount) {
        System.out.println("\nTransaction Details\nWallet Id: " + walletId +
         "\nAmount Paid: " + amount + "\nBalance Remaining: " + balance);
    }

    public static String takeInput(String messageToPrint, String invalidMessage, String regex) {
        Scanner scan = new Scanner(System.in);
        String input;

        do{
            System.out.print(messageToPrint);
            input = scan.nextLine();
        } while(!input.matches(regex));

        return input;
    }
    
}

package OOP_Programs.Strategy;

import java.util.Scanner;

public class CreditCard implements PaymentSystem {

    private String cardNumber;
    private int balance;

    public CreditCard() {
        cardNumber = takeInput("Enter Credit Card Number: ", "Invalid Input", "[0-9]{6,13}");
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
        System.out.println("\nTransaction Details\nCredit Card Number: " + cardNumber +
         "\nAmount Paid: " + amount + "\nBalance Remaining: " + balance);
    }
    
    public static String takeInput(String messageToPrint, String invalidMessage, String regex) {
        Scanner scan = new Scanner(System.in);
        String input;

        do {
            System.out.print(messageToPrint);
            input = scan.nextLine();
        } while(!input.matches(regex));

        return input;
    } 
}

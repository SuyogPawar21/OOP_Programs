package OOP_Programs.Strategy;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        PaymentSystem paymentsystem = null;
        int choiceMainMenu, amount;

        loop:
        do {
            choiceMainMenu = Integer.parseInt(takeInput("\nShopping Cart Checkout\n1. PayPal\n2. Credit Card\n3. Bitcoin\n4. Exit\n" +
            "Enter your choice: ", "Invalid Input", "[1234]"));

            switch (choiceMainMenu) {
                case 1:
                paymentsystem = new PayPal();
                break;
                
                case 2:
                paymentsystem = new CreditCard();
                break;

                case 3:
                paymentsystem = new Bitcoin();
                break;

                case 4:
                    break loop;
            }
            
            amount = Integer.parseInt(takeInput("Enter amount to be paid: ", "Invalid Input", "[0-9]{0,8}"));
            boolean successful = paymentsystem.makePayment(amount);

            if (successful) {
                paymentsystem.printReceipt(amount);
            }
            else {
                System.out.println("Payment unsuccessful");
            }

        } while (choiceMainMenu != 4);
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

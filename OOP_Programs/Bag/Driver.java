package OOP_Programs.Bag;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Item[] bag = new Item[30];
        int choiceMainMenu, choiceInsertMenu;
        String color;
        double weight;

        do {

            System.out.print("\nTotal Number of Items: " + Item.getCount() + "  " +
             "Total Weight of Items: " + Item.getTotalWeight() +
            "\nMenu\n1. Insert item\n2. Delete item\n3. Display\n4. Exit\nEnter your choice: ");
            choiceMainMenu = Integer.parseInt(scan.nextLine());

            switch (choiceMainMenu) {

                case 1:
                System.out.print("How many parameters are you going to provide?\n" + 
                "1. Only Color\n2. Only Weight\n3. Both\n4. None" + 
                "\nEnter your choice: ");
                choiceInsertMenu = Integer.parseInt(scan.nextLine());
                
                switch (choiceInsertMenu) {

                    case 1:
                    color = takeInput("Enter Color: ", "Invalid Input", "[a-zA-Z]+");
                    bag[Item.getCount()] = new Item(color);
                    break;

                    case 2:
                    weight = Double.parseDouble(takeInput("Enter Weight: ", "Invalid Input", "[0-9]+[.]{0,1}[0-9]*"));
                    bag[Item.getCount()] = new Item(weight);
                    break;

                    case 3:
                    color = takeInput("Enter Color: ", "Invalid Input", "[a-zA-Z]+");
                    weight = Double.parseDouble(takeInput("Enter Weight: ", "Invalid Input", "[0-9]+[.]{0,1}[0-9]*"));
                    bag[Item.getCount()] = new Item(color, weight);
                    break;

                    case 4:
                    bag[Item.getCount()] = new Item();
                    break;

                    default:
                    System.out.println("Invalid Input");
                    break;
                }
                System.out.println("");
                break;

                case 2:

                if (Item.getCount() == 0) {
                    System.out.println("Can't delete, bag is empty");
                }

                else {      
                    Item.setTotalWeight(Item.getTotalWeight() - bag[Item.getCount() - 1].getWeight());
                    Item.setCount(Item.getCount() - 1);
                    bag[Item.getCount()] = null;
                    System.out.println("Last Item Deleted");
                }
                break;

                case 3:

                if (Item.getCount() == 0) {
                    System.out.println("Bag is Empty");
                }

                for (int i = 0; i < Item.getCount(); i++) {
                    System.out.println(i + 1 + ". " + bag[i]);
                }
                break;

                case 4:
                break;

                default:
                System.out.println("Invalid Input");
                break;

            }

        } while(choiceMainMenu != 4);

        scan.close();
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

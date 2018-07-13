import java.util.Random;
import java.util.Scanner;

public class SimpleInvoiceApp {

    // Inside of the main method to interact with the console
    public static void main(String[] args) {

        // Declare and initialize the scanner to accept user input
        Scanner sc = new Scanner(System.in);

        // Declare and initialize the random class to generate a number
        Random rnd = new Random();

        // Declaring variables needed for user input
        String itemName01, itemName02;
        int itemQuantity01, itemQuantity02;
        double itemPrice01, itemPrice02;

        // Declaring variables needed to store computations
        double itemCost01, itemCost02;
        double totalAmount;

        // Storing the first item's name into itemName01
        // Uses .next() because it is expecting a text value
        System.out.println("Enter your item #1: ");
        itemName01 = sc.next();

        // Storing the first item's price into itemPrice01
        // Uses .nextDouble() because it is expecting a numerical value with decimals
        System.out.println("Enter your price #1: ");
        itemPrice01 = sc.nextDouble();

        // Storing the first item's quantity into itemQuantity01
        // Uses .nextInt() because it is expecting a numerical value
        /*
        System.out.println("Enter your quantity #1: ");
        itemQuantity01 = sc.nextInt();
        */

        // Using Random # Generator
        itemQuantity01 = 1 + rnd.nextInt(10);

        System.out.println("Enter your item #2: ");
        itemName02 = sc.next();

        System.out.println("Enter your price #2: ");
        itemPrice02 = sc.nextDouble();

        /*
        System.out.println("Enter your quantity #2: ");
        itemQuantity02 = sc.nextInt();
        */
        itemQuantity02 = 1 + rnd.nextInt(10);

        itemCost01 = itemPrice01 * itemQuantity01;
        itemCost02 = itemPrice02 * itemQuantity02;
        totalAmount = itemCost01 + itemCost02;

        System.out.println("****************************************");
        System.out.println("Item Name" + "\t" + "Price" + "\t" + "Quantity" +  "\t" + "Cost");
        System.out.println(itemName01 + "\t\t$" + itemPrice01 + "\t\t" + itemQuantity01 + "\t\t$" + itemCost01);
        System.out.println(itemName02 + "\t\t$" + itemPrice02 + "\t\t" + itemQuantity02 + "\t\t$" + itemCost02);
        System.out.println("----------------------------------------");
        System.out.println("Total Purchase Amount: $" + totalAmount);

        if (totalAmount > 20) {
            System.out.println("\nYou spent too much today...");
        }
        else {
            System.out.println("\nThank you for shopping at my market!");
        }


    }

}

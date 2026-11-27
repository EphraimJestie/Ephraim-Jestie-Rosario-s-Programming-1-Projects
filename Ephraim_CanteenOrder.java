import java.util.*;

public class Ephraim_CanteenOrder {
 public static void main(String[] args) {

 Scanner input = new Scanner(System.in);

 String[] menu = 
 {
 "Adobo Rice",
 "Pancit Canton",
 "Burger",
 "Spaghetti",
 "Iced Tea"
 };

 int[] prices = {75, 55, 60, 65, 25};

 String[] orderedItems = new String[3];

 int count = 0;
 int subtotal = 0;

 System.out.println("=== UDD CANTEEN ===");

 for (int i = 0; i < menu.length; i++) {
 System.out.println((i + 1) + ". " + menu[i] + " - PHP " + prices[i]);
 }

 System.out.println("");
 System.out.println("You can order 3 items.");


 while (count < 3) {

 System.out.print("Enter item number (1-5): ");
 int choice = input.nextInt();

 int index = choice - 1;

 if (index >= 0 && index < 5) {

 orderedItems[count] = menu[index];

 subtotal = subtotal + prices[index];

 System.out.println("Added: " + menu[index] + " - PHP " + prices[index]);

 count++;

 } else {
 System.out.println("Invalid item! Please choose from 1 to 5.");
 }
 }

 double discount = 0;

 if (subtotal >= 200) {
 discount = subtotal * 0.10;
 System.out.println("");
            System.out.println("You got a 10% discount!");
            System.out.println("");

        } else if (subtotal >= 150) {
            discount = subtotal * 0.05;
            System.out.println("");
            System.out.println("You got a 5% discount!");
            System.out.println("");

        } else {
            System.out.println("");
            System.out.println("No discount applied.");
            System.out.println("");
        }

        double amountDue = subtotal - discount;
        
        System.out.println("");
        System.out.println("=== RECEIPT ===");

        for (String item : orderedItems) {
            System.out.println("- " + item);
        }

        System.out.println("Subtotal: PHP " + subtotal);
        System.out.println("Discount: PHP " + discount);
        System.out.println("Amount Due: PHP " + amountDue);
        System.out.println("");

        System.out.print("Enter cash: PHP ");
        double cash = input.nextDouble();

        if (cash >= amountDue) 
        {

            double change = cash - amountDue;

            System.out.println("Change: PHP " + change);
            System.out.println("Thank you! Enjoy your meal.");

        } else {

            double lacking = amountDue - cash;

            System.out.println("Insufficient cash! You need PHP " + lacking + " more.");
        }

        input.close();
    }
}